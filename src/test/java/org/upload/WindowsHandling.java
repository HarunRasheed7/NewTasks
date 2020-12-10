package org.upload;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	
	String parent = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	for (String x : child) {
		if (!parent.equals(x)) {
			driver.switchTo().window(x);
			
		}
	}
	
	driver.findElement(By.name("emailid")).sendKeys("harun@mail.com");
}
}
