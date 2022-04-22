import java.util.Scanner;

class Animal{
    Scanner sc = new Scanner(System.in);
    String type;
    byte legs;
    Animal(){
        System.out.println("Enter the type of animal : ");
        type = sc.next();
        System.out.println("Enter the number of the legs of that animal : ");
        legs = sc.nextByte();
    }
}

class Persone extends Animal {
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

class Programmer extends Emp{
    Scanner sc = new Scanner(System.in);
    byte noLang;
    Programmer(){
        System.out.println("Enter the number of programming languages known : ");
        noLang = sc.nextByte();
    }
    
    void show(){
        System.out.println("Type of the Animal :" + type);
        System.out.println("Number of legs to the Animal :" + legs);
        System.out.println("Name of the Employee :" + name);
        System.out.println("Age of the Employee :" + age);
        System.out.println("Name of Job of the Employee :" + job);
        System.out.println("Salary of the Employee :" + salary);
        System.out.println("Number of languages known by Programmer :" + noLang);
    }
    
}

public class FourLevelInhe
{
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.show();
	}
}