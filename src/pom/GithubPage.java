package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://github.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("login_field")).sendKeys("PRIYA.HAMSA@GMAIL.COM");
		driver.findElement(By.id("password")).sendKeys("Prithvin1$");
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("dashboard-repos-filter-left")).sendKeys("Gmail_Sel_Project");
		driver.findElement(By.xpath("//span[.='Gmail_Sel_Project']")).click();
		
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("empty-setup-clone-url"));
		String val = ele.getAttribute("value"); 
		System.out.println(val);
		
		List<WebElement> txts = driver.findElements(By.xpath("(//span[contains(@class,'user-select-contain')]/..)[1]"));
		for(WebElement we : txts)
		{
			String txt = we.getText();
			System.out.println(txt);
		}
		

	}

}
