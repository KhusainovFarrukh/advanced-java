package kh.farrukh.advancedjava.chapter1.staticinit;

public class StaticInitApp {

  public static void main(String[] args) {
    var staticInitClass1 = new StaticInitClass();
    System.out.println(staticInitClass1);

    var staticInitClass2 = new StaticInitClass();
    System.out.println(staticInitClass2);

    var staticInitClass3 = new StaticInitClass("Name");
    System.out.println(staticInitClass3);
  }

}
