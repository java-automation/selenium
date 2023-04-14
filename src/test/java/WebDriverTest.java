import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    WebDriver driver;

    @Before
    public void before() {
        System.out.println("before()");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void after() {
        System.out.println("after()");
        driver.quit();
    }

    @Test
    public void e2eTest() throws InterruptedException {
        System.out.println("e2eTest start");
        driver.get("https://skryabin-careers.herokuapp.com/");
        Thread.sleep(5000);
    }

    @Test
    public void loginTest() throws InterruptedException {
        System.out.println("loginTest start");
        driver.get("https://skryabin-careers.herokuapp.com/");
        Thread.sleep(5000);
    }
}
