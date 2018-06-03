package boxLinkClick;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class BoxLinkClickClass {

		public static void main(String[] args) throws Exception {
		
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\ChromeDriver\\chromedriver.exe");
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--disable-extensions");
			WebDriver driver = new ChromeDriver(op);
			driver.manage().window().maximize();
			driver.get("http://www.amazon.in");
			Thread.sleep(5000);
			
			System.out.println(driver.getTitle());
			
			List <WebElement> AllLink = driver.findElements(By.tagName("a"));
			System.out.println(AllLink.size());
			Thread.sleep(10000);

			WebElement box = driver.findElement(By.xpath("//div[@id='nav-xshop-container']"));
			List <WebElement> box_link = box.findElements(By.tagName("a"));
			System.out.println(box_link.size());
			for(int i=0;i<box_link.size();i++){
				System.out.println(box_link.get(i).getText());
				box_link.get(i).click();
				System.out.println("--------------");
				Thread.sleep(5000);
				System.out.println(driver.getTitle());
				driver.get("http://www.amazon.in");
				box = driver.findElement(By.xpath("//div[@id='nav-xshop-container']"));
				box_link = box.findElements(By.tagName("a"));
			}
			
			driver.get("http://www.amazon.in");
			driver.findElement(By.xpath("//html/body/div[2]/header/div/div[1]/div[2]/div/div[2]/map/area")).click();
			driver.quit();
		}

	}

