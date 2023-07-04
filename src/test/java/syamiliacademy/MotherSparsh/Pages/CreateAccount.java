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

public class CreateAccount extends BaseClass {

	
	@FindBy(xpath="//a[@href='/account/register']")
	WebElement createAcctLink;
	
	@FindBy(id="RegisterForm-FirstName")
	WebElement firstName;
	
	@FindBy(id="RegisterForm-LastName")
	WebElement lastName;
	
	@FindBy(id="RegisterForm-dob")
	WebElement dob;
	
	@FindBy(id="RegisterForm-email")
	WebElement email;
	
	@FindBy(id="RegisterForm-password")
	WebElement password;
	
	@FindBy(id="tc-check")
	WebElement checkBox;
	
	@FindBy(xpath="//button[@class='sub-btn']")
	WebElement createBtn;
	
	
	@FindBy(id="webklipper-publisher-widget-container-survey-frame")
	WebElement frame;
	
	
	@FindBy(id="survey-close-div")
	WebElement frameCloseBtn;
	public CreateAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void createAcctLink()
	{
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView()", createAcctLink);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(createAcctLink));
		//Actions actions = new Actions(driver);
		//actions.moveToElement(createAcctLink).click().build().perform();
		//createAcctLink.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",createAcctLink);
	}
	
	public void acctCreation()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

		//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("webklipper-publisher-widget-container-survey-frame"));
		//wait.until(ExpectedConditions.visibilityOf(frame));
		
		wait.until(ExpectedConditions.visibilityOf(firstName));
		firstName.sendKeys("Syamili");
		lastName.sendKeys("Mohandas");
		dob.sendKeys("19/12/1990");
		email.sendKeys("syamili.das@gmail.com");
		password.sendKeys("Syamili123!");
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//
//		driver.switchTo().frame("webklipper-publisher-widget-container-survey-frame");
//		frameCloseBtn.click();
//		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(checkBox));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()",checkBox);
		//checkBox.click();
		//createBtn.click();
		executor.executeScript("arguments[0].click()",createBtn);
		
		
	}
}
