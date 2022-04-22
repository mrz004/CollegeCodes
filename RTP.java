import java.util.Scanner;

class RTP{

    
    public static void main(String[] args) {
        System.out.println("Enter the number of rows :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i<x; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}