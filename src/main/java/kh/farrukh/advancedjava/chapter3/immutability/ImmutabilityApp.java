package kh.farrukh.advancedjava.chapter3.immutability;

import java.time.LocalDate;
import java.util.ArrayList;

public class ImmutabilityApp {

  public static void main(String[] args) {
    var emails = new ArrayList<String>();
    emails.add("alex@mail.com");
    emails.add("smith01@gmail.com");

//    var mutable1 = new SimpleMutableClass(
//        "Alex Smith",
//        emails,
//        new IDCard("1", LocalDate.of(1980, 1, 1))
//    );
//    System.out.println("Mutable 1: " + mutable1);
//
//    mutable1.getEmails().remove(0);
//    mutable1.getIdCard().setBirthDate(LocalDate.of(1990, 1, 1));
//
//    System.out.println("Mutable 1: " + mutable1);

    var immutable1 = new CustomImmutableClass(
        "Alex Smith",
        emails,
        new IDCard("1", LocalDate.of(1980, 1, 1))
    );
    System.out.println("Immutable 1: " + immutable1);

    emails.remove(0);
    immutable1.getIdCard().setBirthDate(LocalDate.of(1990, 1, 1));

    System.out.println("Immutable 1: " + immutable1);
  }

}
