package kh.farrukh.advancedjava.chapter4.genericinterfaceclass;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.function.Function;

public class AgeInformation<T extends TemporalAccessor> implements Informative<T, String> {

  @Override
  public String getInfo(T birthDate) {
    var age = LocalDate.now().getYear() - LocalDate.from(birthDate).getYear();
    return "Age is " + age;
  }

  /*
   If methods are declared (or defined) as part of generic interface or class, they may (or may not)
   use the generic types of their owner.
   They may define own generic types or mix them with the ones from their class or interface declaration.
   */
  public <U> U map(T temporal, Function<T, U> mapper) {
    return mapper.apply(temporal);
  }

  /*
   There are no restrictions on which methods can use generic types, they could be concrete, abstract, static or final
   */
  public static <U extends Temporal, V> V mapStatic(U temporal, Function<U, V> mapper) {
    return mapper.apply(temporal);
  }

}
