import java.util.Scanner;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException  {
		
			Scanner c=new Scanner(System.in);
			System.out.println("please enter the boarding station ");
			String from=c.nextLine();
			System.out.println("please enter the Arrival station ");
			String to=c.nextLine();
			
			System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			
			//xpath stored to variables
//********************************************************************************************************							
			String x_path_from="//a[@value="+"'"+from+"'"+"]";
			String x_path_to="(//a[@value="+"'"+to+"'"+"])[2]";
//********************************************************************************************************	
			System.out.println(x_path_from);
			
			//Practicing Dynamic Dropdowns which works based on user inputs
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath(x_path_from)).click();
			Thread.sleep(2000L);
			driver.findElement(By.xpath(x_path_to)).click();
			

	}
	
		
	}

