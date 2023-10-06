import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    @Test
    public void end2EndTest() throws InterruptedException {
        System.out.println("Hello world!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://skryabin.com/market/quote.html");
        Thread.sleep(2000);
        driver.quit();
    }
}