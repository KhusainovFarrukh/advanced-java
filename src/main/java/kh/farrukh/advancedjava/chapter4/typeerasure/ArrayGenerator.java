package kh.farrukh.advancedjava.chapter4.typeerasure;

import java.lang.reflect.Array;

public class ArrayGenerator {

  public <T> T[] createArray(Class<T> clazz, int size) {
    /*
    This commented line will cause a compilation error because array creation directly from a generic type is not allowed in Java
     */
//    return new T[0];

    /*
    As a first idea, we can use the Array.newInstance() method to create an array of the desired type.
    But there arises two problems:
    1. The method returns an Object, so we need to cast it to the desired type.
    2. The method requires the type of the array to be created as a Class object.

    2nd problem can be solved by passing the Class object as a parameter to the method.
    But in Java it is not possible to get Class of a generic type directly.
     */
//    return (T[]) Array.newInstance(T.class, size);

    /*
    The solution is to pass the Class object as a parameter to the method.
    So we must add a parameter of type Class<T> to the method.
    But still we need to cast the result of the Array.newInstance() method to the desired type.
     */
    return (T[]) Array.newInstance(clazz, size);
  }

}
