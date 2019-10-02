package TestNG;

import org.testng.annotations.Test;

public class PrioritsingTests {
  @Test(priority=0)
  public void TengthGrade() {
  System.out.println("Should pass Xth Grade");
  }
@Test(priority=2)
public void Intermediate() {
	System.out.println("Should pass Inter");
}

@Test
public void age() {
	System.out.println("age should be above 18");
}
@Test(dependsOnMethods= {"Intermediate","age"})
public void EntranceExam() {
	System.out.println("ok you are qualified");
}

}
