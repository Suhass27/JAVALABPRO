import java.util.Scanner;
public class program2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.println("Enter the array size");
        n = input.nextInt();
        m = input.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter the arraye elements");{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j] = input.nextInt();
                }
            }
            input.close();
            System.out.println("The array elements are");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                   System.out.print(" "+a[i][j]);
                }
            }

        }
    }
}