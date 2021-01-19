
class Bird extends Animal {
	
	String sound = "PIip pip";
	
	Bird(String name, int age) {
		super(name, age);
	}

	public void introduceYourself() {
		System.out.println("Pip pip. Jag är en fågel som heter " + this.name);
		System.out.println("Jag är " + this.age + " år gammal");
	}

	public void makeSound() {
		System.out.println(sound);
	}

	public void fly() {
		
	}

}
