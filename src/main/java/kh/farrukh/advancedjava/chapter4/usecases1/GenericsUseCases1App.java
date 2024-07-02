package kh.farrukh.advancedjava.chapter4.usecases1;

import java.util.UUID;

public class GenericsUseCases1App {

  /*
  Without generics, we can do what we want but we have to cast the return type to the desired type.
   */
  private static Updatable getUpdatedWithoutGenerics(Updatable updatable) {
    updatable.update();
    return updatable;
  }

  /*
  With generics, return type is the same as the type of the parameter.
  So we don't need to cast the return type to the desired type.
   */
  private static <T extends Updatable> T getUpdatedWithGenerics(T updatable) {
    updatable.update();
    return updatable;
  }

  public static void main(String[] args) {
    var phoneNumber = new PhoneNumber(UUID.randomUUID(), "1234567890");
    System.out.println("Phone number before update: " + phoneNumber.getNumber());
    /*
    The getUpdatedWithoutGenerics() method takes and returns an Updatable object.
    Even though the method is called with a PhoneNumber object, the method will return it as Updatable object.
    So we have to cast the return type to PhoneNumber.
     */
    var updated = (PhoneNumber) getUpdatedWithoutGenerics(phoneNumber);
    System.out.println("Phone number after update: " + updated.getNumber());

    /*
    The getUpdatedWithGenerics() method takes and returns a T generic type which implements Updatable.
    So the return type is the same as the type of the parameter.
    We don't need to cast the return type to PhoneNumber.
     */
    var updatedWithGenerics = getUpdatedWithGenerics(phoneNumber);
    System.out.println("Phone number after update with generics: " + updatedWithGenerics.getNumber());
  }

}
