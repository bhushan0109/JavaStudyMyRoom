package practiceconcept;

import java.util.Scanner;

public class Flipcoin 
{
	public static void main(String[] args) 
	{
		        int heads = 0;
		        int tails = 0;
		        int counter = 1;
		        double randNum = 0.0;
		        Scanner in = new Scanner(System.in);
		         
		        System.out.println("How many times will the coin be flipped? ");
		        int flips = in.nextInt();
		         
		        while(counter <= flips)
		        {    }
		        System.out.println();
		        System.out.println("Number of Heads = " + heads);
		        System.out.println("Number of Tails = " + tails);
		        
		        int head1=((100*heads)/flips);
		        System.out.println(head1+" percentage of heads");
		        
		        int tails1=((100*tails)/flips);
		        System.out.println(tails1+" percentage of tails");
		     
		            randNum = Math.random();
		            System.out.print(counter + "\t" + randNum);
		             
		            if(randNum < .5)
		            {
		                heads++;
		                System.out.println("\t heads");
		            }
		            else
		            {
		                tails++;
		                System.out.println("\t tails");
		               }
		            counter++;      
		              
		    }
	}