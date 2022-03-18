package com.juaracoding.ujianselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputNegativeTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chromedriver", "D:chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);

		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();

		WebElement btnAdd = driver.findElement(By.id("addNewRecordButton"));
		btnAdd.click();

		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Doni");

		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Salmanan");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("donisalmanan123@gmail.com");

		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("dua puluh tiga tahun");

		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("200 Juta");

		WebElement department = driver.findElement(By.id("department"));
		department.sendKeys("Affiliator");

		WebElement btnSubmit = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();

	}
}
