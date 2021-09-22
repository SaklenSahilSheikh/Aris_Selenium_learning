package Package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day3demo3 {
	
	public static String SearchData= "Selenium";
	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		    WebDriver d=new ChromeDriver();
		    d.get("https://www.amazon.in/");
		    Actions sMouse=new Actions(d);
		    sMouse.moveToElement(d.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span"))).build().perform(); // mouse hover
		    Thread.sleep(3000);
		    d.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[3]/a[1]/span")).click(); // after hover clicking on option
		    Thread.sleep(3000);
			d.close();
			System.out.println("End of Test");

	} 
}

