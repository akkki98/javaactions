package hello.exception;

/**
 * Exception thrown when invalid input is provided to a method.
 * This includes null values, empty strings, or other invalid data.
 */
public class InvalidInputException extends RuntimeException {
  
  /**
   * Constructs a new InvalidInputException with the specified detail message.
   * 
   * @param message the detail message explaining the reason for the exception
   */
  public InvalidInputException(String message) {
    super(message);
  }
  
  /**
   * Constructs a new InvalidInputException with the specified detail message and cause.
   * 
   * @param message the detail message explaining the reason for the exception
   * @param cause the cause of the exception
   */
  public InvalidInputException(String message, Throwable cause) {
    super(message, cause);
  }
}
