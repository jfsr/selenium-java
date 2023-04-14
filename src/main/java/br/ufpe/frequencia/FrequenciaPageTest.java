package br.ufpe.frequencia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrequenciaPageTest 
{

    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        //https://sigaa-atendimento.ufpe.br/sigaa/verTelaLogin.do
        driver.get("https://frequencia.ufpe.br/");
        System.out.println(driver.getTitle());

        WebElement titleElement = driver.findElement(By.xpath("//html/body/header/div/p"));
        String fontValue = titleElement.getCssValue("font");
        System.out.println(fontValue);
        //rgb = title_element.value_of_css_property('color');
        //hex = Color.from_string(rgb).hex
        //print(hex)

        driver.quit();
    }
}

