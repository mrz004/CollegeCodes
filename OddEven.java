import java.util.Scanner;


public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd :");
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.format("%s is a even number\n", x);
        }
        else{
            System.out.format("%s is a odd number\n", x);
        }
    }
}