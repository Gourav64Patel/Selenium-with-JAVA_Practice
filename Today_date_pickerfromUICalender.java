import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Today_date_pickerfromUICalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("please enter the boarding station ");
		String from=c.nextLine();
		from=from.toUpperCase();
		System.out.println("please enter the Arrival station ");
		String to=c.nextLine();
		to=to.toUpperCase();
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//xpath stored to variables
//********************************************************************************************************							
		String x_path_from="//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value="+"'"+from+"'"+"]";
		String x_path_to=" //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value="+"'"+to+"'"+"]";
//********************************************************************************************************	
		System.out.println(x_path_from);
		
		//Practicing Dynamic Dropdowns which works based on user inputs
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath(x_path_from)).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath(x_path_to)).click();
		
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[4]/td[1]/a")).click();
	}

}
