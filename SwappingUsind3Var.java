import java.util.Scanner;


public class SwappingUsind3Var{
    public static void main(String[] args){
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), temp;
        System.out.format("a and b before sapping:\n\ta = %S,\tb = %s\n", a, b);
        temp = a;
        a = b;
        b = temp;
        System.out.format("a and b after sapping:\n\ta = %S,\tb = %s\n", a, b);
    }
}