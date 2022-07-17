import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Using_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		String name= sc.nextLine();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//implicit wait it wait for any line of code for atmost 3 seconds.
		
		String code=Password(driver);//METHOD TO GET PASSWORD FROM STRING
		
		website(driver);//METHOD TO INVOKE BROWSER
		
		login(driver, name);//METHOD TO GET NAME TO ENTER TO USERNAME
		
		driver.findElement(By.name("inputPassword")).sendKeys(code);//Password
		driver.findElement(By.className("signInBtn")).click();
		
		
	}
	
	public static String Password(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[1]/form/div/button[2]")).click();
		String info=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[1]/form/p[@class='infoMsg']")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		//info.split("'")[1]='rahulshettyacademy' to Login.
		//.split("'")[0];=rahulshettyacademy
		
		String code=info.split("'")[1].split("'")[0];
		
		return code;
	}
	
	public static void website(WebDriver driver)
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}
	public static void login(WebDriver driver,String name)
	{
				driver.findElement(By.id("inputUsername")).sendKeys(name);//username
		

	}

}
