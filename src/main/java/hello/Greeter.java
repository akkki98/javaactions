package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Greeter {
  private static final Logger logger = LoggerFactory.getLogger(Greeter.class);

  public String sayHello() {
    logger.debug("Generating greeting message");
    return "Hello world!";
  }
}