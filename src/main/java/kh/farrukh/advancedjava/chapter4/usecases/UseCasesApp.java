package kh.farrukh.advancedjava.chapter4.usecases;

import java.util.UUID;

public class UseCasesApp {

  /*
  Without generics, we can do what we want but we have to cast the return type to the desired type.
   */
  private static Updatable getUpdatedWithoutGenerics(Updatable updatable) {
    updatable.update();
    return updatable;
  }

  public static void main(String[] args) {
    var phoneNumber = new PhoneNumber(UUID.randomUUID(), "1234567890");
    System.out.println("Phone number before update: " + phoneNumber.getNumber());
    /*
    The getUpdated() method takes and returns an Updatable object.
    Even though the method is called with a PhoneNumber object, the method will return it as Updatable object.
    So we have to cast the return type to PhoneNumber.
     */
    var updated = (PhoneNumber) getUpdatedWithoutGenerics(phoneNumber);
    System.out.println("Phone number after update: " + updated.getNumber());
  }

}
