package com.tka.sep_19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String act_title =driver.getTitle();
		
		String exp_title ="YouTube";
		
		System.out.println("Dev act_title > " + act_title);
		System.out.println("BRD exp_title > " + exp_title);
		
		if(act_title .equals(exp_title))
		
			System.out.println("Pass");
		else
			System.out.println("Fail");
		}
	
		
		
	}


