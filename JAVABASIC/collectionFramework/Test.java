package collectionFramework;

import java.util.ArrayList;

class Test {
	public static void main(String[] args) {
		Emp e1 = new Emp(111, "ratan");
		Student s1 = new Student(222, "xxx");
		ArrayList al = new ArrayList();
		al.add(10);
		al.add('a');
		al.add(e1);
		al.add(s1);
		System.out.println(al.toString()); // [10, a, Emp@d70d7a, Student@b5f53a]
		for (Object o : al) {
			if (o instanceof Integer)
				System.out.println(o.toString());
			if (o instanceof Character)
				System.out.println(o.toString());
			if (o instanceof Emp) {
				Emp e = (Emp) o;
				System.out.println(e.eid + "---" + e.ename);
			}
			if (o instanceof Student) {
				Student s = (Student) o;
				System.out.println(s.sid + "---" + s.sname);
			}
		}
	}
}