import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class MtsTest {

    private WebDriver driver;


    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://www.mts.by/");// открыл страницу
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement cookieElement = driver.findElement(By.xpath("//*[text()='Принять']"));
        cookieElement.click();//кликнул по куки
    }

    @Test
    public void checkOnlinePayWithoutCommission() {


        WebElement elementOnlinePay = driver.findElement(By.xpath(".//h2[text()=\"Онлайн пополнение \"]"));// Передал путь до строки "Онлайн пополнение"

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementOnlinePay); //скролл до блока
        Assert.assertEquals(elementOnlinePay.getText(), "Онлайн пополнение\nбез комиссии"); //сравнил ОР с ФР
    }

    @Test
    public void checkNameLogo() {


        WebElement visaElement = driver.findElement(By.xpath("//div[@class='pay__partners']//li[1]"));
        WebElement verefiedByVisaElement = driver.findElement(By.xpath("//div[@class='pay__partners']//li[2]"));
        WebElement masterCardElement = driver.findElement(By.xpath("//div[@class='pay__partners']//li[3]"));
        WebElement masterCardSCElement = driver.findElement(By.xpath("//div[@class='pay__partners']//li[4]"));
        WebElement belcardElement = driver.findElement(By.xpath("//div[@class='pay__partners']//li[5]"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", visaElement);

        assert visaElement.isDisplayed();
        assert verefiedByVisaElement.isDisplayed();
        assert masterCardElement.isDisplayed();
        assert masterCardSCElement.isDisplayed();
        assert belcardElement.isDisplayed();


    }


    @Test
    public void checkLinkAboutService() {


        WebElement aboutServiceElement = driver.findElement(By.xpath(".//*[text()='Подробнее о сервисе']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", aboutServiceElement);
        aboutServiceElement.click();


    }

    @Test
    public void checkButton() {


        WebElement phoneNumberElement = driver.findElement(By.xpath(".//*[@placeholder=\"Номер телефона\"]"));


        phoneNumberElement.sendKeys("297777777");

        WebElement sumPayElement = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        sumPayElement.sendKeys("50");

        WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        emailElement.sendKeys("dmitry.dmitry@mail.ru");

        WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        buttonElement.click();
    }


    @After
    public void tearDown(){
    driver.quit();
    }
}