package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {
	
  /*
   * "@Test" by default it will act like a main method and will execute the programe
   * And by default '@Test' will execute the test cases in 'Alphabetical order'
   */
@BeforeClass
public void open() {
	System.out.println("Open browser");
}
@BeforeMethod
public void login() {
	System.out.println("Login to link");
}
@Test
public void CreateCustomer() {
	
	System.out.println("Create customer account ");
	
	}
@Test
public void EditCustomer() {
	
	System.out.println("Edit customer Details");
}

@Test
public void ModifyDetails() {
	System.out.println("Modifiy user details");
}

@Test
public void DeleteCustomer() {
	System.out.println("Delete user deatails");
}

@AfterMethod
public void logout() {
	System.out.println("Logout from URL");
}
@AfterClass
public void close() {
	System.out.println("Close Browser");
}
}