import java.util.Scanner;

class factorial{

    
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), fact = 1;
        for(int i = 1; i<=x; i++){
            fact *= i;
        }
        System.out.format("The factorial of %s is %s.", x, fact);
    }
}