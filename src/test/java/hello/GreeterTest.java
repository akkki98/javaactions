package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import hello.exception.InvalidInputException;
import hello.exception.GreetingException;

/**
 * Comprehensive test suite for Greeter class including
 * input validation and error handling scenarios.
 */
public class GreeterTest {
  
  private Greeter greeter;
  
  @Before
  public void setUp() {
    greeter = new Greeter();
  }

  // ===== Default Greeting Tests =====
  
  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }
  
  @Test
  public void defaultGreetingShouldReturnHelloWorld() {
    assertEquals("Hello world!", greeter.sayHello());
  }
  
  // ===== Personalized Greeting Tests =====
  
  @Test
  public void personalizedGreetingShouldIncludeName() {
    String result = greeter.sayHello("Alice");
    assertEquals("Hello, Alice!", result);
  }
  
  @Test
  public void personalizedGreetingShouldWorkWithDifferentNames() {
    assertEquals("Hello, Bob!", greeter.sayHello("Bob"));
    assertEquals("Hello, Charlie!", greeter.sayHello("Charlie"));
  }
  
  // ===== Custom Greeting Tests =====
  
  @Test
  public void customGreetingShouldUseProvidedGreeting() {
    String result = greeter.customGreeting("Hi", "Alice");
    assertEquals("Hi, Alice!", result);
  }
  
  @Test
  public void customGreetingShouldWorkWithWelcome() {
    String result = greeter.customGreeting("Welcome", "Bob");
    assertEquals("Welcome, Bob!", result);
  }
  
  // ===== Input Validation Tests - Null Values =====
  
  @Test(expected = InvalidInputException.class)
  public void personalizedGreetingShouldThrowExceptionForNullName() {
    greeter.sayHello(null);
  }
  
  @Test
  public void personalizedGreetingShouldThrowExceptionWithMessageForNullName() {
    try {
      greeter.sayHello(null);
      fail("Expected InvalidInputException");
    } catch (InvalidInputException e) {
      assertEquals("Name cannot be null", e.getMessage());
    }
  }
  
  @Test(expected = InvalidInputException.class)
  public void customGreetingShouldThrowExceptionForNullGreeting() {
    greeter.customGreeting(null, "Alice");
  }
  
  @Test
  public void customGreetingShouldThrowExceptionWithMessageForNullGreeting() {
    try {
      greeter.customGreeting(null, "Alice");
      fail("Expected InvalidInputException");
    } catch (InvalidInputException e) {
      assertEquals("Greeting cannot be null", e.getMessage());
    }
  }
  
  @Test(expected = InvalidInputException.class)
  public void customGreetingShouldThrowExceptionForNullName() {
    greeter.customGreeting("Hi", null);
  }
  
  // ===== Input Validation Tests - Empty Strings =====
  
  @Test(expected = InvalidInputException.class)
  public void personalizedGreetingShouldThrowExceptionForEmptyName() {
    greeter.sayHello("");
  }
  
  @Test
  public void personalizedGreetingShouldThrowExceptionWithMessageForEmptyName() {
    try {
      greeter.sayHello("");
      fail("Expected InvalidInputException");
    } catch (InvalidInputException e) {
      assertEquals("Name cannot be empty", e.getMessage());
    }
  }
  
  @Test(expected = InvalidInputException.class)
  public void personalizedGreetingShouldThrowExceptionForWhitespaceName() {
    greeter.sayHello("   ");
  }
  
  @Test(expected = InvalidInputException.class)
  public void customGreetingShouldThrowExceptionForEmptyGreeting() {
    greeter.customGreeting("", "Alice");
  }
  
  @Test
  public void customGreetingShouldThrowExceptionWithMessageForEmptyGreeting() {
    try {
      greeter.customGreeting("", "Alice");
      fail("Expected InvalidInputException");
    } catch (InvalidInputException e) {
      assertEquals("Greeting cannot be empty", e.getMessage());
    }
  }
  
  @Test(expected = InvalidInputException.class)
  public void customGreetingShouldThrowExceptionForWhitespaceGreeting() {
    greeter.customGreeting("   ", "Alice");
  }
  
  @Test(expected = InvalidInputException.class)
  public void customGreetingShouldThrowExceptionForEmptyName() {
    greeter.customGreeting("Hi", "");
  }
  
  // ===== Edge Case Tests =====
  
  @Test
  public void personalizedGreetingShouldHandleNameWithSpaces() {
    String result = greeter.sayHello("John Doe");
    assertEquals("Hello, John Doe!", result);
  }
  
  @Test
  public void customGreetingShouldHandleGreetingWithSpaces() {
    String result = greeter.customGreeting("Good morning", "Alice");
    assertEquals("Good morning, Alice!", result);
  }
  
  @Test
  public void personalizedGreetingShouldHandleSpecialCharacters() {
    String result = greeter.sayHello("O'Brien");
    assertEquals("Hello, O'Brien!", result);
  }

}