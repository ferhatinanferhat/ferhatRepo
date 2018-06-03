package com.keytorc.test.n11test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.junit.Assert;
public class SearcResultsPage {

    private static final By SECOND_RESULT_PAGE = By.linkText("2");
    private WebDriver driver;
    private WebDriverWait wait;

    public  SearcResultsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 45);
    }
    
    public SearcResultsPage search(){
    	
    	driver.findElement(By.id("searchData")).sendKeys("Samsung");
    	driver.findElement(By.className("searchBtn")).click();
    	driver.findElement(By.xpath("//div[@className='pagination']/a[2]")).click(); 
        Assert.assertTrue(driver.getTitle().equals(SECOND_RESULT_PAGE));
    	return new SearcResultsPage(driver);
    }
   
   
  }
