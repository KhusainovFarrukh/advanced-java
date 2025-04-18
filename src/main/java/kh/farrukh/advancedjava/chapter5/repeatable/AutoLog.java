package kh.farrukh.advancedjava.chapter5.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(AutoLogs.class)
public @interface AutoLog {

  String value() default "Logging method execution";

}
