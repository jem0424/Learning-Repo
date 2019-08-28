interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

public class Pig implements Animal {
	public void animalSound() {
		System.out.println("I'm a pig");
	}
	public void sleep() {
		System.out.println("I'm going to bed");
	}
}

class MyMainClass {
  public static void main(String[] args) {
	  Pig myPig = new Pig();
	  myPig.animalSound();
	  myPig.sleep();
  }
}
