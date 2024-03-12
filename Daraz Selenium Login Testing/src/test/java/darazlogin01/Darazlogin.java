package darazlogin01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Darazlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		// initialization
		driver.get("https://member.daraz.com.bd/user/login?spm=a2o42.login_signup.header.d5.223928298yFfvM");
		driver.manage().window().maximize();

		// Normal Login
		
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("ahnafshaishob@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("Login@0012");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/form/div/div[2]/div[1]/button")).click();

		// Validation of email

//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asd");
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asd@");
//		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("asd@gmail.com");


		// Validation of Password
//		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cart-icon']")).click();

	}

}
