import java.util.Scanner;

public class StarPattern2

{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows in the * pattern: ");
	    int r = sc.nextInt();
        for(int i=r; i>0; i--){
            for(int j = 0; j<i-1; j++){
                System.out.print("  ");
            }
            for(int j = i; j<=r; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}