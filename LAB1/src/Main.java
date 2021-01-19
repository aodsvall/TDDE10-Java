
public class Main {

	public static void main(String[] args) {

		Animal Dog = new Dog("Vilma", 2012);
		Animal Cat = new Cat("Kurre", 2007);
		Animal Bird = new Bird("Pippi", 2001);
		Animal Butterfly = new Butterfly("Bella", 1999);

		System.out.println("===Djuren presenterar sig själva===");
		Dog.introduceYourself();
		Cat.introduceYourself();
		Bird.introduceYourself();
		Butterfly.introduceYourself();

		Animal allAnimals[] = new Animal[4];
		allAnimals[0] = Cat;
		allAnimals[1] = Dog;
		allAnimals[2] = Bird;
		allAnimals[3] = Butterfly;

		System.out.println("===Djuren visar sina läten===");
		for (int i = 0; i < allAnimals.length; i++) {
			allAnimals[i].makeSound();
		}

		System.out.println("===De djur som kan flyga flaxar sina vingar===");
		for(int i = 0; i < allAnimals.length; i ++) {
			allAnimals[i].fly();
		}
	}
}
