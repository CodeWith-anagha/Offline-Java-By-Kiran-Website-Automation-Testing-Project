package com.tka.sep_26;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.tka.sep_25.LoginPageOfflineSite;

public class UserPageTC {
	public static void main(String[] args) {
		
		WebDriver driver =LoginPageOfflineSite.getLogIn();
		
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		System.out.println("Users Page------");
		
		System.out.println("Users List :");
		
		
		List <WebElement>userData =driver.findElements(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div"));
		for (WebElement element : userData) {
			System.out.println(element.getText());
		}
		
}
}
