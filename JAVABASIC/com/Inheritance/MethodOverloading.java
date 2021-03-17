package com.Inheritance;

class Red {
	public void color() {
		System.out.println("red");
	}

}
class Blue extends Red{
public void color() {
	System.out.println("blue1");
}	
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Blue name = new Blue();
		name.color();

	}

}
