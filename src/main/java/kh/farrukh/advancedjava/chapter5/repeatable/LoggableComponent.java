package kh.farrukh.advancedjava.chapter5.repeatable;

public class LoggableComponent {

  @AutoLog("Logging doSomething")
  public void doSomething() {
    System.out.println("Doing something...");
  }

  @AutoLog("Logging doSomethingElse 1")
  @AutoLog("Logging doSomethingElse 2")
  public void doSomethingElse() {
    System.out.println("Doing something else...");
  }

  @AutoLogs({
      @AutoLog("Logging doSomethingElseMultiple 1"),
      @AutoLog("Logging doSomethingElseMultiple 2")
  })
  public void doSomethingElseMultiple() {
    System.out.println("Doing something elses...");
  }

}
