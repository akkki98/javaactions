package hello;

import hello.exception.InvalidInputException;

/**
 * A Greeter class that provides greeting functionality with comprehensive
 * input validation and error handling.
 * 
 * Error Scenarios:
 * - InvalidInputException: Thrown when null or empty input is provided
 */
public class Greeter {
  
  /**
   * Returns a default greeting message.
   * 
   * @return a greeting string
   */
  public String sayHello() {
    return "Hello world!";
  }
  
  /**
   * Returns a personalized greeting message for the given name.
   * 
   * @param name the name to greet (must not be null or empty)
   * @return a personalized greeting string
   * @throws InvalidInputException if name is null or empty
   */
  public String sayHello(String name) {
    validateName(name);
    return "Hello, " + name + "!";
  }
  
  /**
   * Returns a greeting message with a custom greeting word.
   * 
   * @param greeting the greeting word (e.g., "Hi", "Welcome")
   * @param name the name to greet
   * @return a customized greeting string
   * @throws InvalidInputException if greeting or name is null or empty
   */
  public String customGreeting(String greeting, String name) {
    validateGreeting(greeting);
    validateName(name);
    return greeting + ", " + name + "!";
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