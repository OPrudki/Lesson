import org.junit.Test;
static import org.junit.Assert;
import inheritance.Developer;

public class HelloTest {
  @Test
  publicvoid testNothing() {
    System.out.println("testing nothing");

Assert.assertTrue(true);
  }

  @Test
  publicvoid testNothing2() {
    Developer dev = new Developer();
    System.out.println("testing nothing2");

  Assert.assertTrue(false);
  }

}
