package kh.farrukh.advancedjava.chapter2.clone;

public class CloneApp {

  public static void main(String[] args) {
    var developer1 = new Developer("Java", new Laptop("Dell", 2019));
    System.out.println(developer1);

    try {
      var developer2 = developer1.clone();
      System.out.println(developer2);

      /*
      The following line will change the year of the laptop of developer2.
      But also it will change the year of the laptop of developer1.
      Because developer2 is a shallow copy of developer1.
      This means that the developer1 and developer2 are pointing to the same Laptop object.
      So if you change the Laptop object of developer2, it will also change the Laptop object of developer1.
       */
      developer2.getLaptop().setYear(2023);
      System.out.println(developer1);
      System.out.println(developer2);
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

}
