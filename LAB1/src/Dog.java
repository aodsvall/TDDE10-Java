
class Dog extends Animal {

	String sound = "Vov, vov, vov!!";
	
	Dog(String name, int birthyear) {
		super(name, birthyear);
	}

	public void introduceYourself() {
		System.out.println("Vov. Jag �r en hund som heter " + this.name);
		System.out.println("Jag �r " + (2021 - this.birthyear) + " �r gammal");
	}

	public void makeSound() {
		System.out.print(this.name + " s�ger. ");
		System.out.println(sound);
	}

	public void fly() {
		System.out.println("Jag kan inte flyga.");
	}

}
