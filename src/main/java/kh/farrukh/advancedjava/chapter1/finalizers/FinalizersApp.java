package kh.farrukh.advancedjava.chapter1.finalizers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FinalizersApp {

  public static void main(String[] args) {
    var path = Paths.get(getResourcesPath(), "file.txt");

    /*
    OutputStream must be closed. So we call close() method explicitly.
    close() method comes from AutoCloseable interface. Which is itself extends from Closeable interface.
     */
    try {
      var outputStream = Files.newOutputStream(path, StandardOpenOption.CREATE);
      outputStream.write("Hello, Finalizers!".getBytes());
      outputStream.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    /*
    When we use try-with-resources statement, we don't need to call close() method explicitly.
    try-with-resources statement automatically calls close() method.
    See AutoCloseable interface documentation for more details.
     */
    try (var outputStream = Files.newOutputStream(path, StandardOpenOption.CREATE) ) {
      outputStream.write("Hello, Finalizers!".getBytes());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static String getResourcesPath() {
    var emptyResource = FinalizersApp.class.getClassLoader().getResource("");
    if (emptyResource == null) {
      throw new RuntimeException("Resources directory not found");
    }
    return emptyResource.getPath();
  }

}
