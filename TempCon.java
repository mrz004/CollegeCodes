import java.util.Scanner;


public class TempCon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the tempretur in ferenhit: ");
        double temp = sc.nextDouble();
        temp = (temp - 32) * 5/9;
        System.out.println("tempretur in celcius = " + temp);
    }
}