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

public class LoginPage extends BaseClass{

	@FindBy(id="CustomerEmail")
	WebElement email;
	
	@FindBy(id="CustomerPassword")
	WebElement password;
	
	
	@FindBy(xpath="//form[@id='customer_login']/button")
	WebElement signinBtn;
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		email.sendKeys("syamili.das@gmail.com");
		password.sendKeys("Syamili123!");
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", signinBtn);
		
	}
	
	
}
