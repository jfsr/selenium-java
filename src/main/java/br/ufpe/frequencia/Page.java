package br.ufpe.frequencia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class Page {
	
	protected WebDriver driver;
	
	
	public String getFontName(By selector) {
		return driver.findElement(selector).getCssValue("font-family");
	}
	
	public String getFontSize(By selector) {
		return driver.findElement(selector).getCssValue("font-size");
	}
	
	public String getBackgroundColorRGBA(By selector) {
		return driver.findElement(selector).getCssValue("background-color");
	}
	
	public String getBackgroundColorHex(By selector) {
		return Color.fromString(getBackgroundColorRGBA(selector)).asHex();
	}
	
}
