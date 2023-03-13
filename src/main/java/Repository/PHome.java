package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PHome {
	public PHome (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[.='Test Cases'])[2]")
	private WebElement Testcasebutton;
	
	public WebElement getTestcasebutton() {
		return Testcasebutton;
	}
	
	public void clickTestCase() {
		Testcasebutton.click();
		Testcasebutton.click();
		}
	
	
	
	
	
	
	
	
	
	
}
