package kh.farrukh.advancedjava.chapter1.initblock;

public class InitBlockApp {

  public static void main(String[] args) {
    var noArgInitBlockClass = new InitBlockClass();
    System.out.println(noArgInitBlockClass);

    var argInitBlockClass = new InitBlockClass("John");
    System.out.println(argInitBlockClass);
  }

}
