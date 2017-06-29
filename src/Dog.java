
public class Dog {
	String myName;

	public Dog(String name) {
		myName = name;
		System.out.println(myName + " said 'woof'!");
	}

	void woof() {
		System.out.println("growl!");
		
	if (myName.equals ("Hazel")){
		System.out.println("woof!");
	}
	else {
		System.out.println("bark!");
	}
}
}