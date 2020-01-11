package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic_Frames {

	public void switch_ToFrame_ByIndex(WebDriver driver, String index) {
		driver.switchTo().frame(index);
	}

	public void switch_ToFrame_ByID(WebDriver driver, String index, String id) {
		driver.switchTo().frame(id);
	}

	public void switch_ToFrame_ByWebElement(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void switch_fromFrame_ToPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void switch_ToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}


}
