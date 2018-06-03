package PracticeWebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CareOnlineAppScreenShot {
    
	@Test
	public void CareOnLine() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\ChromeDriver.exe");
    
		WebDriver Upgrade= new ChromeDriver();
        
		//--- Upgrade process ---//
		
		Upgrade.manage().window().maximize();
		
		Upgrade.get("http://172.19.4.64/MR29/CareOnline/frmLogin.aspx");
		
		Upgrade.findElement(By.xpath("//input[@id='ctl00_content_txtUserName']")).sendKeys("testuser1");
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)Upgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:/CareOnlineScreenShot/Careonlinelogin.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_lnkUpgrade']")).click();
		Upgrade.findElement(By.xpath("//input[@id='ctl00_content_txtpwd']")).sendKeys("user@123");
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_txtCustId']")).sendKeys("1991653");
		File src2= ((TakesScreenshot)Upgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src2, new File("D:/CareOnlineScreenShot/PasswordCustomerID.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Upgrade.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select Upgrade_package = new Select(Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_ddlProducts'][@class='dropdown']")));
		Upgrade_package.selectByIndex(1);
		File src3= ((TakesScreenshot)Upgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src3, new File("D:/CareOnlineScreenShot/UpgradePackagename.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Thread.sleep(5000);
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnUpgrade'][@name='ctl00$content$btnUpgrade']")).click();
		Thread.sleep(2000);
		File src4= ((TakesScreenshot)Upgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src4, new File("D:/CareOnlineScreenShot/UpgradePackageDetail.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Upgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnOk']")).click();
		Thread.sleep(5000);
		String Accept_message_Upgarde= Upgrade.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_Upgarde);
		File src5= ((TakesScreenshot)Upgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src5, new File("D:/CareOnlineScreenShot/UpgradeSuccessfull.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
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
		File src6= ((TakesScreenshot)Downgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src6, new File("D:/CareOnlineScreenShot/DowngradeLogin.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Downgrade.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		Select Downgrade_package = new Select(Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_ddlProducts'][@name='ctl00$content$ddlProducts']")));
		Downgrade_package.selectByIndex(1);
		Thread.sleep(5000);
		File src7= ((TakesScreenshot)Downgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src7, new File("D:/CareOnlineScreenShot/SelectedDowngradePackage.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }

		Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnDowngrade']")).click();
		File src8= ((TakesScreenshot)Downgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src8, new File("D:/CareOnlineScreenShot/DowngradePackageDetail.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Downgrade.findElement(By.xpath(".//*[@id='ctl00_content_btnOk'][@value='Downgrade']")).click();
		Thread.sleep(7000);
		String Accept_message_Downgrade= Downgrade.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_Downgrade);
		File src9= ((TakesScreenshot)Downgrade).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src9, new File("D:/CareOnlineScreenShot/DowngradeSuccessfully.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
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
		File src10= ((TakesScreenshot)driver_add_addon).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src10, new File("D:/CareOnlineScreenShot/Add_Addon.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_btnAddAddOn']")).click();
		File src11= ((TakesScreenshot)driver_add_addon).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src11, new File("D:/CareOnlineScreenShot/Add_Addon_Details.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		driver_add_addon.findElement(By.xpath(".//*[@id='ctl00_content_btnOk'][@class='button']")).click();
		String Accept_message_AddonActivation= driver_add_addon.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_AddonActivation);
		File src12= ((TakesScreenshot)driver_add_addon).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src12, new File("D:/CareOnlineScreenShot/Addon_Activation_successfully.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
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
		File src13= ((TakesScreenshot)Addalacarte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src13, new File("D:/CareOnlineScreenShot/Add_Alacarte.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Addalacarte.findElement(By.xpath(".//*[@id='ctl00_content_btnAddChanels']")).click();
		File src14= ((TakesScreenshot)Addalacarte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src14, new File("D:/CareOnlineScreenShot/Add_Alacarte_details.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		Addalacarte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		String Accept_message_Add_Alacarte= Addalacarte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_Add_Alacarte);
		File src15= ((TakesScreenshot)Addalacarte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src15, new File("D:/CareOnlineScreenShot/Add_alacarte_added_succesfully.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
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
		File src16= ((TakesScreenshot)driver_Remove_Ala_carte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src16, new File("D:/CareOnlineScreenShot/remove_alacarte.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		driver_Remove_Ala_carte.findElement(By.xpath(".//*[@id='ctl00_content_BulletedListRoom1_1']")).click();
		File src17= ((TakesScreenshot)driver_Remove_Ala_carte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src17, new File("D:/CareOnlineScreenShot/Remove_alacarte_detail.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		driver_Remove_Ala_carte.findElement(By.xpath("//input[@id='ctl00_content_btnConfirmRemoveChannels']")).click(); 
		driver_Remove_Ala_carte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_btnRemoveChannels'][@name='ctl00$content$btnRemoveChannels']")).click();
		Thread.sleep(3000);
		File src18= ((TakesScreenshot)driver_Remove_Ala_carte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src18, new File("D:/CareOnlineScreenShot/Remove_alacarte_detail2.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		String Accept_message_remove_Alacarte= driver_Remove_Ala_carte.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_remove_Alacarte);
		File src19= ((TakesScreenshot)driver_Remove_Ala_carte).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src19, new File("D:/CareOnlineScreenShot/Remove_alacarte_successfully.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
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
		File src20= ((TakesScreenshot)USB_Recording).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src20, new File("D:/CareOnlineScreenShot/USBrecording_detail.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
	    USB_Recording.findElement(By.xpath("//input[@id='ctl00_content_btnSubmit']")).click();
		Thread.sleep(2000);
		WebElement Radiobtn_recording = USB_Recording.findElement(By.xpath(".//*[@id='ctl00_content_rdProductList_0']"));
		if (!Radiobtn_recording.isSelected()){
			Radiobtn_recording.click();
		}
		Thread.sleep(2000);
		File src21= ((TakesScreenshot)USB_Recording).getScreenshotAs(OutputType.FILE);
		try{
	    // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src21, new File("D:/CareOnlineScreenShot/USBrecording_detail.png"));
		}
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 }
		USB_Recording.findElement(By.xpath(".//*[@id='ctl00_content_btnReActivateConfirm']")).click();
		USB_Recording.switchTo().alert().accept();
        Thread.sleep(2000);
        String Accept_message_USB_Recording= USB_Recording.switchTo().activeElement().findElement(By.xpath(".//*[@id='ctl00_content_lblError']")).getText();
		System.out.println("Actual message is -- " + Accept_message_USB_Recording);
		USB_Recording.switchTo().activeElement().findElement(By.xpath("//img[@src='Images/close.gif']")).click();
		USB_Recording.findElement(By.xpath(".//*[@id='ctl00_lnkLogOut']")).click();
    
	}

}
