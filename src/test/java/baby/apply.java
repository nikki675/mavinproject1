package baby;

import java.awt.Desktop.Action;
import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class apply {
public static String man="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
WebDriver driver;
	@BeforeTest
	public void bt() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get(man);
		 driver.manage().window().maximize();
		 
	}
		 @Test(priority = 1)
		 public void login() throws InterruptedException  {
			 System.out.println("orangehrm is opened");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 WebElement user= driver.findElement(By.name("username"));
				if(user.isEnabled()){
					user.sendKeys("Admin");
				}
				Thread.sleep(3000);
				WebElement run=driver.findElement(By.name("password"));
				if(run.isEnabled()) {
					run.sendKeys("admin123");
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath(" //*[@type= 'submit']" )).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Admin")).click();
				Thread.sleep(3000);
				 
		 }
		
		 
				@Test(priority = 2)
				public void we() throws InterruptedException {
					Thread.sleep(5000);
					List<WebElement> jj=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
					System.out.println(jj.size());
					Actions act3= new Actions(driver);
				WebElement kk=driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(1);
				act3.click(kk).build().perform();
				//	List <WebElement> ele=driver.findElements(By.tagName("a"));
				//	driver.findElement(By.xpath("//*[@class='oxd-table-body']"));
					
//		            System.out.println(ele.size());
//		            for(int i=0;i<ele.size();i++) {
//			        System.out.println(ele.get(i).getText());
//			        Thread.sleep(5000);
//			        System.out.println(ele.get(i).getAttribute("href"));
//			        System.out.println(ele.get(i));
			        driver.close();
		}
				
			//	Actions act= new Actions(driver);
				//WebElement Admindropdown=driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']//div[1]//div"));
			//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//	act.click();
				//act.contextClick(Admindropdown).build().perform();
				//act.click(Admindropdown).build().perform();
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//act.sendKeys(Admindropdown,Keys.ARROW_DOWN);
				  
		 }
				
				
				
			 
//			 Thread.sleep(5000);
//			 driver.findElement(By.name("username")).sendKeys("Admin");
//			 Thread.sleep(3000);
//			 driver.findElement(By.name("password")).sendKeys("admin123");
//			 Thread.sleep(3000);
//			 String beforelogin=driver.getTitle();
//			 Thread.sleep(3000);
//			 driver.findElement(By.xpath(" //*[@type= 'submit']" )).click();
//			 Thread.sleep(3000);
//			 String afterlogin=driver.getTitle();
//			 Thread.sleep(3000);
//			 Assert.assertEquals(beforelogin, afterlogin);
//			 System.out.println("same");
//			 
//			 WebElement user6= driver.findElement(By.xpath("//*[@class='oxd-main-menu-item']"));
//			 user6.click();
//			 Thread.sleep(10000);
		//	 WebElement user1=driver.findElement(By.xpath("//*[@class='oxd-label']"));
		//	 Thread.sleep(5000);
	//		 driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']//div[1]//div//i")).click();
//			WebElement user3=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
//			 user3.sendKeys("nikhil");
//			 Thread.sleep(6000);
//			 WebElement user4=driver.findElement(By.xpath("//*[@placeholder='Type for hints...']"));
//			 user4.sendKeys("nikk");
//			 Thread.sleep(3000);
//			 WebElement user5=driver.findElement(By.xpath("//*[@type='submit']"));
//			 user5.click();
	//		 driver.close();
//			 driver.findElement(By.xpath("//*[@class='oxd-main-menu-item']")).click();
//			 Thread.sleep(3000);
//			 driver.findElement(By.xpath("//*[@class='oxd-main-menu']//li[2]//a")).click();
//			 Thread.sleep(3000);
//			 driver.findElement(By.xpath("//*[@class='oxd-main-menu']//li[3]//a")).click();
//			 Thread.sleep(3000);
//		 }
//		 @Test
//		 public void logout() throws InterruptedException
//		 {
//			 Thread.sleep(5000);
//			 driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
//			 Thread.sleep(3000);
//			 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']//li[4]//a")).click();
//			 
//		 }
//		 { 
			 
		 
		
	


