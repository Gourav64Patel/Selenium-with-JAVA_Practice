import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//implicit wait it wait for any line of code for atmost 3 seconds.
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String input=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/h1")).getText();
		
		System.out.println(input);
		
		if(input.equals("Sign in"))
		{
			driver.findElement(By.id("inputUsername")).sendKeys("gourav");//username
			driver.findElement(By.name("inputPassword")).sendKeys("hello123");//Password
			driver.findElement(By.className("signInBtn")).click();//login button
			
			//submit signInBtn if class name contains space that means this class has two names both will work
			String error=(driver.findElement(By.cssSelector("p.error")).getText());
			if(error.equals("* Incorrect username or password")){
				
			
			driver.findElement(By.linkText("Forgot your password?")).click();
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("gourav");
			driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("gourav.patel64@gmail.com");
			driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("7987443265");
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[1]/form/div/button[2]")).click();
			String info=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[1]/form/p[@class='infoMsg']")).getText();
			System.out.println(info);
			if(info.equals("Please use temporary password 'rahulshettyacademy' to Login."))
			{
			      String Passcode=info.substring(31,49);
				  System.out.println(Passcode);
				  
				  driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
				  
				  
				  driver.findElement(By.id("inputUsername")).sendKeys("gourav");//username
				  driver.findElement(By.name("inputPassword")).sendKeys(Passcode);//Password
				  
				  
				  Thread.sleep(1000);
				  driver.findElement(By.id("chkboxOne")).click();
				  
				  
				  driver.findElement(By.className("signInBtn")).click();//login button
				  
				 String login= driver.findElement(By.xpath("//div/p[@style='color: rgb(27, 179, 102); font-size: 18px; text-align: center;']")).getText();
				  
				  if(login.equals("You are successfully logged in."))
				  {
					  driver.findElement(By.className("logout-btn")).click();
				  }
			}
		}
			

	}

}}
