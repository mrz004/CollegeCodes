import java.util.Scanner;


public class CircleArea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        int r = sc.nextInt();
        System.out.println("The area of circle is : "+ (Math.PI*r*r));
    }
}