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
import java.util.concurrent.TimeUnit;

public class SubscribeUnionTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void chromeSubscribeUnion() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();

        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://subscribe.ru/");
        driver.findElement(By.xpath("//*[@id=\"all\"]/header/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"credential_0\"]")).sendKeys("alles695@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"credential_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"credential_1\"]")).sendKeys("782577");
        driver.findElement(By.xpath("//*[@id=\"js_loginFormBut\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"all\"]/header/ul/li[1]/a/div[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"logged_list\"]/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[6]/div/div[3]/div[1]/ul/li[4]/a\n")).click();

        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/div[1]/input")).sendKeys("782577");
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/div[2]/input")).sendKeys("alles696@yandex.ru");
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/div[3]/input")).sendKeys("753262");
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/input")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"all\"]/header/ul/li[1]/a/div[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"logged_list\"]/li[2]/a/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[6]/div/div[2]/div[1]/ul/li[1]/a")).getText(), "Сейчас подписано: 3");
    }

    @Test
    public void firefoxSubscribeUnion() {
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();

        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://subscribe.ru/");
        driver.findElement(By.xpath("//*[@id=\"all\"]/header/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"credential_0\"]")).sendKeys("alles695@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"credential_1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"credential_1\"]")).sendKeys("782577");
        driver.findElement(By.xpath("//*[@id=\"js_loginFormBut\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"all\"]/header/ul/li[1]/a/div[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"logged_list\"]/li[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[6]/div/div[3]/div[1]/ul/li[4]/a\n")).click();

        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/div[1]/input")).sendKeys("782577");
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/div[2]/input")).sendKeys("alles696@yandex.ru");
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/div[3]/input")).sendKeys("221231");
        driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[3]/div/div[2]/form/input")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"all\"]/header/ul/li[1]/a/div[1]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"logged_list\"]/li[2]/a/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        assertEquals(driver.findElement(By.xpath("//*[@id=\"all\"]/section/div[2]/div/div/div[6]/div/div[2]/div[1]/ul/li[1]/a")).getText(), "Сейчас подписано: 3");

    }
}

