package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.CheckBoxPage;





@Test
public class CheckBoxTest extends BaseTest {
	
	public void artistClick() {
		
	
		CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
		
		checkBoxPage.preCondition();
		checkBoxPage.artistBoxClick();
		
		String expected = "[Artist=true, Lyricist=null, Artist Management=null]";
		String actual = checkBoxPage.createBoxCollection();
		Assert.assertEquals(actual, expected);

		
		

	}

	public void artistManagementClick() {
		
		CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
		checkBoxPage.preCondition();
		checkBoxPage.artistManagementBoxClick();
		
		String expected =  "[Artist=null, Lyricist=null, Artist Management=true]";
		String actual = checkBoxPage.createBoxCollection(); 
		Assert.assertEquals(actual, expected);
	}
	

//	
//	@Test(priority=4)
//	public void artistManagementRelease() {
//		
//		CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
//		
//		String expected = checkBoxPage.artistManagementBoxRelease();
//		String actual = checkBoxPage.createBoxCollection();
//		Assert.assertEquals(actual, expected);
//	}
//	
//	@Test(priority=2, dataProvider="getDataFromExcel")
	
//	@DataProvider
//	public Object[][] getDataFromExcel(){
//		Excel excel = new Excel();
//		return excel.getTableArray(System.getProperty("user.dir") + "\\src\\il\\co\\alljob\\data\\input.xlsx", "InvalidMail");
//	}
}
