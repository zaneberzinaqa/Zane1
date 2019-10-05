import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2 {

    private final By ARTICLE = By.xpath(".//a[@class = 'sf-with-ul']");

    @Test
    public void automationPractice() {
     System.setProperty("webdriver.chromedriver.browser", "C:/chromedriver.exe");
     WebDriver browser = new ChromeDriver();
        Dimension n = new Dimension(360,592);
        browser.manage().window().setSize(n);
        browser.get("http://automationpractice.com/");
        WebElement article = browser.findElements(ARTICLE).get(0);
    }
}
