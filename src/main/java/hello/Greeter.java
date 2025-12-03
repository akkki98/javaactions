package hello;

import hello.exception.InvalidInputException;
import hello.exception.GreetingException;

/**
 * A Greeter class that provides greeting functionality with comprehensive
 * input validation and error handling.
 * 
 * Error Scenarios:
 * - InvalidInputException: Thrown when null or empty input is provided
 * - GreetingException: Thrown when greeting generation fails
 */
public class Greeter {
  
  /**
   * Returns a default greeting message.
   * 
   * @return a greeting string
   * @throws GreetingException if greeting generation fails
   */
  public String sayHello() {
    try {
      return "Hello world!";
    } catch (Exception e) {
      throw new GreetingException("Failed to generate default greeting", e);
    }
  }
  
  /**
   * Returns a personalized greeting message for the given name.
   * 
   * @param name the name to greet (must not be null or empty)
   * @return a personalized greeting string
   * @throws InvalidInputException if name is null or empty
   * @throws GreetingException if greeting generation fails
   */
  public String sayHello(String name) {
    validateName(name);
    try {
      return "Hello, " + name + "!";
    } catch (Exception e) {
      throw new GreetingException("Failed to generate greeting for: " + name, e);
    }
  }
  
  /**
   * Returns a greeting message with a custom greeting word.
   * 
   * @param greeting the greeting word (e.g., "Hi", "Welcome")
   * @param name the name to greet
   * @return a customized greeting string
   * @throws InvalidInputException if greeting or name is null or empty
   * @throws GreetingException if greeting generation fails
   */
  public String customGreeting(String greeting, String name) {
    validateGreeting(greeting);
    validateName(name);
    try {
      return greeting + ", " + name + "!";
    } catch (Exception e) {
      throw new GreetingException("Failed to generate custom greeting", e);
    }
  }
  
  /**
   * Validates that the provided name is not null or empty.
   * 
   * @param name the name to validate
   * @throws InvalidInputException if name is null or empty
   */
  private void validateName(String name) {
    if (name == null) {
      throw new InvalidInputException("Name cannot be null");
    }
    if (name.trim().isEmpty()) {
      throw new InvalidInputException("Name cannot be empty");
    }
  }
  
  /**
   * Validates that the provided greeting is not null or empty.
   * 
   * @param greeting the greeting to validate
   * @throws InvalidInputException if greeting is null or empty
   */
  private void validateGreeting(String greeting) {
    if (greeting == null) {
      throw new InvalidInputException("Greeting cannot be null");
    }
    if (greeting.trim().isEmpty()) {
      throw new InvalidInputException("Greeting cannot be empty");
    }
  }
}