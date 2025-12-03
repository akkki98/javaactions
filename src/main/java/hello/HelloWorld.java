package hello;

import org.joda.time.LocalTime;
import hello.exception.InvalidInputException;
import hello.exception.GreetingException;

/**
 * Main application class that demonstrates greeting functionality
 * with comprehensive error handling.
 */
public class HelloWorld {
  
  /**
   * Main entry point of the application.
   * 
   * @param args command line arguments (optional name for personalized greeting)
   */
  public static void main(String[] args) {
    try {
      // Display current time
      LocalTime currentTime = new LocalTime();
      System.out.println("The current local time is: " + currentTime);
      
      Greeter greeter = new Greeter();
      
      // Default greeting
      System.out.println(greeter.sayHello());
      
      // Personalized greeting if name provided as argument
      if (args != null && args.length > 0) {
        String name = args[0];
        try {
          System.out.println(greeter.sayHello(name));
        } catch (InvalidInputException e) {
          System.err.println("Error: " + e.getMessage());
          System.err.println("Please provide a valid name as argument.");
        }
      }
      
    } catch (GreetingException e) {
      System.err.println("Greeting Error: " + e.getMessage());
      if (e.getCause() != null) {
        System.err.println("Caused by: " + e.getCause().getMessage());
      }
    } catch (Exception e) {
      System.err.println("Unexpected error occurred: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
//test12
//test
