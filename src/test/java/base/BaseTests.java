package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.sql.Driver;

public class BaseTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        System.out.println(driver.getTitle());


        //1 - Maximize the window
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@class='fancybox-item fancybox-close']")).click();
        WebElement login = driver.findElement(By.cssSelector("p.link-text"));
        login.click();
        driver.findElement(By.cssSelector("input.q-input")).click();


        // Sleep a little bit for page load
        Thread.sleep(50);

        driver.quit();
    }
    public static void main(String args[]) throws InterruptedException {
        BaseTests test = new BaseTests();
        test.setUp();
    }




}


