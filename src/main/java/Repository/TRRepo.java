package Repository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TRRepo {
	
	public TRRepo (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "search_query")
	private WebElement searchbar;
	
	
	
	
	
	
	
	public WebElement getSearchbar() {
		return searchbar;
	}


	


	

	

	public void clickSearch(WebDriver driver) {
		
		searchbar.sendKeys("P10");
		searchbar.sendKeys(Keys.ENTER);
	}
	
	
 
	
	
	
 public void wait (WebDriver driver) {
	 driver.manage().timeouts().getImplicitWaitTimeout().ofSeconds(10);
 }
}
