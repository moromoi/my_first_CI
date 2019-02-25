package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.CheckBoxPage;



public class CheckBoxTest2 extends BaseTest {
	@Test
	public void randomCheck() {
		
	    CheckBoxPage checkBoxPage2 = new CheckBoxPage(driver);
//		checkBoxPage.preCondition();
		checkBoxPage2.randomCheck();
		
		int expected =  7;
		int actual = checkBoxPage2.randomCheck();
		Assert.assertEquals(actual, expected);
	}
}
