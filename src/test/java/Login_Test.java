import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Login_Test {
	WebDriver driver;
  @Test
  public void f() {
  
  driver.findElement(By.name("q")).sendKeys("Manipal");
  }
  @BeforeMethod
  public void beforeMethod() {
  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\hs3957\\Documents\\Training Meterials\\Selenium\\geckodriver.exe");
	  driver = new FirefoxDriver(); //Webdriver is called an interface with Browser
	  driver.get("http://www.google.com");
  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
