package generic_methods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_Select {

	// public static void main(String[] args) {
	public void selectByIndex(WebElement ele, int i) {
		Select s = new Select(ele);
		s.selectByIndex(i);

	}

	public void selectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public void selectByText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public void deselectByIndex(WebElement ele, int index) {
		Select s = new Select(ele);
		s.deselectByIndex(index);

	}

	public void deselectByValue(WebElement ele, String value) {
		Select s = new Select(ele);
		s.deselectByValue(value);

	}

	public void deselectByText(WebElement ele, String text) {
		Select s = new Select(ele);
		s.deselectByVisibleText(text);

	}

	public void deselectAll(WebElement ele) {
		Select s = new Select(ele);
		s.deselectAll();
		
	}

	public String printText_AllOptions(WebElement ele, String text) {
		Select s = new Select(ele);
		
		List<WebElement> options = s.getOptions();
		// int count = options.size();
		for (WebElement we : options) {
			text = we.getText();
			System.out.println(text);

		}
		return text;
	}
	public ArrayList<String> getAllSelected_Options(WebElement ele)
	{
		Select s = new Select(ele);
		List<WebElement> options = s.getAllSelectedOptions();
		ArrayList<String>l = new ArrayList<String>();
		for(WebElement we : options)
		{
			String val = we.getText();
			l.add(val);
		}
		return l;
	}
	public WebElement getFirstSelected_Option(WebElement ele){
		Select s = new Select(ele);
		WebElement first_option = s.getFirstSelectedOption();
		return first_option;
	}
	
	
}
