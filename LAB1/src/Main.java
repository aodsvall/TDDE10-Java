
public class Main {

	public static void main(String[] args) {
		
		Animal Dog = new Dog("Vilma", 18);
		Animal Cat  = new Cat("Kurre", 12);
		Animal Bird = new Bird("Pippi", 15);
		Animal Butterfly = new Butterfly("Bella", 6);
		
		
		System.out.println("===Djuren presenterar sig själva===");
		Dog.introduceYourself();
		Cat.introduceYourself();
		Bird.introduceYourself();
		Butterfly.introduceYourself();
		
		
		Animal allAnimals[] = new Animal[4];
	    allAnimals[0] = Cat;
	    allAnimals[1] = Dog;
	    allAnimals[2] = Bird;
	    allAnimals[3] = Butterfly;
	    
	    
	    System.out.println("===Djuren visar sina läten===");
	    for(int i = 0; i < allAnimals.length; i ++) {
	    	Dog.makeSound();
	    }
	    

	}

}
