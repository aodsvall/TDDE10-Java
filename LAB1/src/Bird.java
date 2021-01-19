
class Bird extends Animal {
	
	String sound = "Pip pip";
	
	Bird(String name, int birthyear) {
		super(name, birthyear);
	}

	public void introduceYourself() {
		System.out.println("Pip pip. Jag är en fågel som heter " + this.name);
		System.out.println("Jag är " + (2021 - this.birthyear) + " år gammal");	}

	public void makeSound() {
		System.out.print(this.name + " säger. ");
		System.out.println(sound);
	}

	public void fly() {
		System.out.println("Jag kan flyga, flax flax!!");
	}

}
