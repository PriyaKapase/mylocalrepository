package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pojo {
	public static WebDriver openbrowser()
	{
	System.setProperty("webdriver.chrome.driver","E:\\SOFTWARE TESTING\\automation\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
return driver;
}
}