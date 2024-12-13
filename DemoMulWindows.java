package com.tka.oct_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tka.sep_25.LoginPageOfflineSite;

public class DemoMulWindows {

	
	public static void main(String[] args) {
		
		//index
		//dashboard
		
		//Login
		
		WebDriver driver=LoginPageOfflineSite.getLogIn();
		System.out.println("<<  Page Title >" + driver.getTitle());
		
		
		// inspect to users .html from left slider menu bar
				driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
				System.out.println("User Page--------------");
				System.out.println("Page Title >" +driver.getTitle());
				
				
				//javabykiran
				driver.findElement(By.xpath("/html/body/div/footer/strong/a")).getText();
				
				
				System.out.println("Now Title >" +driver.getTitle());
				
				driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div/section[2]/div[2]/div/div/div[1]/div/p")).getText();
				
				driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a")).click();
				
				
				//jdk -> /html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
				
				//selenium -->/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();
				
				//chrome-->
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span")).click();
				
				
				System.out.println("Get all windows uniqyw names  [Set]");
				
				Set <String> windowNames=driver.getWindowHandles();
				List <String> windowNamesList=new ArrayList<>(windowNames);
				for (String winName : windowNamesList) {
					System.out.println(winName);
				}
				
				
				String jbkSite=windowNamesList.get(1);
				
				driver.switchTo().window(jbkSite);
				System.out.println("Now Title >" +driver.getTitle());
				
				
				System.out.println("=========Thanks==========");
				
				
	}
}
