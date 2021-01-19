
public class Main {

	public static void main(String[] args) {
		
		Animal Dog = new Dog("Vilma", "hund", "Vov", "Vov, vov, vov!!!", false);
		Animal Cat = new Cat("Kurre", "katt", "Mjau", "Purrrr", false );
		Animal Bird = new Bird("Pippi", "fågel", "Pip pip", "Pip pip", true);
		//Animal Butterfly = new Butterfly();
		Dog.introduceYourself();
		Cat.introduceYourself();
		Bird.introduceYourself();

	}

}
