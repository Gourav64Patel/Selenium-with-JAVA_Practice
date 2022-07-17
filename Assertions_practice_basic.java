import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Assertions_practice_basic {

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
			Assert.assertFalse(driver.findElement(By.xpath(xpath_faf)).isSelected());
			//System.out.println(driver.findElement(By.xpath(xpath_faf)).isSelected());
			
			System.out.println(driver.findElement(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).getText());
			
			}
		else if(chkbox.equalsIgnoreCase("Senior Citizen")) {
			driver.findElement(By.xpath(xpath_sc)).click();
			Assert.assertTrue(driver.findElement(By.xpath(xpath_sc)).isSelected());
			//System.out.println(driver.findElement(By.xpath(xpath_sc)).isSelected());
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
		// TODO Auto-generated method stub

	}

}
