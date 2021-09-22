package Package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo7_lsrims {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Select the Browser to Execute the script\n");
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		if (choice.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://lsrims-qc.agcloud.bz/lsrims/pages/login");
			d.manage().window().maximize();
			d.findElement(By.id("userNameTxt")).sendKeys("geetha");
			Thread.sleep(2000);
			d.findElement(By.id("passwordTxt")).sendKeys("Password5%");
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div/button")).click();
			Thread.sleep(20000);
			//d.findElement(By.linkText("Forgot password?")).click();
			//Thread.sleep(2000);
			// d.findElement(By.linkText("Sign in")).click();
			//d.findElement(By.partialLinkText("Sign")).click();
			//Thread.sleep(2000);

			d.close();

		}
		else if(choice.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\geckodriver.exe");
			WebDriver d = new FirefoxDriver();
			d.get("https://www.linkedin.com/login");
			d.manage().window().maximize();
			d.findElement(By.id("username")).sendKeys("abc");
			Thread.sleep(2000);
			d.findElement(By.id("password")).sendKeys("abc");
			Thread.sleep(2000);
			d.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
			Thread.sleep(2000);
			d.findElement(By.linkText("Forgot password?")).click();
			Thread.sleep(2000);
			// d.findElement(By.linkText("Sign in")).click();
			d.findElement(By.partialLinkText("Sign")).click();
			Thread.sleep(2000);

			d.close();
			
		}
		else {
			System.out.println("invalid");
		}
	

	} //assignment completed
}

