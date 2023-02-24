package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class funcionesBasicas {
	
	protected WebDriver driver;
	
	public funcionesBasicas(WebDriver driver) {
		this.driver= driver;
	}
	
	public void click(By element) {
		driver.findElement(element).click();;
	}
	
	public void sendKeys(By element, String mensaje) {
		driver.findElement(element).sendKeys(mensaje);
	}
	
	public void sendKeys1(By element, String mensaje) {
		WebElement webelement = driver.findElement(element);
		webelement.sendKeys(mensaje);
		
		
	}
	

}
