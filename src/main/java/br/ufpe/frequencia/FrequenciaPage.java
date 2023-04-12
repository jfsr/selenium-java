package br.ufpe.frequencia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class FrequenciaPage 
{
//	 protected WebDriver driver;
//
//	  // <input name="user_name" type="text" value="">
//	  private By usernameBy = By.name("user_name");
//	  // <input name="password" type="password" value="">
//	  private By passwordBy = By.name("password");
//	  // <input name="sign_in" type="submit" value="SignIn">
//	  private By signinBy = By.name("sign_in");
//
//	  public FrequenciaPage(WebDriver driver){
//	    this.driver = driver;
//	     if (!driver.getTitle().equals("STI : Autenticação Integrada")) {
//	      throw new IllegalStateException("This is not FrequenciaPage, current page is: " + driver.getCurrentUrl());
//	    }
//	  }
//	  
//	  /**
//	    * Login as valid user
//	    *
//	    * @param userName
//	    * @param password
//	    * @return HomePage object
//	    */
//	  public HomePage validUser(String userName, String password) {
//	    driver.findElement(usernameBy).sendKeys(userName);
//	    driver.findElement(passwordBy).sendKeys(password);
//	    driver.findElement(signinBy).click();
//	    return new HomePage(driver);
//	  }
	
	
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        
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
