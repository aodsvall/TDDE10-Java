
class Butterfly extends Animal {
	
	
	
	Butterfly(String name, int age) {
		super(name, age);
	}

	public void introduceYourself() {
		System.out.println("Jag är en fjäril som heter " + this.name);
		System.out.println("Jag är " + this.age + " år gammal");
		
	}

	public void makeSound() {
		System.out.println("");
	}

	public void fly() {
		
	}

}
