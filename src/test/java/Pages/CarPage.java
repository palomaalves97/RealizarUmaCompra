package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CarPage extends BasePage{
    public CarPage(WebDriver navegador) {
        super(navegador);
    }
    public InformationPage clicarCkeckout(){
        WebElement linkCheckout = navegador.findElement(By.linkText("CHECKOUT"));
        linkCheckout.click();
        return new InformationPage(navegador);
    }
}
