package pagecomponent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import utility.WebUtil;
import enginecomponent.Base;

public class HomePages extends Base {

	WebUtil webutilobj = new WebUtil();

	@FindBy(xpath = "(//a[@id='nav-hamburger-menu'])[1]")
	WebElement hamburgermenu;

	@FindBy(xpath = "//div[text()='trending']")
	WebElement trendingmenu;

	@FindBy(xpath = "//div[text()='digital content and devices']")
	WebElement digitalcontentanddevicesmenu;
	
	@FindBy(xpath = "//*[@id='hmenu-content']/ul[1]/li[6]/div")
	WebElement digitalcontentmenu;

	@FindBy(xpath = "//div[text()='shop by category']")
	WebElement shopbycategorymenu;

	@FindBy(xpath = "//div[text()='programs & features']")
	WebElement programsandfeaturesmenu;

	@FindBy(xpath = "//div[text()='help & settings']")
	WebElement helpandsettingsmenu;

	@FindBy(xpath = "//div[@class='nav-sprite hmenu-close-icon']")
	WebElement hmenucloseicon;

	@FindBy(xpath = "//a[@id='nav-global-location-popover-link']")
	WebElement locationmenu;

	@FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
	WebElement pincodebar;

	@FindBy(id = "GLUXZipUpdate")
	WebElement applybutton;

	@FindBy(xpath = "(//div[@CLASS='a-box-inner a-alert-container'])[1]")
	WebElement pincodeerrormessage;

//	@FindBy(xpath="//select[@class='a-native-dropdown a-declarative']")
//	WebElement dropdowninsidelocationmenu;

//	@FindBy(xpath="//option[text()='Deliver outside India']")
//	WebElement dropdowninsidelocationmenu;

	@FindBy(xpath = "//*[@id='GLUXCountryList']")
	WebElement dropdowninsidelocationmenu;

	@FindBy(xpath = "//option[text()='Sri Lanka']")
	WebElement srilanka;

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	WebElement searchbox;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement magnifiersearchicon;
	
	@FindBy(xpath="(//*[@id=\"nav-cart\"])[1]")
	WebElement carticon;
	
	@FindBy(xpath="//a[@id='a-autoid-1-announce']")
	WebElement signupbuttoninsideaddtocart;
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement yournametextbox;
	
	@FindBy(xpath="//input[@id='ap_phone_number']")
	WebElement mobilenumbertextbox;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement signuppagecontinuebutton;
	
	@FindBy(xpath="(//select[@id='auth-country-picker'])[1]")
    WebElement phonenumberpincodedropdownmenu;
	
	@FindBy(xpath="//h2[contains(text(), 'Your Amazon Cart is empty')]")
	WebElement cartemptystatus;
	
	@FindBy(id="auth-password-missing-alert")
	WebElement passwordmissingalert;
	
//	@FindBy (xpath="//div[@class='s-main-slot s-result-list s-search-results sg-row']")
//	WebElement laptopslists;
	
