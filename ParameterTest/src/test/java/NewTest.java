import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest {
  @Parameters({"url"})
  @Test
  public void f(String url) {
	  System.out.println("In test method"+url);
  }
  @BeforeTest
  public void beforeTest() {
  }

}
