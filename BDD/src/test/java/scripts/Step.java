package scripts;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	WebDriver driver;
	@Given(":Open CHROME browser and URL of application")
	public void open_CHROME_browser_and_URL_of_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Asus\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		System.out.println(":Open CHROME browser and URL of application");
	}

	@When("Enter USERNAME, password and click on submit")
	public void enter_USERNAME_password_and_click_on_submit() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("ap_email")).sendKeys("9384155571");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Nagu@123");
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("Entered USERNAME, password and click on submit");
	}

	@Then("Success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Success in login");
	}

	@Given("Open CHROME browser and URL of application1")
	public void open_CHROME_browser_and_URL_of_application1() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Asus\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Open CHROME browser and URL of application1");
	}

	@When("Enter the search value")
	public void enter_the_search_value() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone x");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Apple iPhone XR (64GB) - White
		driver.findElement(By.linkText("Apple iPhone XR (64GB) - White")).click();
		System.out.println("Enter the search value");
	}

	@Then("Success in search")
	public void success_in_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Success in search");
	}

	@Given("Open CHROME browser and URL of application2")
	public void open_CHROME_browser_and_URL_of_application2() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Asus\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/New-Apple-iPhone-XR-64GB/dp/B08L8D44ZM/ref=sr_1_1_sspa?crid=3IKNO65K8FUQG&keywords=Iphone+x&qid=1642742478&sprefix=iphone+%2Caps%2C2398&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyUU4xR0lWMlhCOVlEJmVuY3J5cHRlZElkPUEwNzIxMzI4MTQzWjRGUUNHM1BHJmVuY3J5cHRlZEFkSWQ9QTA0Nzg4NjkzTzdBWVg4NENLU0pEJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		driver.manage().window().maximize();
		System.out.println("Open CHROME browser and URL of application2");
	}

	@When("add product to cart")
	public void add_product_to_cart() throws IOException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor jse1=(JavascriptExecutor) driver;
		jse1.executeScript("scroll(0,250)");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Robot r1=new Robot();
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect=new Rectangle(dim);
		BufferedImage source=r1.createScreenCapture(rect);
		File destination=new File("C:\\Users\\Asus\\Desktop\\report\\screen.jpg");
		ImageIO.write(source, "png", destination);
		System.out.println("When done");
	}

	@Then("Success in adding to cart")
	public void success_in_adding_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Success in adding to cart");
	}

}
