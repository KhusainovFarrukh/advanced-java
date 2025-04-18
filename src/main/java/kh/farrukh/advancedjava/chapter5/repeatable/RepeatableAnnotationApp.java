package kh.farrukh.advancedjava.chapter5.repeatable;

import java.util.Optional;

public class RepeatableAnnotationApp {

  public static void main(String[] args) throws NoSuchMethodException {
    LoggableComponent loggableComponent = new LoggableComponent();

    var doSomething = loggableComponent
        .getClass()
        .getMethod("doSomething");
    var doSomethingElse = loggableComponent
        .getClass()
        .getMethod("doSomethingElse");
    var doSomethingElseMultiple = loggableComponent
        .getClass()
        .getMethod("doSomethingElseMultiple");

    System.out.println("doSomething:");
    //getAnnotation returns if there is only one annotation
    var doSomethingGetAnnotation = doSomething
        .getAnnotation(AutoLog.class);
    System.out.println("getAnnotation: " + Optional.ofNullable(doSomethingGetAnnotation)
        .map(AutoLog::value).orElse("---"));
    //getAnnotationsByType returns all annotations of the same type
    var doSomethingGetAnnotations = doSomething
        .getAnnotationsByType(AutoLog.class);
    for (var annotation : doSomethingGetAnnotations) {
      System.out.println("getAnnotationsByType: " + annotation.value());
    }
    //there is no wrapper and no repeated annotation, so it returns null
    var doSomethingGetAnnotationsWrapper = doSomething
        .getAnnotation(AutoLogs.class);
    Optional
        .ofNullable(doSomethingGetAnnotationsWrapper)
        .map(AutoLogs::value)
        .ifPresent(annotations -> {
          for (var annotation : annotations) {
            System.out.println("getAnnotation Wrapper: " + annotation.value());
          }
        });
    System.out.println();

    System.out.println("doSomethingElse:");
    //there are 2 repeated annotations, so getAnnotation returns null
    var doSomethingElseGetAnnotation = doSomethingElse
        .getAnnotation(AutoLog.class);
    System.out.println("getAnnotation: " + Optional.ofNullable(doSomethingElseGetAnnotation)
        .map(AutoLog::value).orElse("---"));
    //getAnnotationsByType returns all annotations of this type
    var doSomethingElseGetAnnotations = doSomethingElse
        .getAnnotationsByType(AutoLog.class);
    for (var annotation : doSomethingElseGetAnnotations) {
      System.out.println("getAnnotationsByType: " + annotation.value());
    }
    //it returns the wrapper annotation which will have 2 repeated annotations
    var doSomethingElseGetAnnotationsWrapper = doSomethingElse
        .getAnnotation(AutoLogs.class);
    Optional
        .ofNullable(doSomethingElseGetAnnotationsWrapper)
        .map(AutoLogs::value)
        .ifPresent(annotations -> {
          for (var annotation : annotations) {
            System.out.println("getAnnotation Wrapper: " + annotation.value());
          }
        });
    System.out.println();

    System.out.println("doSomethingElseMultiple:");
    //there is a wrapper annotation, so getAnnotation returns null
    var doSomethingElseMultipleGetAnnotation = doSomethingElseMultiple
        .getAnnotation(AutoLog.class);
    System.out.println("getAnnotation: " + Optional.ofNullable(doSomethingElseMultipleGetAnnotation)
        .map(AutoLog::value).orElse("---"));
    //getAnnotationsByType returns all annotations that are inside the wrapper
    var doSomethingElseMultipleGetAnnotations = doSomethingElseMultiple
        .getAnnotationsByType(AutoLog.class);
    for (var annotation : doSomethingElseMultipleGetAnnotations) {
      System.out.println("getAnnotationsByType: " + annotation.value());
    }
    //it returns the wrapper annotation
    var doSomethingElseMultipleGetAnnotationsWrapper = doSomethingElseMultiple
        .getAnnotation(AutoLogs.class);
    Optional
        .ofNullable(doSomethingElseMultipleGetAnnotationsWrapper)
        .map(AutoLogs::value)
        .ifPresent(annotations -> {
          for (var annotation : annotations) {
            System.out.println("getAnnotation Wrapper: " + annotation.value());
          }
        });

    //so getAnnotation works if there is only one annotation
    //repeated annotations are absolutely identical to the wrapper annotation, so we don't need to specify wrapper annotation manually
  }

}
