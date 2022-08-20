package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIKI {
	@FindBy(xpath="(//td[@class='infobox-data'])[10]")
	private WebElement wikidate;
	@FindBy(xpath="(//td[@class='infobox-data'])[12]")
	private WebElement wikiorigin;
	public WIKI(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public WebElement Wikidate()
	{
		String w= wikidate.getText();
		System.out.println(w);
		return wikidate;
	}
	public WebElement WikiCountry()
	{
		String z= wikiorigin.getText();
		System.out.println(z);
		return wikiorigin;
	}

}
