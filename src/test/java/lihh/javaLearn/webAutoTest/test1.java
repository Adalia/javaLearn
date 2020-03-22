package lihh.javaLearn.webAutoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class test1
{

    WebDriver driver;
    @Test()
    public void shouldAnswerWithTrue()
    {
        WebDriverManager.chromedriver().setup();
        String url = "file:///Users/lihaihui/Documents/CodeEnv/javaLearn/src/test/resources/relevant" +
                ".html";
        driver = new ChromeDriver();
        driver.get(url);
//        Assert.assertTrue( true );
//        WebElement input = driver.findElement(By.xpath("//div[@class='content']//ul[@class='j-group']//span[@class='name' and contains(text(),'Lucy')]/..//input"));
//
//        WebElement check =
//                driver.findElement(By.xpath("//div[contains(@class,'tl')]//li[@data-value='1']"));

    }
    @AfterTest()
    public void close()
    {
        driver.quit();
    }
}
