
class Bird extends Animal {
	
	String sound = "Pip pip";
	
	Bird(String name, int birthyear) {
		super(name, birthyear);
	}

	public void introduceYourself() {
		System.out.println("Pip pip. Jag �r en f�gel som heter " + this.name);
		System.out.println("Jag �r " + (2021 - this.birthyear) + " �r gammal");	}

	public void makeSound() {
		System.out.print(this.name + " s�ger. ");
		System.out.println(sound);
	}

	public void fly() {
		System.out.println("Jag kan flyga, flax flax!!");
	}

}
