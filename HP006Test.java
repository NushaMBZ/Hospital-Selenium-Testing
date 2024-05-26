// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HP006Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void hP006() {
    driver.get("https://ahmadalihospital.com/");
    driver.manage().window().setSize(new Dimension(1092, 720));
    driver.findElement(By.cssSelector(".elementor-button-text:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".elementor-col-75 > #form-field-name")).click();
    driver.findElement(By.cssSelector(".elementor-col-75 > #form-field-name")).sendKeys("HJHJ");
    driver.findElement(By.id("form-field-field_d0d6c26")).click();
    driver.findElement(By.id("form-field-field_d0d6c26")).sendKeys("25");
    driver.findElement(By.cssSelector(".elementor-field-type-email:nth-child(3) > #form-field-email")).click();
    driver.findElement(By.cssSelector(".elementor-field-type-email:nth-child(3) > #form-field-email")).sendKeys("GHG@GMAIL.COM");
    driver.findElement(By.id("form-field-field_a9b726d")).click();
    driver.findElement(By.id("form-field-field_a9b726d")).sendKeys("587995458798");
    driver.findElement(By.cssSelector(".elementor-field-type-email:nth-child(3) > #form-field-email")).click();
    driver.findElement(By.cssSelector(".elementor-field-type-email:nth-child(3) > #form-field-email")).sendKeys("GHG@gmail.com");
    driver.findElement(By.id("form-field-field_d6465d8")).click();
    {
      WebElement dropdown = driver.findElement(By.id("form-field-field_d6465d8"));
      dropdown.findElement(By.xpath("//option[. = 'Dr. A.W.M. Sameem(GENERAL SURGEON)']")).click();
    }
    driver.findElement(By.cssSelector("#form-field-field_d6465d8 > option:nth-child(3)")).click();
    driver.findElement(By.id("form-field-message")).click();
    driver.findElement(By.cssSelector(".elementor-field-group:nth-child(8) .elementor-button-text")).click();
    driver.findElement(By.cssSelector(".eicon-close:nth-child(1)")).click();
    driver.close();
  }
}
