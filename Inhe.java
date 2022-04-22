import java.util.scanner;
class Inhe
{
    int roll;
    String name;
    stud()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and roll no of student:");
        name=sc.next();
        roll=sc.nextInt();

    }
  
}  class Result extends Inhe
{
    double m1,m2,m3,sum;
    Result()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects:");
        m1=sc.nextDouble();
        m2=sc.nextDouble();
        m3=sc.nextDouble();
        sum=m1+m2+m3;


    }
    void display()
    {
        System.out.println("Name:"+name+"R.NO"+roll+"\nTotal:"+sum);
    }
}

public class inheritance
{
    public static void main (String args[])
 { Result r=new Result();
    r.display();
 }

}