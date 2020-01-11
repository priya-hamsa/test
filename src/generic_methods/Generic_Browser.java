package generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic_Browser {

	public void close_ChildBrowser(WebDriver driver) {
		Set<String> allid = driver.getWindowHandles();
		for (String we : allid) {
			driver.switchTo().window(we);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}

	public void close_ParentBrowser(WebDriver driver) {
		String parent_Id = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for (String we : allid) {
			driver.switchTo().window(we);
			if (we.equals(parent_Id)) {
				driver.close();
			}
		}
	}

	public void minimize_Browser(WebDriver driver, String url) throws AWTException {
		driver.get(url);
		Robot r = new Robot();
		// Minimize the browser
		// Key Press
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		// keyRelease
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}

	public void print_ParentBrowser(WebDriver driver, String url) {
		driver.get(url);
		String parent_Id = driver.getWindowHandle();
		System.out.println(parent_Id);
	}

	public void count_Browsers_PrintIds_AllBrowsers(WebDriver driver, String url) {
		driver.get(url);
		Set<String> allid = driver.getWindowHandles();
		int count = allid.size();
		System.out.println(count);
		for (String we : allid) {
			System.out.println(we);
		}
	}

	public void print_Title_AllBrowsers(WebDriver driver, String url) {
		driver.get(url);
		Set<String> allid = driver.getWindowHandles();
		int count = allid.size();
		System.out.println(count);
		for (String we : allid) {
			driver.switchTo().window(we);
			String title = driver.getTitle();
			System.out.println(title);
		}

	}

}
