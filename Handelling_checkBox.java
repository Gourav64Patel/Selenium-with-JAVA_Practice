import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelling_checkBox {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String chkbox=input.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String xpath_faf="//input[@id='ctl00_mainContent_chk_friendsandfamily']";
		String xpath_sc="//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']";
		String xpath_ia="//input[@id='ctl00_mainContent_chk_IndArm']";
		String xpath_sd="//input[@id='ctl00_mainContent_chk_StudentDiscount']";
		String xpath_unac="//input[@id='ctl00_mainContent_chk_Unmr']";
		
		if(chkbox.equalsIgnoreCase("Family and Friends")) {
			driver.findElement(By.xpath(xpath_faf)).click();
			System.out.println(driver.findElement(By.xpath(xpath_faf)).isSelected());
			System.out.println(driver.findElement(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).getText());
			
			}
		else if(chkbox.equalsIgnoreCase("Senior Citizen")) {
			driver.findElement(By.xpath(xpath_sc)).click();
			System.out.println(driver.findElement(By.xpath(xpath_sc)).isSelected());
			System.out.println(driver.findElement(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).getText());
		}
		else if(chkbox.equalsIgnoreCase("Indian Armed Forces")) {
			driver.findElement(By.xpath(xpath_ia)).click();
			System.out.println(driver.findElement(By.xpath(xpath_ia)).isSelected());
			System.out.println(driver.findElement(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).getText());
		}
		else if(chkbox.equalsIgnoreCase("Student")) {
			driver.findElement(By.xpath(xpath_sd)).click();
			System.out.println(driver.findElement(By.xpath(xpath_sd)).isSelected());
			System.out.println(driver.findElement(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).getText());
		}
		else if(chkbox.equalsIgnoreCase("Unaccompanied Minor")) {
			driver.findElement(By.xpath(xpath_unac)).click();
			System.out.println(driver.findElement(By.xpath(xpath_unac)).isSelected());
			System.out.println(driver.findElement(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).getText());
		}
		else {
			System.out.println("invalid check box ");
		}
		
		//code to handle radio buttons
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[5]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[3]/td[1]/a")).click();
		
	}

}
