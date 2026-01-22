package pillars_of_oops;

public class inheritance_2 {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();  //dog
		//a.eyes();//not possible parent ke pass hai hi ni eyes

	}

}


class Animal {
	void sound() {
		System.out.println("animal");
	}
}

class Dog extends Animal{
	// @Override
	void sound() {
		System.out.println("dog");
	}
	void eyes() {
		System.out.println("eye of dog");
	}
	
}
