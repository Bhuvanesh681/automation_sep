package automation_sep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.XLS_Reader;

public class TestWebTable {
	WebDriver driver=null;
	XLS_Reader xls=null;
	@BeforeMethod
	public void setup()
	{
	//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	//driver=new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException{
		String path="C://Automation_Sep//abc.xlsx";
		xls=new XLS_Reader(path);
		List<String> clist=new ArrayList<String>();
	/*//	driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		//driver.manage().window().maximize();
		//WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
	List<WebElement> list= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		for(int i=0;i<list.size();i++){
			clist.add(list.get(i).getText());
		}*/
		
		System.out.println(clist);
		
	}
	@AfterMethod
	public void close(){
		//driver.close();
	}

}
