package org.upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	int size = driver.findElements(By.tagName("iframe")).size();
    System.out.println(size);
    
    driver.switchTo().frame("flow_close_btn_iframe");
    driver.findElement(By.id("closeBtn")).click();
    driver.switchTo().defaultContent();
    
}
}