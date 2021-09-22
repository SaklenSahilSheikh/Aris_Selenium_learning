package Package1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day4demo2implicitwait {
	
	public static String SearchData= "Selenium";
	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.get("https://accounts.google.com");
		    
		    System.out.println(driver.getTitle());
		    driver.findElement(By.linkText("Helllp")).click();
		    
		    driver.quit();

	} 
}

