package syamiliacademy.MotherSparsh.Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import syamiliacademy.MotherSparsh.Base.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//a[@class='header__icon header__icon--account link focus-inset small-hide']")
	WebElement account;
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}



	public void clickAcctBtn()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(account));
		account.click();
	}
}
