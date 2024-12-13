package com.tka.sep_23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseInorNot {

public static void main(String[] args) {
		
		
		final String offlineSiteUrl="file:///C:/Users/Shrutiiiiii/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html";
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(offlineSiteUrl);	
		String title01=driver.getTitle();
		System.out.println(" Before Title >" +title01);
		
		WebElement emailTxtBx= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input"));
		emailTxtBx.sendKeys("kiran@gmail.com");
		
		WebElement passwordTxtBx= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input"));
		 passwordTxtBx.sendKeys("123456");
		
		 WebElement btnsignin= driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button"));
		 btnsignin.click() ;
		 
		 String title02=driver.getTitle();
	     System.out.println(" After Title >" +title02);
	     
	     if(title01.equals(title02))
	     {
	    	 System.out.println("Failed------ Due to same title");
	     }
	     else
	     {
	    	 System.out.println("Passed---------Due to missmatched title");
	     }
		 
		 System.out.println("Thanks...............>");
}
}

