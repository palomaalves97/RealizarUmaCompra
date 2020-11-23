package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage extends BasePage{

    public LoginFormPage(WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPage typeUsername (String Username){
        navegador.findElement(By.id("user-name")).sendKeys(Username);
        return this;
    }

    public LoginFormPage typePassword (String Password){
        navegador.findElement(By.id("password")).sendKeys(Password);
        return this;
    }

    public ProductsPage clicarLogin() {
        navegador.findElement(By.id("login-button")).click();

        return new ProductsPage (navegador);
            }

    }
