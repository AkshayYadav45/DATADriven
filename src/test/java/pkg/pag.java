package pkg;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pag extends BaseClass {

	@Test(dataProvider="sample")
	public void registerPage(String data1,String data2) throws InterruptedException {
		System.out.println("hi");
		driver.findElement(By.xpath("//div//input[@name='fullName']")).sendKeys(data1);
		driver.findElement(By.xpath("//div//input[@name='mobile']")).sendKeys(data2);
		System.out.println("hi");
		List<WebElement> all= driver.findElements(By.xpath("//nb-radio[@class='status-basic']//label"));
		driver.findElement(By.xpath("//nb-select[@name='district']")).click();
		driver.findElement(By.xpath("//nb-option[@ng-reflect-value='Sangli']")).click();
		driver.findElement(By.xpath("//nb-select[@name='taluka']")).click();
		driver.findElement(By.xpath("//nb-option[@ng-reflect-value='Kadegaon']")).click();
		driver.findElement(By.xpath("//nb-select[@name='ac']")).click();
		driver.findElement(By.xpath("//nb-option[@ng-reflect-value='Palus-Kadegaon']")).click();
		driver.findElement(By.xpath("//nb-checkbox[@name='fbActive']/label")).click();	
		driver.findElement(By.xpath("//textarea[@name='suggestions']")).sendKeys("कोरोना साठी  जन जागृति अधिक जाली पाहिजे..");		
		driver.findElement(By.xpath("//nb-select[@name='strongAc']")).click();
		driver.findElement(By.xpath("//nb-option[@ng-reflect-value='Islampur']")).click();
		driver.findElement(By.xpath("//nb-select[@name='weakAc']")).click();
		driver.findElement(By.xpath("//nb-option[@ng-reflect-value='Palus-Kadegaon']")).click();
		driver.findElement(By.xpath("//nb-select[@name='winningAc']")).click();
		driver.findElement(By.xpath("//nb-option[@ng-reflect-value='Khanapur']")).click();
		driver.findElement(By.xpath("//textarea[@name='acIssues']")).sendKeys("शासकीय नोकर भरती झाली पाहिजे..");
		driver.findElement(By.xpath("//textarea[@name='irrigIssues']")).sendKeys(" कड़ेगाव तालुक्यामध्ये काही ठिकाणी अजून पाणी नाही. ..");
		driver.findElement(By.xpath("//textarea[@name='partyIssues']")).sendKeys("जयंत पाटील  साहेब हे एक सशम नेतृत्व आहेत. त्यानी अजून चांगल्या रीतिने  पुढाकार घ्यावा..");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		for(int i=0;i<=0;i++) {
			all.get(0).click();
			all.get(4).click();			
			all.get(6).click();			
			all.get(32).click();			
			all.get(44).click();		
			all.get(46).click();		
			all.get(50).click();			
			all.get(51).click();			
			all.get(56).click();		
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
	}
	@DataProvider(name="sample")
	public Object[][] dataPass() throws IOException {
		Object[][] obj = ExcelRead.readsheet("Sheet1");
		return obj;
	}
}
