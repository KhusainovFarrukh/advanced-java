package kh.farrukh.advancedjava.chapter3.lambda;

public class SomeLambdaConsumerClass {

  public void doIt(Runnable runnable) {
    System.out.println("Doing something with: " + runnable.getClass());
    runnable.run();
  }

}
