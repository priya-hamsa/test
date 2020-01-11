package generic_methods;

import org.openqa.selenium.WebElement;

public class Generic_WebElement {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub

	// }
	public void clear_textBox(WebElement ele) {
		ele.clear();
	}

	public void click_Element(WebElement ele) {
		ele.click();
	}

	public String getAttributeValue(WebElement ele, String attribute_Name) {
		String attribute_Value = ele.getAttribute(attribute_Name);
		System.out.println(attribute_Value);
		return attribute_Value;
	}

	public String getCSS_Value(WebElement ele, String attribute) {// attribute
																	// can be
																	// colors,fontsize,height,width
		String att_value = ele.getCssValue(attribute);
		System.out.println(att_value);
		return att_value;
	}
	
	public int location_x(WebElement ele){
		int x = ele.getLocation().getX();
		System.out.println(x);
		return x;
	}
	public int location_y(WebElement ele){
		int y = ele.getLocation().getY();
		System.out.println(y);
		return y;
	}
	
				
}
