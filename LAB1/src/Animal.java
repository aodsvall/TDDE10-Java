
public abstract class Animal {

	String name;
	int age;

	Animal(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public abstract void introduceYourself();

	public abstract void makeSound();

	public abstract void fly();
}
