import java.util.Scanner;

class Stud
{
    int roll;
    String name;
    Stud()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and roll no of the student: ");
        name = sc.next();
        roll = sc.nextInt();
    }

}

class Result extends Stud
{
    double m1, m2, m3, sum;
    Result()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in 3 subjects");
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
        sum = m1 + m2 +m3;
    }
    void display(){
}

public class SinglInhe
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
}