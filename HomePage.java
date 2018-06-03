package com.keytorc.test.n11test;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private static final String N11_HOME_PAGE_URL = "http://www.n11.com";
   
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

    }

    public HomePage open(){
        driver.get(N11_HOME_PAGE_URL);
        return this;
    }

    public void close(){
        driver.quit();
        
    }


}
