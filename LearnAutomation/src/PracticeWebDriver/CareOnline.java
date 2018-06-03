package PracticeWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareOnline {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");

		WebDriver Upgrade= new ChromeDriver();

		//--- Upgrade process ---//

		Upgrade.manage().window().maximize();
		Upgrade.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
		Upgrade.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_lnkUpgrade']")).click();
		Upgrade.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
		Upgrade.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select Upgrade_package = new Select(Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_ddlProducts'][@class='dropdown']")));
		Upgrade_package.selectByIndex(1);
		Thread.sleep(5000);
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnUpgrade'][@name='ctl00$content$btnUpgrade']")).click();
		Thread.sleep(2000);

		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnOk']")).click();
		Thread.sleep(5000);
		String Accept_message_Upgarde= Upgrade.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_Upgarde);
		Upgrade.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		Upgrade.close();

		//--- Downgrade process ---//

		WebDriver Downgrade= new ChromeDriver();
		Downgrade.manage().window().maximize();
		Downgrade.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
		Downgrade.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
		Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_lnkDowngrade']")).click();
		Downgrade.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
		Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
		Downgrade.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select Downgrade_package = new Select(Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_ddlProducts'][@name='ctl00$content$ddlProducts']")));
		Downgrade_package.selectByIndex(1);
		Thread.sleep(5000);

		Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnDowngrade']")).click();
		Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnOk'][@value='Downgrade']")).click();
		Thread.sleep(7000);
		String Accept_message_Downgrade= Downgrade.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_Downgrade);
		Downgrade.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		Downgrade.close();

	    // -- Add AddOn -- //

		WebDriver driver_add_addon= new ChromeDriver();
		driver_add_addon.manage().window().maximize();
		driver_add_addon.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
		Thread.sleep(5000);
		driver_add_addon.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
		driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_lnkAddremoveAddon']")).click();
		driver_add_addon.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
		driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
		driver_add_addon.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select listbox2 = new Select(driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_ddlCustomerPackage']")));
		listbox2.selectByIndex(1);
		Thread.sleep(5000);
		driver_add_addon.findElement(By.xpath("//input[@id='ctl00_content_CheckBoxListRoom1Paid_1'][@name='ctl00$content$CheckBoxListRoom1Paid$1']")).click();
		driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_btnAddAddOn']")).click();
		driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_btnOk'][@class='button']")).click();
		String Accept_message_AddonActivation= driver_add_addon.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_AddonActivation);
		driver_add_addon.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		driver_add_addon.close();

		// -- Add A-La-Carte -- //

		WebDriver Addalacarte= new ChromeDriver();
		Addalacarte.manage().window().maximize();
		Addalacarte.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
		Addalacarte.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
		Addalacarte.findElement(By.xpath(".//*[@id='ctl00_content_lnkAddAlacarte']")).click();
		Addalacarte.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
		Addalacarte.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
		Addalacarte.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select Custpack = new Select(Addalacarte.findElement(By.xpath(".//*[@id='ctl00_content_ddlCustomerPackage']")));
		Custpack.selectByIndex(1);
		Thread.sleep(5000);
		Addalacarte.findElement(By.xpath("//label[@for='ctl00_content_CheckBoxListRoom1Paid_1']")).click();
		Addalacarte.findElement(By.xpath(".//*[@id='ctl00_content_btnAddChanels']")).click();
		Addalacarte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		String Accept_message_Add_Alacarte= Addalacarte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_Add_Alacarte);
		Addalacarte.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		Addalacarte.close();
		Thread.sleep(2000);

		// -- Remove A-La-Carte -- //

		WebDriver driver_Remove_Ala_carte= new ChromeDriver();
		driver_Remove_Ala_carte.manage().window().maximize();
		driver_Remove_Ala_carte.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
		Thread.sleep(5000);
		driver_Remove_Ala_carte.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
		driver_Remove_Ala_carte.findElement(By.xpath(".//*[@id='ctl00_content_lnkAddAlacarte']")).click();
		driver_Remove_Ala_carte.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
		driver_Remove_Ala_carte.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
		driver_Remove_Ala_carte.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select listbox = new Select(driver_Remove_Ala_carte.findElement(By.xpath(".//*[@id='ctl00_content_ddlCustomerPackage']")));
		listbox.selectByIndex(1);
		Thread.sleep(5000);
		driver_Remove_Ala_carte.findElement(By.xpath("//label[@for='ctl00_content_BulletedListRoom1_1']")).click();
		driver_Remove_Ala_carte.findElement(By.xpath("//input[@id='ctl00_content_btnConfirmRemoveChannels']")).click(); 
		driver_Remove_Ala_carte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_btnRemoveChannels'][@name='ctl00$content$btnRemoveChannels']")).click();
		Thread.sleep(3000);
		String Accept_message_remove_Alacarte= driver_Remove_Ala_carte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_remove_Alacarte);
		driver_Remove_Ala_carte.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		driver_Remove_Ala_carte.close();
		Thread.sleep(3000);

        // -- USB Recording -- //
		
		WebDriver USB_Recording= new ChromeDriver();
		USB_Recording.manage().window().maximize();
		USB_Recording.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
	    Thread.sleep(5000);
	    USB_Recording.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
	    USB_Recording.findElement(By.xpath(".//*[@id='ctl00_content_lnkUsbRecording']")).click();
	    USB_Recording.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
	    USB_Recording.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
	    USB_Recording.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		WebElement Radiobtn_recording = USB_Recording.findElement(By.xpath(".//*[@id='ctl00_content_rdProductList_0']"));
		if (!Radiobtn_recording.isSelected()){
			Radiobtn_recording.click();
		}
		Thread.sleep(2000);
		USB_Recording.findElement(By.xpath(".//*[@id='ctl00_content_btnReActivateConfirm']")).click();
		USB_Recording.switchTo().alert().accept();
        Thread.sleep(2000);
        String Accept_message_USB_Recording= USB_Recording.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_USB_Recording);
		USB_Recording.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		USB_Recording.findElement(By.xpath(".//*[@id='ctl00_lnkLogOut']")).click();
      
	}
}
