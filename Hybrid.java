public class Hybrid implements SuperChild {

  public void showBase() {
    System.out.println("Interface Base");
  }
//
  public void showChild1() {
    System.out.println("Interface Child1");
  }

  public void showChild2() {
    System.out.println("Interface Child2");
  }

  public void showSuperChild() {
    System.out.println("Interface SuperChild");
  }

  public static void main(String[] args) {
    Hybrid h = new Hybrid();
    h.showBase();
    h.showChild1();
    h.showChild2();
    h.showSuperChild();
  }
}

interface Base {
  void showBase();
}

interface Child1 extends Base {
  void showChild1();
}

interface Child2 extends Base {
  void showChild2();
}

interface SuperChild extends Child1, Child2 {
  void showSuperChild();
}
