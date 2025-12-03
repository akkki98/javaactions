package hello;

import org.joda.time.LocalTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
  private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {
    logger.info("Application starting");
    LocalTime currentTime = new LocalTime();
    logger.info("The current local time is: {}", currentTime);
    Greeter greeter = new Greeter();
    logger.info("Greeting message: {}", greeter.sayHello());
    logger.debug("Application completed successfully");
  }
}
//test12
//test
