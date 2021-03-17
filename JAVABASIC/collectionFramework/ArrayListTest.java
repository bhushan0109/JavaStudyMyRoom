package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List ll = new ArrayList();
		ll.add("bhushan");
		ll.add("rahul");
		ll.add("rcaj");
		ll.add("man");
		ll.add(3, "fff");
		ll.add(6);
		
		Iterator itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
