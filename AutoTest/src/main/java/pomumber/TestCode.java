package pomumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCode 
{
	@FindBy(id = "sb_form_q")
	private WebElement searchBar;
	
	public void search(String textToSearch)
	{
		searchBar.sendKeys(textToSearch);
		searchBar.submit();
	}
}
