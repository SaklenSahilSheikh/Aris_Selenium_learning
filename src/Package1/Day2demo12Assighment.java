package Package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2demo12Assighment {
	
	public static String SearchData= "Selenium";
	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004944\\Desktop\\Sep 2021\\16-9-2021\\chromedriver.exe");
		    WebDriver myD=new ChromeDriver();
		    myD.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
			myD.manage().window().maximize();
			Thread.sleep(1000);
			String food="100",clothing="100",shelter="100",Monthly_Pay="1000",Monthly_Other="100";
			myD.findElement(By.id("food")).sendKeys(food);
			Thread.sleep(1000);
			myD.findElement(By.id("clothing")).sendKeys(clothing);
			Thread.sleep(1000);
			myD.findElement(By.id("shelter")).sendKeys(shelter);
			Thread.sleep(1000);
			String totalMonthlyExpenses=myD.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
			Thread.sleep(1000);
			myD.findElement(By.id("monthlyPay")).sendKeys(Monthly_Pay);
			Thread.sleep(1000);
			myD.findElement(By.id("monthlyOther")).sendKeys(Monthly_Other);
			Thread.sleep(1000);
			String totalMonthlyIncome=myD.findElement(By.id("totalMonthlyIncome")).getAttribute("value"); 
			Thread.sleep(1000);
			float monthlyExpense = Float.parseFloat(totalMonthlyExpenses);
			float monthlyPay = Float.parseFloat(totalMonthlyIncome);
			if(monthlyExpense > monthlyPay){
				 System.out.println("Monthly Expense is greater than Monthly Pay");
			}
			else if(monthlyExpense < monthlyPay){
				 System.out.println("Monthly Expense is less than Monthly Pay");
			}
			else{
				 System.out.println("Monthly Expense is equal to Monthly Pay");
			}		
			Thread.sleep(1000);
			myD.close();
			System.out.println("End of Test");

	} 
}

