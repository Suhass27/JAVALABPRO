import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream; 
class meException extends Exception{
    meException(String s) {
       super(s);
   }
}
interface test {
    void square();
}
class arthematic implements test{
    public void square()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int x = input.nextInt();
        //input.close();
        System.out.println("The square is "+ x * x);
    }
}
class thread1 implements Runnable{
   
    Thread t;
   
    thread1()
    {
        t=new Thread(this,"Thread_1");
        System.out.println("Random variable Generation "+t);
        t.start();
    }
    public void run()
    {
        Scanner sc = new Scanner(System.in);
            try{
        System.out.println("Enter the number of Random numbers you want to generate: ");
        int  n=sc.nextInt();
     
       
        int[] a=new int[n];
        int min=0;
        int max=10000;
       
        for(int i=0;i<n;i++)
        {
            a[i]=(int)(Math.random()*(max-min+1)+min);
            System.out.println("ramdom number "+(i+1)+": "+a[i]);
        }
            }
            catch(Exception e)
            {
            }
    }
   
}

class thread2 implements Runnable{

    Thread t1;
    int m;
    thread2()
    {
       //int  m=n;
       t1=new Thread(this,"Thread_2");
       System.out.println("Thread for Square of number "+t1);
       t1.start();
    }
   
    public void run()
    {
         System.out.println("Enter the number to get Square ");
         Scanner sc = new Scanner(System.in);
         m=sc.nextInt();
       
        System.out.println("The Square of number is: " +(m*m));
    }
   

}

class thread3 implements Runnable{

    Thread t3;
    int j;
   
    thread3()
    {
   
        t3= new Thread(this,"Thread_3");
        System.out.println("Thread for cube of number "+t3);
        t3.start();
    }
   
    public void run()
    {
   
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number to get Cube ");
       
         j=sc.nextInt();
         System.out.println("The cube of number is "+(j*j*j));
       
    }

}
class example
{
    public 
    int x;
     int y;
    int z;
    example()
    {
        System.out.println("Default constructor");
    }
    example(int y)
    {
            this.x = y;
             y= 0;
             z = 0;
    }
    example(int a,int b,int c)
    {
        this.x = a;
        this.y = b;
        this.z = c;
    }
    void setdata(int x)
    {
        this.y = x;
    }
    void intial(int x)
    {
        this.x = x;
    }
    void display1()
    {
        System.out.println("the number x is "+x);
        // System.out.println("the number y is "+y);
        // System.out.println("the number z is "+z);
    }
}
class abc  extends example
{

    void datachanging(int y)
    {
        this.x = y;
    }
    void display2()
    {
        System.out.println("class 2");
    }

}
class example2 extends abc{
    void setdata(int s)
    {
        this.x = s;
    }
    void display3()
    {
        System.out.println("class 3 ");
    }
}
public class progrm4 {
    public static void main(String [] args) throws FileNotFoundException {
        // System.out.println("Enter number for implementing interface test ");
         Scanner input = new Scanner(System.in);

        //interface test 
        System.out.println("This is implementing interface test");
        test t1 = new arthematic();
        t1.square();

        ///Thread implementaion
        thread1 obd =new thread1();
        try{
        obd.t.join();
        }
       catch(InterruptedException e){
            System.out.println("Just to catch if there is InterruptedException");
       }
       
        new thread2();
        new thread3();

        // overriding and overloading////////////////////////
        System.out.println("Illustraton of  overriding and overloading");
        System.out.println("Enter a number ");
        int x = input.nextInt();
         example ex1 = new example(x);
         ex1.setdata(100);
        example ex2 = new example(12,20,30);
        //input.close(); //dont close it result in Scanner closed exception 
        ex1.display1();
        ex2.display1();
       // input.close();     ////dont close it result in Scanner closed exception
        abc ans = new abc();
        //ans.setdata(11));
        ans .setdata(12);
        ans.display2();
        // input.close();    ////dont close it result in Scanner closed exception



        ///////single inheritance/////////////////
       System.out.println("It is illustration of single inhertiance");
            abc test= new abc();
            System.out.println("Enter a number to inital the variable ");
            //input.next();
            int abc = input.nextInt();
            test.intial(abc); // accesing parent member using child 
            test.display1(); // 
            test.display2();
            //input.close();  ////dont close it result in Scanner closed exception


            
        /////////////////multi level inhertiance//////////////////////////////////////////
        System.out.println("It is illustration of multi level Inheritance ");
        int a1b = input.nextInt();
        example2 s = new example2();
        s.intial(x); // accessing example class using  child class example2;
        s.display1();
        System.out.println("Enter a number for changing the data of variable");
        int  y = input.nextInt();
        s.datachanging(y);
        System.out.println("Output after changing the value is ");
        s.display2();
        s.setdata(1000);
        s.display3();
       // input.close(); ////dont close it result in Scanner closed exception

        //checked and unchecked program
        String fileName = "file does not exist"; 
        File file = new File(fileName);
        try {
            FileInputStream stream = new FileInputStream(file); 
        } catch (FileNotFoundException e) {
            System.out.println("The checked exception is Caught Here "); // checked Exception
        }
        String ptr = null;
 
       
        try
        {
        
            if (ptr.equals("Name"))
                System.out.print("equal");
            else
                System.out.print("Not equal");
        }
        catch(NullPointerException e) //unchecked exception
        {
            System.out.print("The unchecked exception is Caught here ");
        }

        //custom exception
        System.out.println("It is illustration of custom exception ");
            int j = 10;
            try{
                int w = j/10;
                System.out.println(w);
                    throw new meException("This is what you will get if there is an error");
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println(e.getMessage());
            }
            //input.close();
    }
}
