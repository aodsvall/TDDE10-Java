
class Bird extends Animal {
	
	String sound = "PIip pip";
	
	Bird(String name, int age) {
		super(name, age);
	}

	public void introduceYourself() {
		System.out.println("Pip pip. Jag �r en f�gel som heter " + this.name);
		System.out.println("Jag �r " + this.age + " �r gammal");
	}

	public void makeSound() {
		System.out.println(sound);
	}

	public void fly() {
		
	}

}
