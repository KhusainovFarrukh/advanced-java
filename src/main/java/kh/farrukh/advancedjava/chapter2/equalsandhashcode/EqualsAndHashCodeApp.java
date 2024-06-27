package kh.farrukh.advancedjava.chapter2.equalsandhashcode;

public class EqualsAndHashCodeApp {

  public static void main(String[] args) {
    var school1 = new School(1, "New York");
    var school2 = new School(2, "Los Angeles");

    System.out.println("school1.equals(school2): " + school1.equals(school2));
    System.out.println("school1 == school2: " + (school1 == school2));
    System.out.println("school1.hashCode(): " + school1.hashCode());
    System.out.println("school2.hashCode(): " + school2.hashCode());

    var school3 = new School(1, "New York");

    System.out.println("school1.equals(school3): " + school1.equals(school3));
    System.out.println("school1 == school3: " + (school1 == school3));
    System.out.println("school1.hashCode(): " + school1.hashCode());
    System.out.println("school3.hashCode(): " + school3.hashCode());

    try {
      var school4 = school3.clone();

      System.out.println("school3.equals(school4): " + school3.equals(school4));
      System.out.println("school3 == school4: " + (school3 == school4));
      System.out.println("school3.hashCode(): " + school3.hashCode());
      System.out.println("school4.hashCode(): " + school4.hashCode());
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

}
