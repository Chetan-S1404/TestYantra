package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FTCPage {

	public FTCPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='index.php?/cases/edit/70/1']")
	private WebElement editbutton;
	
	@FindBy(xpath = "//a[.='Test Case (Steps)']")
	private WebElement DDTemplate;
	
	@FindBy(xpath = "//a[.='Add the first step']")
	private WebElement addStepLink;
	
	@FindBy(xpath = "//div[@element-index=\"1\"]")
	private WebElement StepdescriptionTF;
	
	@FindBy(xpath = "//div[@element-index=\"2\"]")
	private WebElement ExpectedResultTF;
	
	//@FindBy(className = "icon-add icon-small-inline")
	//private WebElement AddStepbutton;
	
	public WebElement getEditbutton() {
		return editbutton;
	}


	public WebElement getDDTemplate() {
		return DDTemplate;
	}


	public WebElement getAddStepLink() {
		return addStepLink;
	}


	public WebElement getStepdescriptionTF() {
		return StepdescriptionTF;
	}


	public WebElement getExpectedResultTF() {
		return ExpectedResultTF;
	}


	//public WebElement getAddStepbutton() {
	//	return AddStepbutton;
	//}

	
	public void clickedit() {
		editbutton.click();
		}
	
	public void Selectdd() {
		DDTemplate.click();
		}
	
	public void addstep() {
		addStepLink.click();
		}
	//href="index.php?/cases/edit/728/1"
	@FindBy(xpath = "//a[@href='index.php?/cases/edit/728/1']")
	private WebElement Leadeditbutton;
	
	public void Leadclickedit() {
		Leadeditbutton.click();
		}
	
}
