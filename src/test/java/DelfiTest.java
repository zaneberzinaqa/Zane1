import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DelfiTest {

    private final By HOME_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-22')]");

    private final By HOME_PAGE_COMMENTS = By.xpath(".//a[@class='comment-count text-red-ribbon']");

    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'text-size-md-30')]");

    private final By ARTICLE_PAGE_COMMENTS = By.xpath(".//a[contains(@class, 'text-size-19')]");

    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']/a");

    private final By ARTICLE = By.xpath(".//span[@class = 'text-size-22 d-block']");

    private final By COMMENT_COUNT = By.xpath(".//span[@class = 'type-cnt']");

    @Test

    public void titleAndCommentsTest() {

        //Open browser

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Open Delfi Home page

        driver.get("http://rus.delfi.lv");

        //Find 1st Article

        WebElement article = driver.findElements(ARTICLE).get(0);

        //Find 1st article title

//        WebElement homePageTitle = driver.findElement(HOME_PAGE_TITLE);

        WebElement homePageTitle = article.findElement(HOME_PAGE_TITLE);

        //Save to String

        String titleToCompare = homePageTitle.getText();

        //Find comments count

        Integer commentsToCompare = 0;

        if (!article.findElements(HOME_PAGE_COMMENTS).isEmpty()) { //maina nozīmi uz pretējo

            WebElement homePageComments = article.findElement(HOME_PAGE_COMMENTS);

            //Save to Integer

            String commentsToParse = homePageComments.getText();

            commentsToParse = commentsToParse.substring(1, commentsToParse.length() - 1);

            commentsToCompare = Integer.valueOf(commentsToParse);

        }

        //Open Article page

        homePageTitle.click();

        //Find article title

        String apTitle = driver.findElement(ARTICLE_PAGE_TITLE).getText();

        //Check title

        Assertions.assertEquals(titleToCompare, apTitle, "Wrong title on Article page");


        //Find comment count

        Integer apComments = Integer.valueOf(driver.findElement(ARTICLE_PAGE_COMMENTS).getText().substring(1, driver.findElement(ARTICLE_PAGE_COMMENTS).getText().length() - 1));


        // Check comment count

        Assertions.assertEquals(commentsToCompare, apComments, "Wrong comment count on Article page");


        //Open comments page

        driver.findElement(ARTICLE_PAGE_COMMENTS).click();


        //Find title

        String cpTitle = driver.findElement(COMMENT_PAGE_TITLE).getText();


        //Check title

        Assertions.assertEquals(titleToCompare, apTitle, "Wrong article name");

        //Get comment count - vajag savaakt sarakstu, mes to jau darijam

        Integer commentsCompare = 0;

        if (!article.findElements(COMMENT_COUNT).isEmpty()) { //maina nozīmi uz pretējo

            WebElement homePageComments = article.findElement(COMMENT_COUNT);

            String commentsToParse = homePageComments.getText();

            commentsToParse = commentsToParse.substring(1, commentsToParse.length() - 1);

            commentsCompare = Integer.valueOf(commentsToParse);

        }


        //Check comment count in comment page - jaunu xpath taisīt

        Assertions.assertEquals(commentsCompare, apComments, "Wrong comment count in comment section");

        //Close browser

        driver.close();
    }
}