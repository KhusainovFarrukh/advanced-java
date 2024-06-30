package kh.farrukh.advancedjava.chapter4.simplegeneric;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.function.Function;

public class AgeInformation<T extends TemporalAccessor> implements Informative<T, String> {

  private final T currentDate;
  private final String additionalInfo;

  /*
   Class constructors are also considered to be kind of initialization methods, and as such,
   may use the generic types declared by their class, declare own generic types or just mix both
   (however they cannot return values so the return type parameterization is not applicable to constructors)
   */
  public <E> AgeInformation(T currentDate, E additionalInfo) {
    this.currentDate = currentDate;
    this.additionalInfo = additionalInfo.toString();
  }

  @Override
  public String getInfo(T birthDate) {
    var age = LocalDate.from(currentDate).getYear() - LocalDate.from(birthDate).getYear();
    return "Age is " + age + " (" + additionalInfo + ")";
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
