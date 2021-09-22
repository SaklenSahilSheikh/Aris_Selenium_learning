package Package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day3demo4draganddrop {
	
	public static String SearchData= "Selenium";
	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		    WebDriver sd=new ChromeDriver();
		    sd.get("https://jqueryui.com/droppable/");
		    Thread.sleep(2000);
		    sd.manage().window().maximize();
		    sd.switchTo().frame(sd.findElement(By.className("demo-frame")));
		    String text=sd.findElement(By.xpath("//*[@id=\"draggable\"]/p")).getText();
		    System.out.println(text);
		    Actions dd=new Actions(sd);
		    WebElement source=sd.findElement(By.id("draggable")); //source
		    WebElement dest=sd.findElement(By.id("droppable")); //dest
		    dd.dragAndDrop(source,dest).build().perform(); // use the actions object to access the class dragAndDrop
		    Thread.sleep(2000);
		    sd.switchTo().defaultContent();
   			sd.close();
			System.out.println("End of Test");

	} 
}

