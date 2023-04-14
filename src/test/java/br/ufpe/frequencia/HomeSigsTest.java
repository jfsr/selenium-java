package br.ufpe.frequencia;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class HomeSigsTest 
{
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void validateHomeSigs()
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://sigaa-atendimento.ufpe.br/sigaa/verTelaLogin.do");
		HomeSigsPage homeSigs = new HomeSigsPage(driver);
		
		System.out.println(homeSigs.getFontSize(HomeSigsPage.sistemaSig));
		System.out.println(homeSigs.getFontName(HomeSigsPage.sistemaSig));
		System.out.println(homeSigs.getBackgroundColorHex(HomeSigsPage.sistemaSig));
		
		driver.quit();
	}
}
