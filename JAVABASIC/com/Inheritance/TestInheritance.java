package com.Inheritance;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		Animal ob =new Dog();
		ob.eat();
		/*
		 * Dog b =((Dog)ob); b.bark();
		 */
		((Dog)ob).bark();

	}
}