// Java Program to illustrate tight coupling in the form of a marriage
public class HusbandWife {
	Wife w = new Wife();
	public void listens() {
		w.demands();
		System.out.println("Husband: Ok");
	}
	
}
class Wife {
	public void demands() {
		System.out.println("Wife: I want pizza");
	}
	
}
class Marraige {
	public static void main(String[] args) {
		HusbandWife h = new HusbandWife();
		h.listens();
	}	
}