	@FindAll({@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']")})
	public List<WebElement> laptopslists;
	
	
	
	
	
	
	public void hMenuValidation() throws Throwable {

		PageFactory.initElements(WebUtil.driver, this);

		webutilobj.pageOpen("https://www.amazon.in");
		
		Thread.sleep(3000);
		eleClick(hamburgermenu);
		Thread.sleep(3000);
		
		isPresentMethod(trendingmenu);
		System.out.println(isPresentMethod(trendingmenu));

		Thread.sleep(3000);
		//isPresentMethod(digitalcontentanddevicesmenu);
		//System.out.println(isPresentMethod(digitalcontentanddevicesmenu));
		
		isPresentMethod(digitalcontentmenu);
		System.out.println(isPresentMethod(digitalcontentmenu));
		
		Thread.sleep(3000);

		isPresentMethod(shopbycategorymenu);
		System.out.println(isPresentMethod(shopbycategorymenu));
		
		Thread.sleep(3000);

		isPresentMethod(programsandfeaturesmenu);
		System.out.println(isPresentMethod(programsandfeaturesmenu));
		
		Thread.sleep(3000);

		isPresentMethod(helpandsettingsmenu);
		System.out.println(isPresentMethod(helpandsettingsmenu));
		
		Thread.sleep(3000);

		eleClick(hmenucloseicon);

	}

	
	public void validPincodeValidation(String pinnum) throws Throwable {

		PageFactory.initElements(WebUtil.driver, this);

		//webutilobj.implicitWaitMethod(10);

		//webutilobj.pageOpen("https://www.amazon.in");

		eleClick(locationmenu);

		sendKeysMethod(pincodebar, pinnum);

		eleClick(applybutton);
		 
	}

	
	public void invalidPincodeValidation() throws Throwable {
		PageFactory.initElements(WebUtil.driver, this);

		webutilobj.pageOpen("https://www.amazon.in");

		//webutilobj.implicitWaitMethod(10);

		eleClick(locationmenu);

		sendKeysMethod(pincodebar, "123456");

		Thread.sleep(5000);
		eleClick(applybutton);
		Thread.sleep(5000);
		// getTextMethod(pincodeerrormessage);
		System.out.println(getTextMethod(pincodeerrormessage));
	}

	
	public void otherCountryValidation() throws Throwable {

		PageFactory.initElements(WebUtil.driver, this);

		webutilobj.pageOpen("https://www.amazon.in");

		//webutilobj.implicitWaitMethod(10);

		eleClick(locationmenu);

		Thread.sleep(5000);

		dropDownMethodWithVisibleText(dropdowninsidelocationmenu, "Sri Lanka");

		Thread.sleep(5000);

		eleClick(srilanka);

		Thread.sleep(5000);

		// dropDownMethodWithValue(dropdowninsidelocationmenu, "LK");

		// dropDownMethodWithIndex(dropdowninsidelocationmenu, 2);

	}
	
	
	public void searchBarValidation1() throws Throwable {
		
		PageFactory.initElements(WebUtil.driver, this);

		webutilobj.pageOpen("https://www.amazon.in");

		//webutilobj.implicitWaitMethod(10);
		
		Thread.sleep(3000);
			
		sendKeysMethod(searchbox, "Mobiles");
		
		Thread.sleep(3000);
		
		eleClick(magnifiersearchicon);
		
		Thread.sleep(3000);
		
		//webutilobj.getCurrentUrlMethod().contains("mobiles");
		
		//System.out.println(webutilobj.getCurrentUrlMethod().contains("Mobiles"));
		
		//Assert.assertTrue(webutilobj.getCurrentUrlMethod().contains(getCurrentUrlMethod()));
		
		System.out.println("Current URL: " + webutilobj.getCurrentUrlMethod());
		
		Thread.sleep(3000);
		 
		//Assert.assertTrue(webutilobj.getCurrentUrlMethod().contains("mobiles"));
		
		Assert.assertTrue(webutilobj.getCurrentUrlMethod().contains("Mobiles"));
		
		Thread.sleep(3000);
		
		
		
		webutilobj.getTitleMethod();
		
		Thread.sleep(3000);
		
		System.out.println("Current title: " + webutilobj.getTitleMethod());
		
		Thread.sleep(3000);
		
		Assert.assertEquals(getTitleMethod(), "Amazon.in : Mobiles");
		
		Thread.sleep(3000);

	}
	
	
	public void searchBarValidation2() throws Throwable {
		
		PageFactory.initElements(WebUtil.driver, this);

		webutilobj.pageOpen("https://www.amazon.in");

		//webutilobj.implicitWaitMethod(10);
		
		Thread.sleep(3000);
			
		sendKeysMethod(searchbox, "Laptops");
		
		eleClick(magnifiersearchicon);
		
        System.out.println("Current URL: " + webutilobj.getCurrentUrlMethod());
		
		Thread.sleep(3000);
		
		Assert.assertTrue(webutilobj.getCurrentUrlMethod().contains("Laptops"));
		
		System.out.println(webutilobj.getCurrentUrlMethod().contains("Laptops"));
		
		listElementsMethod(laptopslists);
		
		
	}
	
	
	public void signUpThroughAddToCart() throws Throwable {
		
		PageFactory.initElements(WebUtil.driver, this);

		webutilobj.pageOpen("https://www.amazon.in");

		//webutilobj.implicitWaitMethod(10);
		
		Thread.sleep(3000);
		
		eleClick(carticon);
		
		getTextMethod(cartemptystatus);
		
		System.out.println(getTextMethod(cartemptystatus));
		
		Assert.assertEquals(getTextMethod(cartemptystatus), "Your Amazon Cart is empty");
		
		eleClick(signupbuttoninsideaddtocart);
		
		sendKeysMethod(yournametextbox,"abcdef");
		
		dropDownMethodWithValue(phonenumberpincodedropdownmenu, "CA");
		
		
		sendKeysMethod(mobilenumbertextbox,"1234567890");
		
		eleClick(signuppagecontinuebutton);
		
        getTextMethod(passwordmissingalert);
        
        System.out.println( getTextMethod(passwordmissingalert));
		
		Assert.assertEquals(getTextMethod(passwordmissingalert), "Enter your password");
		
		
		
		
	}
	
	

}
