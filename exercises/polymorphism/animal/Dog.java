package exercises.polymorphism.animal;

public class Dog extends Animal {

	String bark;
	String whimper;

	private Dog(){
		super(null);
	}

	public Dog(String bark, String whimper, String growl){
		super(growl);
		this.bark = bark;
		this.whimper = whimper;
	}

	public String toString(){
		return "A dog barks with " + this.bark + " and whimpers with " + this.whimper + " and " + super.toString();
	}
}
