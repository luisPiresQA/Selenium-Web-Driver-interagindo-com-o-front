package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private String url="https://portal.softdesign-rs.com.br/";

@Test
    public void efetuarLogin()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\luis.pires\\Documents\\Selenium\\Drivers\\Chrome\\chromedriver.exe");        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("user_login")).sendKeys("luis.pires");
        driver.findElement(By.id("user_pass")).sendKeys(senha);
        driver.findElement(By.id("wp-submit")).click();
        String textoPortal = driver.findElement(By.xpath("//a[text()=\"Portal SoftDesign\"]")).getText();
        Assert.assertEquals(textoPortal,"Portal SoftDesign");
    }

    @Test
    public void validarAlertaDeErro()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\luis.pires\\Documents\\Selenium\\Drivers\\Chrome\\chromedriver.exe");        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.id("user_login")).sendKeys("luis.pires");
        driver.findElement(By.id("user_pass")).sendKeys(senha);
        driver.findElement(By.id("wp-submit")).click();
        String textoPortal = driver.findElement(By.xpath("//a[text()=\"Portal SoftDesign\"]")).getText();
        Assert.assertEquals(textoPortal,"Portal SoftDesign");

    }

    Secreta scta = new Secreta();
    String senha =scta.getSenha();
}
