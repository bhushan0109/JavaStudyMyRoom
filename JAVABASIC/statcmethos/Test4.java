package statcmethos;

class Test4
{ static int a=100; //static variable
public static void main(String[] args)
{ System.out.println(a); //1-way(directly possible)
System.out.println(Test.a); //2-way(By using class name)
Test t=new Test();
System.out.println(t.a); //3-way(By using reference variable)
}
};