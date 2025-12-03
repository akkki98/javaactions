package hello;

import org.joda.time.LocalTime;

/**
 * Main entry point for the JavaActions demonstration application.
 * <p>
 * This class demonstrates the integration of the Joda-Time library
 * for time handling and the custom {@link Greeter} class for generating
 * greeting messages. It serves as a simple example of a Java application
 * with external dependencies.
 * </p>
 * 
 * @author JavaActions Project
 * @version 1.0
 * @since 0.1.0
 */
public class HelloWorld {
  
  /**
   * Main method that serves as the entry point for the application.
   * <p>
   * This method performs the following operations:
   * </p>
   * <ol>
   *   <li>Creates a {@link LocalTime} object representing the current time</li>
   *   <li>Prints the current local time to the console</li>
   *   <li>Creates a {@link Greeter} instance</li>
   *   <li>Prints a greeting message to the console</li>
   * </ol>
   * 
   * @param args command-line arguments (not used in this application)
   */
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
