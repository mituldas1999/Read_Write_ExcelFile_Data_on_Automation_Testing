package New;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class work1 extends BaseDriver{
    public static String BaseUrl="https://www.google.com";

    @Test(priority = 1)
    public void OpenUrl() throws InterruptedException {
        driver.get(BaseUrl);
        Thread.sleep(2000);
        driver.manage().window().maximize();
    }
    @Test(priority=2)
    public void searchsection1() throws Exception {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Dhaka");
        Thread.sleep(5000);

        String LongestOption1=driver.findElement(By.xpath("//*[@id=\"hwdq1\"]/div[1]/span")).getText();
        System.out.println(LongestOption1);

        String ShortestOption2=driver.findElement(By.xpath("//*[@id=\"Zrbbw\"]/div[1]/span")).getText();
        System.out.println(ShortestOption2);

    }
    @Test(priority=3)
    public void searchsection2() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Saturday");
        Thread.sleep(5000);

        String LongestOption2=driver.findElement(By.xpath("//*[@id=\"gLuoSb\"]/div[1]/span")).getText();
        System.out.println(LongestOption2);

        String ShortestOption2=driver.findElement(By.xpath("//*[@id=\"c7mM1c\"]/div[1]/span")).getText();
        System.out.println(ShortestOption2);
    }
    @Test(priority=4)
    public void searchsection3() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Baby");
        Thread.sleep(5000);

        String LongestOption3=driver.findElement(By.xpath("//*[@id=\"hwdq1\"]/div[1]/span")).getText();
        System.out.println(LongestOption3);

        String ShortestOption3=driver.findElement(By.xpath("//*[@id=\"ERWdKc\"]/div[1]/span")).getText();
        System.out.println(ShortestOption3);
    }
    @Test(priority=5)
    public void searchsection4() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("School");
        Thread.sleep(5000);

        String LongestOption4=driver.findElement(By.xpath("//*[@id=\"vTtioc\"]/div[1]/span")).getText();
        System.out.println(LongestOption4);

        String ShortestOption4=driver.findElement(By.xpath("//*[@id=\"c7mM1c\"]/div[1]/span")).getText();
        System.out.println(ShortestOption4);
    }
   @Test(priority=6)
    public void searchsection5() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Cricket");
        Thread.sleep(5000);

        String LongestOption5=driver.findElement(By.xpath("//*[@id=\"gLuoSb\"]/div[1]/span")).getText();
        System.out.println(LongestOption5);

        String ShortestOption5=driver.findElement(By.xpath("//*[@id=\"sBQTL\"]/div[1]/span")).getText();
        System.out.println(ShortestOption5);
    }
    @Test(priority=7)
    public void searchsection6() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Momey");
        Thread.sleep(5000);

        String LongestOption6=driver.findElement(By.xpath("//*[@id=\"sBQTL\"]/div[1]/span")).getText();
        System.out.println(LongestOption6);

        String ShortestOption6=driver.findElement(By.xpath("//*[@id=\"Zrbbw\"]/div[1]/span")).getText();
        System.out.println(ShortestOption6);
    }

    @Test(priority=8)
    public void searchsection7() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Int");
        Thread.sleep(5000);

        String LongestOption7=driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).getText();
        System.out.println(LongestOption7);

        String ShortestOption7=driver.findElement(By.xpath("//*[@id=\"vTtioc\"]/div[1]/span")).getText();
        System.out.println(ShortestOption7);
    }
    @Test(priority=9)
    public void searchsection8() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Look");
        Thread.sleep(5000);

        String LongestOption8=driver.findElement(By.xpath("//*[@id=\"c7mM1c\"]/div[1]/span")).getText();
        System.out.println(LongestOption8);

        String ShortestOption8=driver.findElement(By.xpath("//*[@id=\"ERWdKc\"]/div[1]/span")).getText();
        System.out.println(ShortestOption8);
    }
    @Test(priority=10)
    public void searchsection9() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("Hello");
        Thread.sleep(5000);

        String LongestOption9=driver.findElement(By.xpath("//*[@id=\"gLuoSb\"]/div[1]/span")).getText();
        System.out.println(LongestOption9);

        String ShortestOption9=driver.findElement(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span")).getText();
        System.out.println(ShortestOption9);
    }
    @Test(priority=11)
    public void searchsection10() throws InterruptedException {

        WebElement searchsection=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        searchsection.clear();
        searchsection.sendKeys("By");
        Thread.sleep(5000);

        String LongestOption10=driver.findElement(By.xpath("//*[@id=\"hwdq1\"]/div[1]/span")).getText();
        System.out.println(LongestOption10);

        String ShortestOption10=driver.findElement(By.xpath("//*[@id=\"c7mM1c\"]/div[1]/span")).getText();
        System.out.println(ShortestOption10);
    }
    }