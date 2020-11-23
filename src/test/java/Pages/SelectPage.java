package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPage extends BasePage {

    public SelectPage(WebDriver navegador) {
        super(navegador);
    }

    public SelectPage clicarAddToCart() {
        navegador.findElement(By.xpath("//div[@id=\"inventory_item_container\"]//button[@class=\"btn_primary btn_inventory\"]")).click();
        return this;
    }

    public CarPage clicarCarrinho(){
        navegador.findElement(By.id("shopping_cart_container")).click();
        return new CarPage(navegador);
    }
}

