import java.util.Scanner;

class Persone{
    String name;
    byte age;
    Scanner sc = new Scanner(System.in);
    Persone(){
        System.out.println("Enter the name of persone : ");
        name = sc.next();
        System.out.println("Enter the age of the persone : ");
        age = sc.nextByte();
    }
    Persone(String name, byte age){
        this.name = name;
        this.age = age;
    }
}

class Emp extends Persone {
    Scanner sc = new Scanner(System.in);
    long salary;
    String job;
    Emp(){
        System.out.println("Enter the job name of the employee : ");
        job = sc.next();
        System.out.println("Enter the salary of the employee : ");
        salary = sc.nextLong();
        
    }
    Emp(long salary, String job){
        this.salary = salary;
        this.job = job;
    }
}

public class MultiLevelInhe extends Emp
{
    void show(){
        System.out.println("Name of the Employee :" + name);
        System.out.println("Age of the Employee :" + age);
        System.out.println("Name of Job of the Employee :" + job);
        System.out.println("Salary of the Employee :" + salary);
    }
    
	public static void main(String[] args) {
		Main m = new Main();
		m.show();
	}
}