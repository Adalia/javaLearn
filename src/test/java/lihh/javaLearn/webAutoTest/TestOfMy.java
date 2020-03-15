package lihh.javaLearn.webAutoTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOfMy {


    /**
     * 在给定的时间内去查找元素，如果没找到则超时，抛出异常
     * */
    public static void waitForElementToLoad(WebDriver driver, int timeOut, final By By) {
        try {
            (new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(By);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e) {
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + By + "]");
        }
    }

    @Test
    void  test1() throws Exception{

        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.baidu.com");
 //       driver.navigate().to("https://www.baidu.com");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
 /*       Actions action = new Actions(driver);


        //jsExecutor.executeScript("alert('hello,selenium')");
        JavascriptExecutor driver_js = ((JavascriptExecutor) driver);

        //利用js代码键入搜索关键字
        driver_js.executeScript("document.getElementById(\"kw\").value=\"selenium\"");
        //利用js代码取出关键字
        String keyword = (String) driver_js.executeScript("var input = document.getElementById(\"kw\").value; return input");
        System.out.println(keyword);
        driver.findElement(By.id("su")).click();

        //等待元素页面加载
        waitForElementToLoad(driver, 10, By.xpath(".//*[@id='container']/div[2]/div/div[2]"));
        //向下滑动直到找到元素下一页
        driver_js.executeScript("arguments[0].scrollIntoView(true)",driver.findElement(By.xpath(".//*[@id='page']/a[10]")));
        driver.findElement(By.xpath(".//*[@id='page']/a[10]")).click();

        //
        driver.quit();*/



        driver.get("https://www.fxiaoke.com/pc-login/build/login.html");

        WebElement element = driver.findElement(By.xpath("//span[text()='帐号登录']"));

        element.click();
        Thread.sleep(1000);
        element = driver.findElement(By.xpath("//input[@placeholder='请输入手机号']"));
        element.sendKeys("13681318718");
        element = driver.findElement(By.xpath("//input[@placeholder='请输入密码']"));
        element.sendKeys("aa123456");
        element = driver.findElement(By.xpath("//div[text()='立即登录']"));
        element.click();
        Thread.sleep(10000);
        element = driver.findElement(By.xpath("//div[@id='app-portal']//div[@class='active-item-board']/span[text()='工作']"));
        element.click();
        element = driver.findElement(By.xpath("//div[@id='app-portal']//span[text()='CRM']"));
        element.click();
        Thread.sleep(5000);
        driver.navigate().to("https://www.fxiaoke.com/XV/Home/Index#crm/list/=/SalesOrderObj");
        driver.navigate().refresh();
        Thread.sleep(20000);
        element = driver.findElement(By.xpath("//div[@class='chart-slide-btn']"));
        element.click();
        Thread.sleep(5000);
        element = driver.findElement(By.xpath("//div[@class='crm-btn-groups']//span[@data-action='add']"));
        element.click();
        Thread.sleep(5000);
        element = driver.findElement(By.xpath("//div[@class='dialog-con-wrap']//li[@data-value='default__c']"));
        element.click();
        element = driver.findElement(By.xpath("//span[@action-type='dialogEnter']"));
        element.click();
        Thread.sleep(5000);
        element = driver.findElement(By.xpath("//div[@data-apiname='account_id']//input[@placeholder='请输入']"));
        element.click();
        element.sendKeys("客户1575744776065");
        element.click();
        Thread.sleep(5000);
        element = driver.findElement(By.xpath("//div[@class='md-content']/div[@data-apiname='SalesOrderProductObj']//span[@action-handle='batchAddDataHandle']"));
        element.click();
        Thread.sleep(5000);
        element = driver.findElement(By.xpath("//div[@class='crm-c-dialog crm-comp-pickview-content']//div[@class='dialog-con-wrap']//tr[@class='tr' and @data-index='0']/td[1]/div[1]/em[1]"));
        element.click();

        element = driver.findElement(By.xpath("//span[@action-type='dialogEnter']"));
        element.click();

        element = driver.findElement(By.xpath("//div[@data-name='discount']"));

        element.click();
        Thread.sleep(3000);

        element = driver.findElement(By.xpath("//div[contains(@class,'td-cell-edit td-cell-edit33')]//input"));
        element.sendKeys("80");

        //jsExecutor.executeScript("document.querySelector('[data-name=subtotal]').scrollIntoView(true)");
        element = driver.findElement(By.xpath("//div[@data-name='subtotal']"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true)",element);

        element.click();

/*        try{
            element.click();
        }
        catch (ElementClickInterceptedException e){
            System.err.println("ElementClickInterceptedException error:::" + e);

            try{
            }catch (JavascriptException e1) {
                System.err.println("ElementClickInterceptedException error:::" + e1);
            }

        }*/


        //jsExecutor.executeScript("alert('hello,selenium');");
/*        try {
            jsExecutor.executeScript("window.document.querySelector(\".td-cell-edit.td-cell-edit33\").innerText = 60");
        }catch (JavascriptException e) {
            System.err.println("executeScript error:::" + e);
        }
        element.click();*/
    }
}
