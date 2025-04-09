package kh.farrukh.advancedjava.chapter3.lambda;

public class LambdaApp {

  public static void main(String[] args) {
    mainClosure();
//    mainClosureWithWrapperObject();
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

}
