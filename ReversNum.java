import java.util.Scanner;


public class ReversNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt(), revN=0;
        while(n!=0){
            revN *= 10;
            revN += (n%10);
            n /= 10;
        }
        System.out.println("Revers number = " + revN);
    }
}