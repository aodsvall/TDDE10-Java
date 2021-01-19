package Labbar;

import java.util.*;

public class Lab0 {

	
	public static boolean isValidPNR(String personNumber) {
		
		int result = 0;
		int sum = 0;
		int stringLength = 10;
		
		if (lengthOfString(personNumber, stringLength)) {
		
		for(int i = 0; i < 10; i ++) {
		
		char c = personNumber.charAt(i);
		Character.digit(c, 10);
		int number = Character.digit(c, 10);
		if(i % 2 == 0) {
			number = number * 2;
		}
		else {
			number = number * 1;
		}
		if(number > 9) {
			int firstDigit = number / 10;
			int secondDigit = number - 10;
			
			result = firstDigit + secondDigit;
			number = result;
			}	
		sum = sum + number;
		}
		System.out.println(sum);
		if(sum % 2 == 0) { 
			System.out.println(sum / 10);
			return true;
			}
		}
		return false;	
	}

	public static boolean lengthOfString(String personNumber, int stringLength) {
		if(stringLength != personNumber.length()) {
		System.out.println("Hoppsan, detta är inte ett personnummer, fel längd!");
		System.exit(0);		
		}
		return true;
	}

	    public static void main(String[] args) {
	        
	    	System.out.println("Skriv in ett personnummer för testning");
	    	Scanner scan = new Scanner(System.in);
	    	String personNumber = scan.nextLine();
	    	
	        if (isValidPNR(personNumber)) {
	            System.out.println("Giltigt nummer.");
	        } else {
	            System.out.println("Ej ett giltigt nummer.");
	        }
	        scan.close();
	    }
	}
