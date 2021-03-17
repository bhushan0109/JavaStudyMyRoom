package statcmethos;

class Test
{ //static variables
static int a=1000;
static int b=2000;
public static void main(String[] args) //static method
{ System.out.println(Test.a);
System.out.println(Test.b);
Test t = new Test();
t.m1(); //instance method calling
}
//instance method
void m1() //user defined method called by user inside main method
{ System.out.println(a);
System.out.println(this.b);
}
};