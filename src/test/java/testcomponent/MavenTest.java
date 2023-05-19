package testcomponent;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import enginecomponent.Base;
import pagecomponent.HomePages;

public class MavenTest extends Base {

	@Test(groups= {"smoke"})
	public void test01() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.hMenuValidation();
	}

	@Test(groups= {"smoke"})
	//@Parameters({"pinnumbervalue"})
	public void test02() throws Throwable {
		HomePages homepagesobject = new HomePages();
		//homepagesobject.validPincodeValidation(excelmethod(0,2,5));
		
		homepagesobject.validPincodeValidation(excelmethod(0,3,5));
		
		//homepagesobject.validPincodeValidation("600001");
	}
	


	@Test(groups= {"sanity"})
	public void test03() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.invalidPincodeValidation();
	}

	@Test(groups= {"sanity"})
	public void test04() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.otherCountryValidation();

	}

	@Test(groups= {"regression"})
	public void test05() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.searchBarValidation1();
	}

	@Test(groups= {"regression"})
	public void test06() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.searchBarValidation2();

	}

	@Test(groups= {"regression"})
	public void test07() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.signUpThroughAddToCart();
	}

}
