package com.interface2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Traingle implements Shape {

	@Override
	public void area() {
		System.out.println("area of traingle");

	}

}

class Circle implements Shape {

	@Override
	public void area() {
		System.out.println("area of circle");

	}
}

class Rectangle implements Shape {

	@Override
	public void area() {
		System.out.println("area of rectangle");
	}
}

public class TestInterface {
	public static void main(String[] args) {
		Shape a1 = new Circle();
		Shape a2 = new Traingle();
		Shape a3 = new Rectangle();
		
		  LinkedList<Shape> l = new LinkedList<>();
	        l.add(a1);
	        l.add(a2);
	        l.add(a3);
	        System.out.println(l);
	        for (Shape s : l) {
	            if (s == a1) {
	                s.area();
	            }
	        }
	        //System.out.println(l);
	       // for(Shape s:l){
	        	
	         //   s.area();//calling method of Shape class by child class instance
	    //    }
			/*
			 * Iterator itr = l.iterator(); while (itr.hasNext()) {
			 * System.out.println(itr.next()); }
			 */
			/*
			 * Iterator at =l.iterator(); while(at.hasNext()) {
			 * 
			 * 
			 * System.out.println(at.next()); }
			 */
	    }
//		 LinkedList<Shape> l = new LinkedList<>
		/*
		 * // ArrayList al = new ArrayList(); al.add(a1.area()); al.add(a2); al.add(a3);
		 * Iterator<Shape> itr2 = al.iterator(); while (itr2.hasNext()) { Shape str
		 * =itr2.next(); System.out.println(str); } // System.out.println(al.get(1).());
		 * 
		 * Iterator itr = al.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next());
		 */
	}

