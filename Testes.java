import static org.junit.Assert.*;
import org.junit.Test;

class Testes {
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }

}