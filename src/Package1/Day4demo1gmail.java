package Package1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day4demo1gmail {
	
	public static String SearchData= "Selenium";
	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://accounts.google.com");
		    Thread.sleep(2000);
		    System.out.println(driver.getTitle());
		    driver.findElement(By.linkText("Help")).click();
		    Thread.sleep(2000);
		    
		    Set<String> ids=driver.getWindowHandles(); // getting id of the open windows,  set is a storing type it cannot accept duplicate data
		    System.out.println(ids);
		    
		    Iterator<String> it=ids.iterator(); // iterating through the open windows
		    
		    String parentId=it.next(); // 
		    String childId=it.next();
		    
		    driver.switchTo().window(childId);
		    
		    System.out.println(driver.getTitle()); // from here it will get the current window title
		    Thread.sleep(2000);
//		    driver.findElement(By.linkText("Privacy")).click();
//		    Thread.sleep(3000);
		    driver.quit();

	} 
}

