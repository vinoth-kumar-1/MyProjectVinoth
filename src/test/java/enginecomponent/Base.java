package enginecomponent;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.WebUtil;

public class Base  extends WebUtil{
	
	//WebUtil webutilobj  = new WebUtil();
	
	@BeforeMethod(alwaysRun=true)
	public void beforetest() {
		
		browserOpen(readProperty("browser"));
		browserMaximize();
		implicitWaitMethod(5);
		pageOpen(readProperty("url"));
		
	}
	


	@AfterMethod(alwaysRun=true)
	public void aftertest() {
		browserClose();
	}
}
