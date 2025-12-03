package hello.exception;

/**
 * Exception thrown when an error occurs during greeting operations.
 * This is a general-purpose exception for greeting-related errors.
 */
public class GreetingException extends RuntimeException {
  
  /**
   * Constructs a new GreetingException with the specified detail message.
   * 
   * @param message the detail message explaining the reason for the exception
   */
  public GreetingException(String message) {
    super(message);
  }
  
  /**
   * Constructs a new GreetingException with the specified detail message and cause.
   * 
   * @param message the detail message explaining the reason for the exception
   * @param cause the cause of the exception
   */
  public GreetingException(String message, Throwable cause) {
    super(message, cause);
  }
}
