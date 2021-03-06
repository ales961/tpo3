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
public class LeftMenuTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void chromeLeftMenu() {
    System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    driver.get("https://subscribe.ru/");
    driver.findElement(By.xpath("//*[@id=\"all\"]/div[4]/ul/li[12]/a/span[1]")).click();
    assertEquals(driver.findElement(By.xpath("//*[@class=\"rightmenu\"]/h2")).getText(), "Спорт");
  }

  @Test
  public void firefoxLeftMenu() {
    System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    driver.get("https://subscribe.ru/");
    driver.findElement(By.xpath("//*[@id=\"all\"]/div[4]/ul/li[12]/a/span[1]")).click();
    assertEquals(driver.findElement(By.xpath("//*[@class=\"rightmenu\"]/h2")).getText(), "Спорт");
  }
}
