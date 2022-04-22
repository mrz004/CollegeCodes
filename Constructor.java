import java.io.*;

public class Constructor
{
    int r_no,marks;
    String name;
    Constructor()
    {
        r_no=0;
        marks=0;

    }
    Constructor(int a,int b)
    {
        System.out.println("Constructor overloaded");
        r_no=a;
        marks=b;



    }
    void display()
    {
        System.out.println("Roll no:"+r_no);
        System.out.print("Marks:"+marks);

    }
}
class student
{
     public static void main(String[] args) 
         
     
    {
       Constructor c=new Constructor();
       c.display();
    }
        
    }
