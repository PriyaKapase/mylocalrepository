package testclass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseclass.Pojo;
import pomclasses.IMDB;
import pomclasses.WIKI;

public class PushpaTestclass extends Pojo {
	WebDriver driver;
	IMDB obj;
	WIKI obj1;
	SoftAssert soft;
	
	@BeforeTest
	public void beforetest()
	{
		driver =openbrowser();
		
	}
	
	@BeforeClass
	public void beforeclass()
	{
		obj =new IMDB(driver);

		obj1 =new WIKI(driver);
		soft=new SoftAssert();
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
	driver.get("https://www.imdb.com/title/tt9389998/?ref_=fn_al_tt_1");
		
		 obj.Imdbdate();
		 Thread.sleep(3000);
		 obj.ImdbCountry();
		Thread.sleep(3000);
		driver.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
		obj1.Wikidate();
		Thread.sleep(3000);
		obj1.WikiCountry();
		 String c="January 7, 2022 (United States)";
		 String d ="17 December 2021";
		 soft.assertEquals(c, d,"both result are diff");
		 soft.assertAll();
	Thread.sleep(3000);
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
}
