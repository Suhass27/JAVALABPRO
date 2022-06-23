import java.util.Scanner;
class student{
    int usn;
    String name;
    String branch;
    int phone;

    void setdata(int usn,String name,String branch,int phone){
        this.usn = usn;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }
    void display()
    {
        System.out.println("The usn is "+usn);
        System.out.println("The name of student is "+name);
        System.out.println("the brnach of student is "+branch);
        System.out.println("the phone number is "+phone);
    }
}
class progrm3{
    public static void main(String [] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
            student[]  st = new student[n];
            for(int i=0;i<n;i++){
                st[i] = new student();
            }

            for(int i=0;i<n;i++){
               System.out.println("Enter usn,name ,branch,mobile");
               int usn = input.nextInt();
               String name  = input.next();
               String branch = input.next();
                int mobile = input.nextInt();
                st[i].setdata(usn,name,branch,mobile);
            }
            input.close();
            System.out.println("the number detials are ");
            for(int i=0;i<n;i++)
            {
                st[i].display();
            }

    }
}