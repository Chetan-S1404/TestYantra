package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TCPage {

	public TCPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href=\"index.php?/cases/view/70\"])[2]")
	private WebElement FTtestcase;
	
	public WebElement getFTtestcase() {
		return FTtestcase;
	}

	public void clickFTC() {
		FTtestcase.click();
		}
	
	//a[@href="index.php?/cases/view/728"]
	//(//a[@href="index.php?/cases/view/728"])[2]
	@FindBy(xpath = "(//a[@href=\"index.php?/cases/view/728\"])[2]")
	private WebElement LeadFTtestcase;
	
	public WebElement getLeadFTtestcase() {
		return LeadFTtestcase;
	}

	public void clickLeadFTC() {
		LeadFTtestcase.click();
		}
}
