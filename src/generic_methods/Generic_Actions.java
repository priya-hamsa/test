package generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Actions {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	public void mouseHover_Action(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}

	public void dragAndDrop_Action(WebDriver driver, WebElement ele1, WebElement ele2) {
		Actions act = new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();
	}

	public void doubleClick_Action(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}

	public void doubleClick_Action_TargetWebElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
	//rightclick or Context click
	public void rightClick_Action(WebDriver driver, WebElement ele){
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	public void rightClick_Action_OnElement(WebDriver driver, WebElement ele){
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	
}
