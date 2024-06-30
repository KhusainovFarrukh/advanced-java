package kh.farrukh.advancedjava.chapter4.typeerasure;

import java.util.Collections;
import java.util.List;

public class Sorter {


  /*
  If this method is uncommented, it will cause a compilation error because the JVM will not be able to differentiate between the two methods.
  And the compiler will complain that 'sort(List<String>)' clashes with 'sort(List<Integer>)'; both methods have same erasure.
   */
//  public void sort(List<String> strings) {
//    Collections.sort(strings);
//  }

  public void sort(List<Integer> integers) {
    Collections.sort(integers);
  }

}
