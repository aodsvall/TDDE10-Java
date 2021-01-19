
class Dog extends Animal {

	String sound = "Vov, vov, vov!!";
	
	Dog(String name, int birthyear) {
		super(name, birthyear);
	}

	public void introduceYourself() {
		System.out.println("Vov. Jag är en hund som heter " + this.name);
		System.out.println("Jag är " + (2021 - this.birthyear) + " år gammal");
	}

	public void makeSound() {
		System.out.print(this.name + " säger. ");
		System.out.println(sound);
	}

	public void fly() {
		System.out.println("Jag kan inte flyga.");
	}

}
