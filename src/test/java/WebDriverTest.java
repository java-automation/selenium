import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverTest {
  WebDriver driver;


  @BeforeEach
    public void before() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    if (SystemUtils.IS_OS_MAC) {
      options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
    } else if (SystemUtils.IS_OS_WINDOWS) {
      options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
    }
    driver = new ChromeDriver(options);
    }

  @DisplayName("End to End test")
  @Test
  public void end2EndTest() throws InterruptedException {
    driver.get("https://skryabin.com/market/quote.html");
    driver.findElement(By.name("username")).sendKeys("jdoe");
    Thread.sleep(2000);

  }
  @AfterEach
    public void after() {
    driver.quit();
  }



}
