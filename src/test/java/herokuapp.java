import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class herokuapp {

    private static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/anasser/Desktop/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://stage.perfectsignage.ws/");
        Thread.sleep(3000);
    }
}