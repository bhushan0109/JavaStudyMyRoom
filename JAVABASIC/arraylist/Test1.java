package arraylist;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(10);
		al.add(10.5);
		al.add("bhusann");
		al.add(null);
		/*
		 * for (int i = 0; i < al.size(); i++) { System.out.print(al.get(i));
		 * 
		 * } System.out.println();
		 * 
		 * System.out.println("============"); for (Object e : al) {
		 * System.out.print(e.toString());
		 * 
		 * 
		 * }
		 */
		System.out.println();
		System.out.println("============");
		System.out.println(al);
	}

}
