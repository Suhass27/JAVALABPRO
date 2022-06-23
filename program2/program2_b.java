
package program2;

import java.util.*;

public class program2_b {

  public static void main (String args[]) {
        
        int[][] a=new int[10][10];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of coloum: ");
         int c=sc.nextInt();
        System.out.println("Enter the number of row: ");
        int r=sc.nextInt();
        
        System.out.println("Enter the elements");    
        
        for(int i=0; i<c; i++)
        {
            for(int j=0;j<r;j++)
            {
                 a[i][j]=sc.nextInt();
            }    
                       
        }
        
        System.out.println("Elements in array are: ");
        for(int i=0; i<c; i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[i][j]+"  " );
            } 
             System.out.println("");
                       
        }
        

  }
}
