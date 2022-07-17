import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first step is to invoke chrome browser or any other browser by creating object-
		
		//ChromeDriver driver=new ChromeDriver();  It will use all the webdriver methods+ personal classes but might not run in other browsers so to restrict the methods for all browsers
		
		
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		

	}

}
