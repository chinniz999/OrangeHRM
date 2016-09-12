package com.narayana.orangehrm.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectBox {
	
	public static void selectElementUsingIndex(WebElement webElement,int index){
		Select select=new Select(webElement);
		select.selectByIndex(index);
		
	}
	
	public static void selectElementUsingValue(WebElement webElement,String value){
		Select select=new Select(webElement);
		select.selectByValue(value);
		
	}
	
	
	public static void selectElementUsingVisibleText(WebElement webElement,String visibleText){
		Select select=new Select(webElement);
		select.selectByVisibleText(visibleText);
		
	}

}
