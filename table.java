import java.util.Scanner;


public class table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whos table you want: ");
        int num = sc.nextInt();
        for(int i = 1; i<11; i++){
            System.out.format("%s x %s = %S\n", num, i, num*i);
        }
    }
}