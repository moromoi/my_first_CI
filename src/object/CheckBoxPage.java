package object;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CheckBoxPage extends BasePage {
	
	public  Map<String, String> mapBox = new HashMap<String, String>(); 

	@FindBy(css = "#input_22_0")
	static
	WebElement inputArtist;

	@FindBy(css = "#input_22_1")
	static
	WebElement inputArtistManagement;

	@FindBy(css = "#input_22_2")
	static
	WebElement inputLyricist;

	@FindBy(css = "#input_23_0")
	WebElement Auto;

	@FindBy(css = "input[type=\"checkbox\"]")
	List<WebElement> allBox;

	@FindBy(css = "input[type=\"checkbox\"]:checked")
	List<WebElement> allBoxChecked;

	public void artistBoxClick() {
		for (int i = 0; i < 51; i++) {
			inputArtist.click();
		}
	}
	
	
	public void artistManagementBoxClick() {
		for (int i = 0; i < 51; i++) {
			inputArtistManagement.click();
		}
	}
	
	


	public int randomCheck() {

		Random r = new Random();
		for (int i = 0; i < 11; i++) {
			int nextEl = r.nextInt(allBox.size());
			allBox.get(nextEl).click();
			if(allBoxChecked.size() > 1) {
				System.out.println(createBoxCollection());
			}
			allBox.get(nextEl).click();
		}
		return allBox.size();
	}
	
	public String createBoxCollection()  {


		mapBox.put("Artist", inputArtist.getAttribute("checked"));
		mapBox.put("Artist Management", inputArtistManagement.getAttribute("checked"));
		mapBox.put("Lyricist", inputLyricist.getAttribute("checked"));

		Set<Map.Entry<String, String>> setMap = mapBox.entrySet();
		String map =  setMap.toString();

		for(Map.Entry<String, String> entry: mapBox.entrySet() ) {


		}

		return map;


	}
	
	public void preCondition() {
		
		if(!allBoxChecked.isEmpty()) {
			for (int i = 0; i < allBoxChecked.size(); i++) {
				allBoxChecked.get(i).click();
			}
		}
		

	}


	public CheckBoxPage(WebDriver driver) {
		super(driver);
	}

}
