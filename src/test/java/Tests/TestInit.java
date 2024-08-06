package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestInit {
    public WebDriver driver = new ChromeDriver();


    @BeforeClass
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/.cache/selenium/chromedriver/win64/127.0.6533.88");
    }

        @AfterClass
        public void quit() {
        this.driver.quit();

    }
}
