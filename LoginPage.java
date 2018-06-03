package com.keytorc.test.n11test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
	

	    private WebDriver driver;
	    private WebDriverWait wait;

	    public LoginPage(WebDriver driver){
	        this.driver = driver;
	        this.wait = new WebDriverWait(this.driver, 45);
	    }

	    public LoginPage loginUser(){
	    
	       driver.findElement(By.id("email")).sendKeys("");
	       driver.findElement(By.id("password")).sendKeys("");
	       driver.findElement(By.id("loginButton")).click();
	      
	        return new LoginPage(driver);
	    }
	}
