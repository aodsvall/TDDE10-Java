
class Butterfly extends Animal {
	
	
	
	Butterfly(String name, int birthyear) {
		super(name, birthyear);
	}

	public void introduceYourself() {
		System.out.println("Jag �r en fj�ril som heter " + this.name);
		System.out.println("Jag �r " + (2021 - this.birthyear) + " �r gammal");		
	}

	public void makeSound() {
		System.out.print(this.name + " s�ger. ");
		System.out.println("");
	}

	public void fly() {
		System.out.println("Jag kan flyga, flax flax!!");
	}

}
