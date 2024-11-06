package almosafer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstProject {
	
	
	WebDriver driver = new ChromeDriver() ;
	String mywebsite = "https://www.almosafer.com/en" ; 
	
	
	@BeforeTest
	
	public void mysetup () {
		
		driver.get(mywebsite); 
		driver.manage().window().maximize(); 
		
	WebElement buttonforthecurency =	driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary")); ;
		buttonforthecurency.click(); 
		
		
	}
	
	@Test(priority = 1)
	public void checkLanEnIsCorrect () { 
		
	String AcctualResult =	driver.findElement(By.tagName("html")).getAttribute("lang") ; 
		String expectedResult = "en" ; 
		
		Assert.assertEquals(AcctualResult, expectedResult);  
		
	} 
	@Test (priority = 2)
	public void CheckSarIsDefualt () { 
String AcctualResult=	driver.findElement(By.xpath("//Button[@data-testid='Header__CurrencySelector']")).getText() ;
		String expectedResult = "SAR" ; 
		Assert.assertEquals(AcctualResult, expectedResult) ; 
		
		
		
	}
	@Test (priority = 3)
	public void CheckNumIsareCorrect ( ) {
	String AcctualNumber =	driver.findElement(By.cssSelector(".sc-hUfwpO.bWcsTG")).getText() ;  
	String expectedNumber = "+966554400000" ; 
	Assert.assertEquals(AcctualNumber, expectedNumber); 
	
	}
	@Test (priority = 4)
	public void verifyGitafLogoIsDisplayed () {
	boolean Acctualresult = 	driver.findElement(By.cssSelector(".sc-ghsgMZ.hIElfs")).isDisplayed() ;
	boolean expectedresult = true ; 
    Assert .assertEquals(Acctualresult, expectedresult); 
		
	}
	


}
