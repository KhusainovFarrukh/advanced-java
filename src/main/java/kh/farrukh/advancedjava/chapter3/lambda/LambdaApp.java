package kh.farrukh.advancedjava.chapter3.lambda;

public class LambdaApp {

  public static void main(String[] args) {
//    mainClosure();
//    mainClosureWithWrapperObject();
    mainClosureWithWrapperObjectAsync();
  }

  public static void mainClosure() {
    var someLambdaConsumerClass = new SomeLambdaConsumerClass();
    var name = "Someone";
    //2: so we can't change its value after initialization
//    name = "Someone 2";
    someLambdaConsumerClass.doIt(() -> {
      //1: to be used inside lambda, name must be final or effectively final
      System.out.println("Hello from " + name);
      //3: even inside lambda, we can't change its value
//      name = "Someone else";
    });
    //4: even after lambda, we can't change its value
//    name = "Someone else outer";

  }

  public static void mainClosureWithWrapperObject() {
    var someLambdaConsumerClass = new SomeLambdaConsumerClass();
    //5: as a workaround, we can use a wrapper object (array, list, atomic, etc.) to change its value
    var lambdaModel = new LambdaModel("Someone");
    //6: we can change its value after initialization
    lambdaModel.setName("Someone 2");
    someLambdaConsumerClass.doIt(() -> {
      System.out.println("Hello from " + lambdaModel.getName());
      //7: we can change its value inside lambda
      lambdaModel.setName("Someone else");
    });
    System.out.println("Name after lambda: " + lambdaModel.getName());
    //8: we can change its value after lambda
    lambdaModel.setName("Someone else outer");
    System.out.println("Name after lambda outer: " + lambdaModel.getName());
  }

  public static void mainClosureWithWrapperObjectAsync() {
    var someLambdaConsumerClass = new SomeLambdaConsumerClass();
    var lambdaModel = new LambdaModel("Someone");
    lambdaModel.setName("Someone 2");
    //9: but if we are in multithreaded environment, changes to the wrapper object in one thread will affect other threads
    someLambdaConsumerClass.doItAsync(1000, () -> {
      //10: there we will think we will print "Someone 2", but in fact main thread already changed it to "Someone else outer"
      System.out.println("Hello from " + lambdaModel.getName());
      lambdaModel.setName("Someone else");
    });
    System.out.println("Name after lambda: " + lambdaModel.getName());
    lambdaModel.setName("Someone else outer");
    System.out.println("Name after lambda outer: " + lambdaModel.getName());
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    //11: there we will think we will print "Someone else outer", but in fact lambda thread already changed it to "Someone else"
    System.out.println("Name after sleep: " + lambdaModel.getName());
  }

}
