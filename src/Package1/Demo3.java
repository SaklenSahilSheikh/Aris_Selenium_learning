package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.linkedin.com/login");
		d.manage().window().maximize();
		d.findElement(By.id("username")).sendKeys("abc");
		Thread.sleep(2000);
		d.findElement(By.id("password")).sendKeys("abc");
		Thread.sleep(2000);
		String text=d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).getText();
		Thread.sleep(5000);
		//String text;
		//text=d.findElement(By.className("error-for-username")).getText();
		System.out.println("error-for-username : "+text);
		
	
		d.close();
		

}
}
