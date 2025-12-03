package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Greeter {
  private static final Logger logger = LoggerFactory.getLogger(Greeter.class);

  public String sayHello() {
    logger.debug("sayHello() method called");
    String greeting = "Hello world!";
    logger.debug("Generated greeting: {}", greeting);
    return greeting;
  }
}