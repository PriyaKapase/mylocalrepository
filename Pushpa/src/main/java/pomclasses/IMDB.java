package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB {
	@FindBy(xpath="//a[text()='January 7, 2022 (United States)']")
	private WebElement date;
	@FindBy(xpath="//a[text()='India']")
	private WebElement IMdborigin;
	
	public void Imdbdate()
	{
		String a = date.getText();
		System.out.println(a);
	}
	public void ImdbCountry()
	{
		String b = IMdborigin.getText();
		System.out.println(b);
	}
	
	public IMDB(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
}
