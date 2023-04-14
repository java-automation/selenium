import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

    WebDriver driver;
    String browerType = "chrome";

    @Before
    public void before() {
        System.out.println("before()");
        if (browerType.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browerType.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
        } else {
            throw new Error("Unsupported browserType!");
        }
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
        Thread.sleep(2000);
    }

    @Test
    public void loginTest() throws InterruptedException {
        System.out.println("loginTest start");
        driver.get("https://skryabin-careers.herokuapp.com/");
        Thread.sleep(1000);
    }
}
