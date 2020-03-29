package lihh.javaLearn.webAutoTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

import java.util.List;

public class test1
{

    WebDriver driver;
    @Parameters("env")
    @Test()
    public void shouldAnswerWithTrue(String env)
    {
        WebDriverManager.chromedriver().setup();
        System.out.println("________________嘻嘻嘻"+env+"——————————————————————————");
        String url = "file:///Users/lihaihui/Documents/CodeEnv/javaLearn/src/test/resources/index" +
                ".html";
        driver = new ChromeDriver();
        driver.get(url);
        WebElement div = driver.findElement(By.xpath("//div[contains(@class,'fx-dialog__wrapper')]"));
        Boolean b = div.isDisplayed();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String autocomplete = (String)js.executeScript("return arguments[0].getAttribute('autocomplete')",div);
        String display = (String)js.executeScript("return arguments[0].getAttribute('style')",div);
        System.out.println("display:"+display);
    }
    @AfterTest()
    public void close()
    {
        driver.quit();
    }
}
