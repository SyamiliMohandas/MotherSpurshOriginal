package syamiliacademy.MotherSparsh.Test;

import org.testng.annotations.Test;

import syamiliacademy.MotherSparsh.Base.BaseClass;
import syamiliacademy.MotherSparsh.Pages.CreateAccount;
import syamiliacademy.MotherSparsh.Pages.HomePage;
import syamiliacademy.MotherSparsh.Pages.LoginPage;

public class BaseTest extends BaseClass {
	
	@Test(priority=0)
	public void clickAccountBtnTest()
	{
		HomePage hp=new HomePage(driver);
		hp.clickAcctBtn();
	}
	@Test(enabled=false)
	public void createAcctLinkTest()
	{
		CreateAccount ca=new CreateAccount(driver);
		ca.createAcctLink();
		ca.acctCreation();
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
	}

}
