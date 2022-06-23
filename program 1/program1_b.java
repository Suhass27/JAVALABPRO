
package program1;

import java.util.Scanner;

public class program1_b
{

	static boolean isPrime(int n){
		
		if(n==1||n==0)
                {
                    return false;
                }

		for(int i=2; i<n; i++)
                {
			if(n%i==0)return false;
		}
	
		return true;
	}
	

	
	public static void main (String[] args)
	{
		
            Scanner sc= new Scanner(System.in);
    
            System.out.println("Enter a number: ");
            int n=sc.nextInt();
		
            System.out.println("The prime numbers is: ");
            for(int i=2; i<n; i++)
            {
		if(isPrime(i))
                {     
                    System.out.println(i + " ");
		}
            
            }
            
            System.out.println("not there!!");
               
	}
}

