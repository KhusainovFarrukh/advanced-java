package kh.farrukh.advancedjava.chapter2.brokenhashcode;

import java.util.HashMap;

public class BrokenHashcodeApp {

  public static void main(String[] args) {
    var student1 = new Student("John", 25);
    var student2 = new Student("Mike", 24);
    var student3 = new Student("John", 25);

    var students = new HashMap<Student, Long>();

    students.put(student1, 100L);
    students.put(student2, 200L);
    students.put(student3, 300L);

    students.forEach((student, value) -> {
      System.out.println(student + " -> " + value);
    });
  }

}
