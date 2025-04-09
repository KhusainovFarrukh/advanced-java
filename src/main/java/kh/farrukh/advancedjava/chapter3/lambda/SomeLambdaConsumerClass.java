package kh.farrukh.advancedjava.chapter3.lambda;

public class SomeLambdaConsumerClass {

  public void doIt(Runnable runnable) {
    System.out.println("Doing something with: " + runnable.getClass());
    runnable.run();
  }

  public void doItAsync(Integer sleepTime, Runnable runnable) {
    System.out.println("Doing something async with: " + runnable.getClass());
    new Thread(() -> {
      try {
        Thread.sleep(sleepTime);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      runnable.run();
    }).start();
  }



}
