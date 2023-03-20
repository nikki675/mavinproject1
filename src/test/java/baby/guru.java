package baby;

import static org.testng.Assert.assertEquals;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru {
	public static String pan="https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	@BeforeTest
	public void tb() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(pan);
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	public void login() throws InterruptedException {
		System.out.println("guru99 is opened");
		Thread.sleep(5000);
		WebElement user=driver.findElement(By.name("userName"));
		Thread.sleep(3000);
		user.sendKeys("user");
		Thread.sleep(3000);
		WebElement yup=driver.findElement(By.name("password"));
		yup.sendKeys("user");
		String beforelogin=driver.getTitle();
		System.out.println(beforelogin);
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.name("submit"));
		we.click();
		Thread.sleep(10000);
		String afterlogin=driver.getTitle();
		System.out.println(afterlogin);
		if(beforelogin.equals(afterlogin)) {
			System.out.println("titles same");
		}
		else {
			System.out.println("titles are not same");
		}
	}
	@Test(priority = 2)
	public void Register() throws InterruptedException {
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("nikhil");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("solanki");
		Thread.sleep(2000);
		driver.findElement(By.name("phone")).sendKeys("3456237812");
		Thread.sleep(3000);
		driver.findElement(By.name("userName")).sendKeys("nikhilsolanki23@gmail");
		Thread.sleep(5000);
		driver.findElement(By.name("address1")).sendKeys("plot no.228,malad east");
		Thread.sleep(3000);
		driver.findElement(By.name("city")).sendKeys("jodhpur");
		Thread.sleep(3000);
		driver.findElement(By.name("state")).sendKeys("Rajasthan");
		Thread.sleep(3000);
		driver.findElement(By.name("postalCode")).sendKeys("342001");
		Thread.sleep(3000);
	 WebElement ddown=driver.findElement(By.name("country"));
	 Select select=new Select(ddown);
	 select.selectByValue("INDIA");
	 Thread.sleep(2000);
	 driver.findElement(By.name("email")).sendKeys("user");
	 Thread.sleep(3000);
	 driver.findElement(By.name("password")).sendKeys("user");
	 Thread.sleep(3000);
	 driver.findElement(By.name("confirmPassword")).sendKeys("user");
	 Thread.sleep(3000);
	 driver.findElement(By.name("submit")).click();
	 driver.close();
	 
	
		
		
		
		
		
		
	}

}
