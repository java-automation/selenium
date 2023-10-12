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

import static java.lang.Thread.sleep;

public class WebDriverTest {
    WebDriver driver;

    public static void main(String[] args) {  //main must be static, if not, use annotation @test
        System.out.println("Hello world!");  // it makes the func runnable
    }
    @BeforeEach
    public void before() {
        //duplicated code
        driver = new ChromeDriver();
    }
    @DisplayName("Another test")
    @Test
    public void AnotherTest() throws InterruptedException {
        System.out.println("Hello world!");

        // WebDriverManager.chromedriver().setup();   this download the right driver binary but not main browser
        //ChromeOptions options = new ChromeOptions();
        //    if (SystemUtils.IS_OS_MAC) {
        //options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");  MacOS
//        }
        //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");    Win
        //driver = new ChromeDriver(options);


        driver.get("https://skryabin.com/market/quote.html");
        driver.findElement(By.name("username")).sendKeys("John");
        sleep(2000);

    }
    @DisplayName("Negative test_")
    @Test
    public void end2EndTest() throws InterruptedException {
        System.out.println("Hello world!");

            // WebDriverManager.chromedriver().setup();   this download the right driver binary but not main browser
            //ChromeOptions options = new ChromeOptions();
        //    if (SystemUtils.IS_OS_MAC) {
            //options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");  MacOS
//        }
        //options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");    Win

        driver.get("https://skryabin.com/market/quote.html");
        driver.findElement(By.name("username")).sendKeys("jdoe");
        sleep(2000);

    }
    @AfterEach
    public void after() {
        driver.quit();
    }
}
