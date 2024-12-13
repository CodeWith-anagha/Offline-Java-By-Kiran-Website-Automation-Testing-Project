package com.tka.sep_25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPageAutomatelist {

	public static void main(String[] args) {
		
	
	WebDriver driver =	LoginPageOfflineSite.getLogIn();
	System.out.println("Now Dashboard page testing");
	///html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3
	
	System.out.println("Subject List : ");
		for(int i=1;i<=4;i++) {
		WebElement WebEleSub01=driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div["+i+"]/div/div[1]/h3"));
	System.out.println("    >"  + WebEleSub01.getText());


		
	}
	
	}

}
