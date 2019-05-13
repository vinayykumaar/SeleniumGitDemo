package POM;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForListenerDemo {
	
	
  @Test
  public void PassTest() {
	  
	  Assert.assertEquals("Akshay Kumar", "Akshay Kumar");
	  System.out.println("The Test is passed");
	  
  }
  
  @Test
  public void FailTest() {
	  
	  Assert.assertEquals("Akshay Kumar", "Paresh Rawal");
	  System.out.println("The Test is passed");
	  
  }
  
  @Test(dependsOnMethods = {"FailTest"})
  public void SkipTest() {
	  
	  Assert.assertEquals("Prince", "Frog");
	  System.out.println("The Test is skipped");
	  
  }
  
  
  @Test(dependsOnMethods= {"PassTest"})
  public void Pass2Test() {
	  
	  Assert.assertEquals("Prince", "Prince");
	  System.out.println("Dependent is passed");
	  
  }
  
  @Test(dependsOnMethods= {"PassTest"})
  public void SkipTest2() {
	  
	  Assert.assertEquals("Prince", "Frog");
	  System.out.println("Dependent is skipped");
	  
  }
  
}
