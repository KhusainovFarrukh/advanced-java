package kh.farrukh.advancedjava.chapter1.staticinit;

public class StaticInitClass {

  private static int instanceCounter = 0;
  private static String staticName;
  private String instanceName;

  /*
  Static init block is called only once when the class is loaded (once per class-loader).
  Static block is called before instance block.
  Static blocks called in the order they appear in the class.
   */
  static {
    System.out.println("Static block is called");
    staticName = "Static Name";
  }

  static {
    System.out.println("Another static block is called");
  }

  {
    System.out.println("Instance block is called");
    instanceName = "Instance Name " + instanceCounter;
    instanceCounter++;
  }

  public StaticInitClass() {
    System.out.println("No-arg constructor is called");
  }

  public StaticInitClass(String name) {
    System.out.println("Arg constructor is called");
    instanceName = name;
    staticName = name;
  }

  public String getStaticName() {
    return staticName;
  }

  public String getInstanceName() {
    return instanceName;
  }

  @Override
  public String toString() {
    return "StaticInitClass{" +
        "staticName='" + staticName + '\'' +
        ", instanceName='" + instanceName + '\'' +
        '}';
  }

}

