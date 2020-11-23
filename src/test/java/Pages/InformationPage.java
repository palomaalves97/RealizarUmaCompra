package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformationPage extends BasePage {
    public InformationPage(WebDriver navegador) {
        super(navegador);
    }

    public InformationPage typeFirstName (String Fisrtname){
        navegador.findElement(By.id("first-name")).sendKeys(Fisrtname);
        return this;
    }

    public InformationPage typeLastName (String LastName){
        navegador.findElement(By.id("last-name")).sendKeys(LastName);
        return this;
    }

    public InformationPage typePostalCode (String PostalCode){
        navegador.findElement(By.id("postal-code")).sendKeys(PostalCode);
        return this;
    }

    public FinishPage clicarContinue(){
        navegador.findElement(By.xpath("//div[@class=\"checkout_buttons\"]//input")).click();
        return new FinishPage(navegador);
    }
}
