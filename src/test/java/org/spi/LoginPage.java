package org.spi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\com.maven\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.zalandos.com.in/");
}
}
