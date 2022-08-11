import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aidan Kyle/chromedriver.exe");
        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        Thread.sleep(5000);
        driver.quit();

    }
}
