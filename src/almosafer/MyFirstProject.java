package almosafer;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstProject {
	
	              
	private static final Object ExpectedValueForFinshingSearchAboutHotel = null;
	private static final String ExpectedReturn = null;
	WebDriver driver = new ChromeDriver() ;
	String mywebsite = "https://www.almosafer.com/en" ;
	private String expectedDeparture; 
	
	
	@BeforeTest
	
	public void mysetup () {
		
		driver.get(mywebsite); 
		driver.manage().window().maximize(); 
		
	WebElement buttonforthecurency =	driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary")); ;
		buttonforthecurency.click(); 
		
		
	}
	
	@Test(priority = 1,enabled = false)
	public void checkLanEnIsCorrect () { 
		
	String AcctualResult =	driver.findElement(By.tagName("html")).getAttribute("lang") ; 
		String expectedResult = "en" ; 
		
		Assert.assertEquals(AcctualResult, expectedResult);  
		
	} 
	@Test (priority = 2,enabled = false)
	public void CheckSarIsDefualt () { 
String AcctualResult=	driver.findElement(By.xpath("//Button[@data-testid='Header__CurrencySelector']")).getText() ;
		String expectedResult = "SAR" ; 
		Assert.assertEquals(AcctualResult, expectedResult) ; 
		
		
		
	}
	@Test (priority = 3,enabled = false)
	public void CheckNumIsareCorrect ( ) {
	String AcctualNumber =	driver.findElement(By.cssSelector(".sc-hUfwpO.bWcsTG")).getText() ;  
	String expectedNumber = "+966554400000" ; 
	Assert.assertEquals(AcctualNumber, expectedNumber); 
	
	}
	@Test (priority = 4,enabled = false)
	public void verifyGitafLogoIsDisplayed () {
	boolean Acctualresult = 	driver.findElement(By.cssSelector(".sc-ghsgMZ.hIElfs")).isDisplayed() ;
	boolean expectedresult = true ; 
    Assert .assertEquals(Acctualresult, expectedresult); 
		
	}
	@Test (priority = 5,enabled = false)
	public void hotelsTabIsNotByDefualt () {
	WebElement Hotels = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")) ;
     String actualresult=Hotels.getAttribute("aria-selected") ; 
     String exprctedresult = "false" ;  
     Assert.assertEquals(actualresult, exprctedresult); 
		
	}
	
	@Test(priority = 6, enabled = true)
	public void CheckDepatureDate() throws IOException {
		int today = LocalDate.now().getDayOfMonth() ; 
		int Tomorrow = LocalDate.now().plusDays(1).getDayOfMonth() ; 
		int DayAfterTomorrow = LocalDate.now().plusDays(2).getDayOfMonth() ; 
		
	String acctualDepature = 	driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-lnrBVv gKbptE'] span[class='sc-fvLVrH hNjEjT']")).getText();  ;
	String expectedDepature = Integer.toString(Tomorrow) ; 
	Assert.assertEquals(acctualDepature, expectedDepature); 
	

		//String ActualDepature = driver
			//	.findElement(By.cssSelector("div[class='sc-OxbzP sc-lnrBVv gKbptE'] span[class='sc-fvLVrH hNjEjT']"))
			//	.getText();

	
		//Assert.assertEquals(ActualDepature, expectedDeparture);

	}
	@Test(priority = 7,enabled = false)
	public void CheckReturnDat () {
		int today = LocalDate.now().getDayOfMonth() ; 
		int Tomorrow = LocalDate.now().plusDays(1).getDayOfMonth() ; 
		int DayAfterTomorrow = LocalDate.now().plusDays(2).getDayOfMonth() ; 
		
	String acctualReturn = 	driver.findElement(By.cssSelector("div[class='sc-OxbzP sc-bYnzgO bojUIa'] span[class='sc-fvLVrH hNjEjT']")).getText();  ;
	String expectedReturn = Integer.toString(DayAfterTomorrow) ; 
	Assert.assertEquals(acctualReturn, expectedReturn);  
		
		
		
	}

	@Test(priority = 8, enabled = false)
	public void CheckReturnDate() throws IOException {


		String ActualReturn = driver
				.findElement(By.cssSelector("div[class='sc-OxbzP sc-bYnzgO bojUIa'] span[class='sc-fvLVrH hNjEjT']"))
				.getText();

		Assert.assertEquals(ActualReturn, ExpectedReturn);

	}

	@Test(priority = 9, enabled = false)
	public void RandomlyChangeTheLanguage() throws InterruptedException, IOException {


		randomlyEnterTheWebsite();
		
		WebElement HotelSearchBar = driver.findElement(By.cssSelector(".sc-phbroq-2.uQFRS.AutoComplete__Input"));


		CheckTheWebsiteLanguageToEnterTheCityName(HotelSearchBar);

		EnterNumberOfVistorsAfterClickOnTheFirstCity(); 

	}

	private void EnterNumberOfVistorsAfterClickOnTheFirstCity() {
		// TODO Auto-generated method stub
		
	}

	private void CheckTheWebsiteLanguageToEnterTheCityName(WebElement hotelSearchBar) {
		// TODO Auto-generated method stub
		
	}

	private void randomlyEnterTheWebsite() {
		// TODO Auto-generated method stub
		
	}

	@Test(priority = 10, enabled = false)

	public void CheckThatThePageIsFullyLoaded() throws IOException {
		WebElement SearchResult = driver.findElement(By.xpath("//span[@data-testid='srp_properties_found']"));

		boolean ActualResult = SearchResult.getText().contains("found") || SearchResult.getText().contains("مكان");


		Assert.assertEquals(ActualResult, ExpectedValueForFinshingSearchAboutHotel);

	}

	@Test(priority = 11, enabled = false)
	public void CheckTheSortOption() throws InterruptedException, IOException {

		Thread.sleep(15000);

		WebElement SortOption = driver.findElement(By.xpath("//div[@data-testid='srp_sort_LOWEST_PRICE']"));
		SortOption.click();

		Thread.sleep(2000);


		SortOptionChecker();
	}

	private void SortOptionChecker() {
		// TODO Auto-generated method stub
		
	}

	


}
