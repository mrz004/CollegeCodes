import java.util.Scanner;

public class BirthMonth
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of your month of birth:");
		int x = sc.nextInt();
		switch(x){
		    case 1: System.out.println("Your birth month is Jan."); break;
		    case 2: System.out.println("Your birth month is Feb."); break;
		    case 3: System.out.println("Your birth month is Mar."); break;
		    case 4: System.out.println("Your birth month is Apr."); break;
		    case 5: System.out.println("Your birth month is May."); break;
		    case 6: System.out.println("Your birth month is Jun."); break;
		    case 7: System.out.println("Your birth month is Jul."); break;
		    case 8: System.out.println("Your birth month is Aug."); break;
		    case 9: System.out.println("Your birth month is Sep."); break;
		    case 10: System.out.println("Your birth month is Oct."); break;
		    case 11: System.out.println("Your birth month is Nov."); break;
		    case 12:System.out.println("Your birth month is Dec."); break;
		}
	}
}
