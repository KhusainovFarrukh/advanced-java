package kh.farrukh.advancedjava.chapter3.diamondofdeath;

public class E implements B, C {

  /*
  If print() method is not overridden here, even though there is default method in both interfaces B and C,
  compiler will complain that print() method is ambiguous. So, we have to override print() method here.
  This is called diamond of death problem.
   */
  @Override
  public void print() {
    B.super.print();
    C.super.print();
  }

}
