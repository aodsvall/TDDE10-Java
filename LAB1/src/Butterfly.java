
class Butterfly extends Animal {
	
	
	
	Butterfly(String name, int age) {
		super(name, age);
	}

	public void introduceYourself() {
		System.out.println("Jag �r en fj�ril som heter " + this.name);
		System.out.println("Jag �r " + this.age + " �r gammal");
		
	}

	public void makeSound() {
		System.out.println("");
	}

	public void fly() {
		
	}

}
