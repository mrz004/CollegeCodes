class Continent
{
    String Co;
    Scanner s=new Scanner(System.in);
    void get()
    {
        System.out.println("Enter your continent:");
        Co=s.next();

    }


}
class Country extends Continent
{
    void get1()
    {
        System.out.println("Enter your Country:");
        Co=s.next();

    }
}
class State extends Country
{
      void get2()
      {
          System.out.println("Enter your state:");
          Co=s.next();

      }
}
class district extends State
{
      void get3()
      {
          System.out.println("Enter your di8strict:");
          Co=s.next();

      }
}
class AIO extends district
{
    void display()
    {
        System.out.println("Continent:"+Co);
        System.out.println("Country:"+Co);
        System.out.println("State:"+Co);
        System.out.println("District:"+Co);
    }
}
class Tejas
{
    public static void main (String args[])

{
 AIO t=new AIO
 t.get();
 t.get1();
 t.get2();
 t.get3();
 t.display();
}
}
