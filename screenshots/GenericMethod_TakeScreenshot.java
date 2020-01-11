package TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class GenericMethod_TakeScreenshot {
/*
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		public static void getPhoto(WebDriver driver) throws IOException{
		//path of the screenshots folder as "photos" under Project Folder
		String photo = "./photos/";
		//Date Class Object creation
		Date d = new Date();
		//Convert from date format to String format
		String d1 = d.toString();
		//Selenium does not support ":" so replace all to "-" or "/"
		String date = d1.replaceAll(":", "-");
		//Typecasting from TakeScreenshot Interface to WebDriver Interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		//Store the screenshot in a temp Folder
		File src = ts.getScreenshotAs(OutputType.FILE);
		//Store the screenshot in the specified folder>project>photos>filename.jpeg
		File dst = new File(photo+date+".jpeg");
		//Copies the screenshot file from Source(Temp) to dest(specified folder)
		FileUtils.copyFile(src, dst);
		
		}
		
		
		
		
		

	}


