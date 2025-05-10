package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.partialLinkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Jughal");
	driver.findElement(By.name("lastname")).sendKeys("Shah");
	driver.findElement(By.name("reg_email__")).sendKeys("test1test@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("Test1234!");
	driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
	 WebElement day =driver.findElement(By.name("birthday_day"));
	 Select S = new Select(day);
	 S.selectByIndex(21);
	 WebElement month =driver.findElement(By.name("birthday_month"));
	 Select S1 = new Select (month);
	 S1.selectByIndex(9);
	 WebElement year =driver.findElement(By.name("birthday_year"));
	 Select S2 = new Select (year);
	 S2.selectByValue("2000");
	 
}
}
