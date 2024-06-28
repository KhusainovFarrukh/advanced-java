package kh.farrukh.advancedjava.chapter2.brokenhashcode;

import java.util.Random;

public class Student {

  private String name;
  private Integer age;

  public Student(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
//    return false;

    if (obj == null) {
      return false;
    }

    if (this == obj) {
      return true;
    }

    final var other = (Student) obj;

    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }

    if (age == null) {
      if (other.age != null) {
        return false;
      }
    } else if (!age.equals(other.age)) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    var multiplier = new Random().nextInt();
//    var multiplier = 31;

    var result = 1;
    result = multiplier * result + ((name == null) ? 0 : name.hashCode());
    result = multiplier * result + ((age == null) ? 0 : age.hashCode());

    return result;
  }

  @Override
  public String toString() {
    return "Student {name=" + name + ", age=" + age + "}";
  }
}
