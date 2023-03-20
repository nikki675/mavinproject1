package baby;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class janeman {
 

@BeforeTest      // it is used to open browser and we use main method in this
public void bt() {
	System.out.println("beforetest");
	
	
}
@Test (enabled =true,priority = 1)
public void login() {
	System.out.println("login successfull");
}
@Test(enabled = true,priority = 1)
public void homepage() {
	System.out.println("homepage successfull");
}
@Test(priority = 0,dependsOnMethods = "login",alwaysRun = true)
public void search() {
	System.out.println("search successfull");
	
}
}
