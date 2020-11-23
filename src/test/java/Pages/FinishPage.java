package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage extends BasePage{
    public FinishPage(WebDriver navegador) {
        super(navegador);
    }
    public ValidationPage clicarFinish(){
        WebElement linkFinish = navegador.findElement(By.linkText("FINISH"));
        linkFinish.click();
        return new ValidationPage(navegador);
    }
}
