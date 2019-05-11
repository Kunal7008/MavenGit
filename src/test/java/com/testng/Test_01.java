package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_01 {
@Test
public void start() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Desktop\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://jio.com");
	String s=driver.getTitle();
	System.out.println(s);
	
}
}
