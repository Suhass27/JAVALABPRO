
package program2;

import java.util.Scanner;

public class program2_a {
    
     public static void main (String args[]) {
        
        int[] a=new int[20];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
         
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            sum = sum+a[i];
        }
        
        System.out.println("The sum of array is: "+sum);
        
        

     }
}

