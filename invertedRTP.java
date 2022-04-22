import java.util.Scanner;


public class invertedRTP{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int x = sc.nextInt();
        for(int i = 0; i<x; i++){
            for(int j = i; j<x; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}