package linkListImplementation;

public class linkListConcept {

	Node head; // head of the list
	// linked list node

	static class Node {
		int data;
		Node next; // two variable

		public Node(int d) { // constructor created
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		// empty link list
		linkListConcept emptylist = new linkListConcept();
		emptylist.head = new Node(56); // head 56 start
		Node seconNode = new Node(30);// second add
		Node thirdNode = new Node(70); // third add
		emptylist.head.next = seconNode;// first connt to second
		emptylist.head.next.next = thirdNode;// sec connt third
		emptylist.printLinkedLIST();
	}

	public void printLinkedLIST() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.println(tempNode.data + " ");
			tempNode = tempNode.next;
		}

	}
}