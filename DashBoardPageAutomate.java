package com.tka.sep_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;



 class DashBoardPageAutomate {

	public static void main(String[] args)  {
		
	WebDriver driver =	LoginPageOfflineSite.getLogIn();
		System.out.println("Now Dashboard page testing");
		
	
		List<WebElement> subList=driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]"));
		for (WebElement sub : subList) {
			System.out.println(sub.getText());
		}
	
		
}
}
