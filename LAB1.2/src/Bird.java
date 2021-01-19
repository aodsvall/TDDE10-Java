

class Bird extends Animal {

	Bird(String name, String type, String sound, String noise, Boolean fly) {
		super(name, type, sound, noise, fly);
		this.name = name;
		this.fly = fly;
		this.sound = sound;
		this.type = type;
		this.noise = noise;
	}
	public void introduceYourself() {
		System.out.println(sound + " jag är " + "en " + type + " som heter " + name);
	}

}