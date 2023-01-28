package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNg3 {

	@Test
	public void method1() {
		
		Reporter.log("i am Method1",true);
	}
	
	@Test
	public void method2() {
		
		Reporter.log("i am Method2",true);
	}

}

