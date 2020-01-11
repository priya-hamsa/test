package generic_methods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_WebDriver {
	public void navigate_URl(WebDriver driver, String url) {
		driver.navigate().to(url);
	}

	public String get_Title(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public String get_CurrentURL(WebDriver driver) {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public String get_URL(WebDriver driver, String url) {
		driver.get(url);
		System.out.println(url);
		return url;
	}

	public String get_PageSource(WebDriver driver) {
		String src = driver.getPageSource();
		System.out.println(src);
		return src;
	}

	public String get_WindowHandle(WebDriver driver) {
		String winhandle = driver.getWindowHandle();
		System.out.println(winhandle);
		return winhandle;
	}
	
	//prints all the titles of the windows open
	public void get_WindowHandles(WebDriver driver) {
		Set<String> allid = driver.getWindowHandles();
		for (String we : allid) {
			driver.switchTo().window(we);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}
	
	public void maximize_Window(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void implcitWait(WebDriver driver, long secs) {
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
		driver.navigate().back();
	}

	public void navigate_Back(WebDriver driver) {
		driver.navigate().back();
	}

	public void navigate_Forward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void navigate_Refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public WebDriverWait explicit_Wait(WebDriver driver, long secs) {
		WebDriverWait wait = new WebDriverWait(driver, secs);
		return wait;
	}

	public void explicit_WaitUntil(WebDriver driver, long secs, String title) {
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.titleContains(title));

	}

}
