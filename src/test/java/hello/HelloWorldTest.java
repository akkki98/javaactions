package hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldTest {
  
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testMainOutputsCurrentTime() {
    HelloWorld.main(new String[]{});
    String output = outContent.toString();
    assertTrue(output.contains("The current local time is:"), 
      "Output should contain 'The current local time is:'");
  }

  @Test
  public void testMainOutputsGreeting() {
    HelloWorld.main(new String[]{});
    String output = outContent.toString();
    assertTrue(output.contains("Hello world!"), 
      "Output should contain 'Hello world!'");
  }

  @Test
  public void testMainProducesOutput() {
    HelloWorld.main(new String[]{});
    String output = outContent.toString();
    assertFalse(output.isEmpty(), 
      "Main method should produce output");
  }
}
