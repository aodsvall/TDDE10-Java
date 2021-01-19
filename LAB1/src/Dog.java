
class Dog extends Animal {

	String sound = "Vov, vov, vov!!";
	
	Dog(String name, int age) {
		super(name, age);

	}

	public void introduceYourself() {
		System.out.println("Vov. Jag är en hund som heter " + this.name);
		System.out.println("Jag är " + this.age + " år gammal");
	}

	public void makeSound() {
		System.out.println(this.name + " säger. ");
		System.out.println(sound);
	}

	public void fly() {
		System.out.println("Jag kan inte flyga.");

	}

}
