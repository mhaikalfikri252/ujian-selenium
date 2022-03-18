package com.juaracoding.ujianselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputPositiveTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();

		WebElement btnAdd = driver.findElement(By.id("addNewRecordButton"));
		btnAdd.click();

		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("M Haikal");

		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Fikri");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("mhaikalfikri252@gmail.com");

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("22");

		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("10000000");

		WebElement department = driver.findElement(By.id("department"));
		department.sendKeys("Quality Assurance");

		WebElement btnSubmit = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();

	}

}
