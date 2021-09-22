package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDemo {
	//public static WebDriver d;

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.selenium.dev/downloads/");
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
