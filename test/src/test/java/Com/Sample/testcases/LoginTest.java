package Com.Sample.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.Sample.base.basepage;
import Com.Sample.pages.LoginPage;
import Com.Sample.utilities.PropertiesFile;
import Com.Sample.utilities.ReadExcelData;

public class LoginTest extends basepage {
	LoginPage lp;

	public LoginTest() {
		super();
	}

	@BeforeMethod
	public void Setup() throws IOException {
		setup();
		lp = new LoginPage(null);
	}

	@Test(priority = 1, groups= {"smoke"})
	public void correctemailtest() throws Exception {

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(LoginPage.btn_Login2).click();
		//driver.findElement(LoginPage.txt_username).sendKeys(PropertiesFile.prop.getProperty("number"));
		//driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("password"));
		ReadExcelData excel = new ReadExcelData();
        String USERID = excel.readingData(0, 1);
        String PASSWORD = excel.readingData(1, 1);
        driver.findElement(LoginPage.txt_username).sendKeys(USERID);
        driver.findElement(LoginPage.txt_password).sendKeys(PASSWORD);
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("Assertion is passed");		
	}

	@Test(priority = 2, groups= {"smoke"})
	public void Incorrectemailtest() throws InterruptedException {

		driver.findElement(LoginPage.btn_Login1).click();
		Thread.sleep(2000);
		driver.findElement(LoginPage.btn_Login2).click();
		driver.findElement(LoginPage.txt_username).sendKeys(PropertiesFile.prop.getProperty("number"));
		driver.findElement(LoginPage.txt_password).sendKeys(PropertiesFile.prop.getProperty("password2"));
		driver.findElement(LoginPage.btn_button1).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, null);
		Assert.assertEquals(driver.getTitle(),
				"Online hopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	

}
