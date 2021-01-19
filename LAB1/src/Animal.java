
public abstract class Animal {

	String name;
	int birthyear;

	Animal(String name, int birthyear) {
		this.name = name;
		this.birthyear = birthyear;

	}

	public abstract void introduceYourself();

	public abstract void makeSound();

	public abstract void fly();
}
