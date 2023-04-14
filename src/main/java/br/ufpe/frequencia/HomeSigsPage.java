package br.ufpe.frequencia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSigsPage extends Page
{
	public static By sistemaSig = By.xpath("/html/body/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[2]");
	public static By sistemaSigSelecionado = By.cssSelector("div[class='painel sistemaAtual']");

	public HomeSigsPage(WebDriver driver){
		this.driver = driver;
	}
}
