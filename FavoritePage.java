package com.keytorc.test.n11test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.keytorc.test.n11test.SearcResultsPage;

public class FavoritePage {

	SearcResultsPage objSearch=new SearcResultsPage(null);
	private static final By DELETE_PRODUCT = By.className("deleteProFromFavorites");
    private static final By EMPTY_WATCHLIST = By.className("emptyWatchList");
    private static final By FAVORITE_PRODUCT = By.className("pro");
    private WebDriver driver;
    private WebDriverWait wait;

    public FavoritePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 45);
    }

    public FavoritePage addFavorites(){
    	objSearch.search();
    	driver.findElement(By.xpath("//*[@id=p-253143910]/div[2]/span")).click();
    	
    	return new FavoritePage(driver);
    }
    
    public FavoritePage deleteFavorites(){
    	driver.findElement(By.xpath("//*[@id=header]/div/div/div[2]/div[2]/div[2]/div[2]/div/a[2]")).click();
    	wait.until(ExpectedConditions.elementToBeSelected(FAVORITE_PRODUCT));
    	wait.until(ExpectedConditions.elementToBeClickable(DELETE_PRODUCT)).click();
    	
    	return new FavoritePage(driver);
    }
    public void checkIfListEmpty(){
        wait.until(ExpectedConditions.presenceOfElementLocated(EMPTY_WATCHLIST));
    }

}
