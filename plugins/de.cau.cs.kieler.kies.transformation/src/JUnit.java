import org.junit.*;
import static org.junit.Assert.*;

public class JUnit {

  int three = 3, nine;

  @Before
  public void setup() {
    nine = 9;
  }
  @Test
  public void testSquareRoot() {
    assertEquals((int) Math.sqrt(nine), three);
  }
  @Test
  public void testEquality() {
    assertTrue(nine == three);
  }
  @Test(expected = ArithmeticException.class)
  public void testDivisionByZero() {
    float f = 5 / 0;
  }
  @Test
  public void throwException() throws Exception {
  if (1 != 0)
    throw new Exception("This is obviously wrong!");
  }
}
