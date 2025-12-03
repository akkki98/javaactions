package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit tests for the {@link Greeter} class.
 * <p>
 * This test class validates the functionality of the Greeter class,
 * ensuring that greeting messages are generated correctly.
 * </p>
 * 
 * @author JavaActions Project
 * @version 1.0
 * @since 0.1.0
 * @see Greeter
 */
public class GreeterTest {
  
  /**
   * Instance of {@link Greeter} used for testing.
   */
  private Greeter greeter = new Greeter();

  /**
   * Tests that the {@link Greeter#sayHello()} method returns a message
   * containing the word "Hello".
   * <p>
   * This test verifies that the greeting message contains the expected
   * salutation, ensuring the basic functionality of the greeter.
   * </p>
   */
  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }

}