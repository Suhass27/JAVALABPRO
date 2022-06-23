
package program1;

import java.util.Scanner;

public class program1_c {
    
    public static void main (String args[]) {
        
        float Fa, Ce;  
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Fahrenheit temperature");
        Fa = sc.nextFloat();
             
          
          Ce  = ((Fa-32)*5)/9;  
          
          System.out.println("Temperature in celsius is: "+Ce);  
    }
}  

