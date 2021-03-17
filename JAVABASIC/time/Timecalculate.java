package time;

import java.util.Date;

public class Timecalculate {
	
		 
	    static void adddition (int a, int b) {
	    	int add= a+b;
	    	
	    	
	         // Sleep 3 seconds - purposely truncated         
	    }
	 
	    public static void main(String[] args) {
	        long startTime = new Date().getTime();
	        Timecalculate.adddition(6, 7);
	        long endTime = new Date().getTime();
	 
	        // calculate time difference
	        long timeDiff = endTime - startTime;
	        System.out.println("milliseconds: " + timeDiff);
	    }
	}