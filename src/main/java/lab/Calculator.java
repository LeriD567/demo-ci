package lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
  private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

  public static void main(String[] args) {
    int result = add(5, 10);
    logger.info("Result is: {}", result);
  }

  public static int add(int a, int b) {
    return a + b;
  }
}