package Package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2demo10DifferentTypes {
	
	public static String SearchData;
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
	    WebDriver myD=new ChromeDriver();
		myD.get("https://www.amazon.in");
		myD.manage().window().maximize();
		Thread.sleep(1000);
		Select dropDownValue=new Select(myD.findElement(By.id("searchDropdownBox")));
		Thread.sleep(1000);
		dropDownValue.selectByValue("search-alias=todays-deals");
		Thread.sleep(1000);
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung zfold3");
		Thread.sleep(1000);
		myD.findElement(By.xpath(Constants.XPATH_NAME_OF_VARIABLE)).click();
		Thread.sleep(1000);
		myD.findElement(By.xpath("//*[@id=\"p_n_availability/1318485031\"]/span/a/div/label/i")).click();
		Thread.sleep(2000);

		String text=myD.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
		if(text.contains("samsung zfold3"))
		{
			System.out.println("Search Result : Pass");
		}
		else
		{
			System.out.println("Search Result : Fail");
		}
		String title=myD.getTitle();
		if(title.contains("fold3")) {
			System.out.println("Title is : Pass");
		}
		else {
			System.out.println("Title is : Fail");
		}
		
		
//
//		
//		Select monthSelect=new Select(myD.findElement(By.name("param[start_month]")));
//		monthSelect.selectByValue("12");
//		Thread.sleep(5000);
//		monthSelect.selectByIndex(4);
//		Thread.sleep(5000);
//		monthSelect.selectByVisibleText("Jul");
//		Thread.sleep(5000);
//		
//		myD.findElement(By.xpath("//input[@value='Calculate']")).click();
//		
//		
//		String vMPay=myD.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
//		System.out.println("Total Montly Payment is "+vMPay);
//		
		Thread.sleep(5000);
		myD.close();
		System.out.println("End of Test");

	} 
}


