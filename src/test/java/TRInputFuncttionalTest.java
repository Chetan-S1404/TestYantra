import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Repository.FTCPage;
import Repository.PHome;
import Repository.TCPage;
import Repository.TRRepo;
import TCcode.RandomScripts;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TRInputFuncttionalTest {
	
	@Test
	public void runTR() throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://wppe7b.testrail.io/index.php?/dashboard");
		driver.findElement(By.id("name")).sendKeys("manikanta.wppe7@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Qspbtr@123");
		driver.findElement(By.id("button_primary")).click();
		
	TRRepo tr=new TRRepo(driver);
		tr.wait(driver);
		tr.clickSearch(driver);
		tr.wait(driver);
		PHome p=new PHome(driver);
		p.clickTestCase();
		tr.wait(driver);
		
		TCPage t=new TCPage(driver);
		t.clickFTC();
		tr.wait(driver);
		FTCPage f=new FTCPage(driver);
		f.clickedit();
		//tr.wait(driver);
		//f.Selectdd();
		tr.wait(driver);
		f.addstep();
		//div[@element-index="1"]
		RandomScripts rs=new RandomScripts();
		tr.wait(driver);
		rs.Alphabets(driver);
		rs.Numbers(driver);
		rs.SpecialChars(driver);
		rs.Blank(driver);
		
		rs.Alpha_Numeric(driver);
		rs.AlphabetwithSpecial(driver);
		rs.AlphabetwithBlank(driver);
		rs.Number_special(driver);
		rs.Numberwith_Blank(driver);
		rs.Special_Blank(driver);
		
		rs.AlphabetwithNumber_special(driver);
		rs.AlphabetwithNumber_Blank(driver);
		rs.AlphabetwithSpecial_Blank(driver);
		rs.NumberwithSpecial_Blank(driver);
		
		rs.Alpha_NumericwithSpecial_Blank(driver);
		
		
		
		
		
		
		
		
		
		
	}

}
