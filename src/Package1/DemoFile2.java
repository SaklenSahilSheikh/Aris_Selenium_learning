package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFile2 {
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\geckodriver.exe");
		WebDriver d=new FirefoxDriver(); 
		d.get("https://www.google.com/");
		String title=d.getTitle();
		System.out.println("this is the title "+title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();	
	}

}


