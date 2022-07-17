import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_withoutstatic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int adult,child,infant;
		Scanner a=new Scanner(System.in);
		adult=a.nextInt();
		Scanner c=new Scanner(System.in);
		child=c.nextInt();
		Scanner i=new Scanner(System.in);
		infant=i.nextInt();
		
	
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
	
		for(int j=1;j<=adult;j++)
		{
			if(adult>0 && adult<=9) {
			driver.findElement(By.id("hrefIncAdt")).click();
			}
			
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
        
	}	
			
}
