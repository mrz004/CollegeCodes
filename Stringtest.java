import java.util.*;
public class Stringtest
{
    public static void main (String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password:");
        s=sc.next();
        if(s.equals("rose"))
        System.out.println("Good");
        else
        System.out.println("Wrong");
        StringBuffer pass=new StringBuffer(s);
        StringBuffer s1=new StringBuffer(pass);
        System.out.println("Reverse is:"+pass.reverse());
        System.out.println("After appending:"+s.append("Welcome"));
        


    }
}