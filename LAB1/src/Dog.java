
class Dog extends Animal {

	String sound = "Vov, vov, vov!!";
	
	Dog(String name, int age) {
		super(name, age);

	}

	public void introduceYourself() {
		System.out.println("Vov. Jag �r en hund som heter " + this.name);
		System.out.println("Jag �r " + this.age + " �r gammal");
	}

	public void makeSound() {
		System.out.println(this.name + " s�ger. ");
		System.out.println(sound);
	}

	public void fly() {
		System.out.println("Jag kan inte flyga.");

	}

}
