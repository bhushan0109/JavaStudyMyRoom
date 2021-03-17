package time;

public class Exicutiontime {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
       for(int i=1; i<1000;i++)
           System.out.println("Check1");

       long time2 = System.currentTimeMillis();
        System.out.println("Execution time = "+(time2-time1)+"ms");
    }
}