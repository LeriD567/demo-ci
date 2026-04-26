package lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

  @Test
  public void testAdd() {
    assertEquals(15, Calculator.add(5, 10));
  }

  @Test
  public void testAddNegative() {
    assertEquals(-5, Calculator.add(5, -10));
  }
}