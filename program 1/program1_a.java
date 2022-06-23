
package program1;
import java.util.*;

public class program1_a {
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
    
         System.out.println("Enter the number you want to get factorial");
         int n=sc.nextInt();
         
         int fact=1;
         for(int i=1;i<=n;i++)
         {
              fact=fact*i;
         }
         
         System.out.println("The factorial of "+n+" is "+fact);
         
    }
    
    
}
