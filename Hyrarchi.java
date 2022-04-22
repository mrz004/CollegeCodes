import java.util.Scanner;

public class Hyrarchi {

  public static void main(String[] args) {
    CO c = new CO();
    c.getCO();
    ME m = new ME();
    m.getME();
    c.showCO();
    m.showME();
  }
}

class Eng {

  static Scanner sc = new Scanner(System.in);
  String name;
  int yearOfDegree;
  float finalYearMarks;

  Eng() {
    System.out.println("Enter your name :");
    name = sc.next();
    System.out.println("Enter the year of compliting degree :");
    yearOfDegree = sc.nextInt();
    System.out.println("Enter your marks in final year :");
    finalYearMarks = sc.nextFloat();
  }
}

class CO extends Eng {

  int noOfProgLang;
  String fildOfSpecialisation;

  void getCO() {
    System.out.println("Enter the feild of specialisation :");
    fildOfSpecialisation = sc.next();
    System.out.println("Enter the number of languages known :");
    noOfProgLang = sc.nextInt();
  }

  void showCO() {
    System.out.println("Name : " + name);
    System.out.println("yearOfDegree : " + yearOfDegree);
    System.out.println("finalYearMarks : " + finalYearMarks);
    System.out.println("noOfProgLang : " + noOfProgLang);
    System.out.println("fildOfSpecialisation : " + fildOfSpecialisation);
  }
}

class ME extends Eng {

  String fildOfSpecialisation;

  void getME() {
    System.out.println("Enter the feild of specialisation :");
    fildOfSpecialisation = sc.next();
  }

  void showME() {
    System.out.println("Name : " + name);
    System.out.println("yearOfDegree : " + yearOfDegree);
    System.out.println("finalYearMarks : " + finalYearMarks);
    System.out.println("fildOfSpecialisation : " + fildOfSpecialisation);
  }
}
