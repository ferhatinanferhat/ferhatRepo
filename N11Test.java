package com.keytorc.test.n11test;

import com.keytorc.test.n11test.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class N11Test {
	
	private WebDriver driver;
    private HomePage homePage;
    private static final String loginUser = "";
    private static final String loginPassword = "";
    private static final String searchContext = "samsung";

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ferhat\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @BeforeMethod(alwaysRun = true)
    public void openHomePage() {
        homePage = new HomePage(driver).open();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testAddingItemToWishList() {
    	HomePage homePage=new HomePage(driver);
    	homePage.open();
    	LoginPage loginPage =new LoginPage(driver);
        loginPage.loginUser();
        SearcResultsPage searchResultsPage=new SearcResultsPage(driver);
        SearcResultsPage searchResultsPageTwo = searchResultsPage.search();
        FavoritePage favoritesPage=new FavoritePage(driver);
        FavoritePage favoritesPageTwo =favoritesPage.addFavorites();
        favoritesPage.deleteFavorites();
        favoritesPage.checkIfListEmpty();
        
        

    }

}
