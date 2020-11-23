package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import suporte.Web;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class RealizarComprasTest {
   private WebDriver navegador;

   @Before
   public void setUp() {
      navegador = Web.createChrome();

      //Digitar no campo id "user-name" e preencher com "standard_user"
      navegador.findElement(By.id("user-name")).sendKeys("standard_user");

      //Digitar no campo id "password" e preencher com "secrect_sauce"
      navegador.findElement(By.id("password")).sendKeys("secret_sauce");

      //Clicar no botão "LOGIN" que tem o id "login-button"
      navegador.findElement(By.id("login-button")).click();
   }

   @Test
    public void testRealizarUmaCompra() {

       //Clicar em um produto aleatório no campo id
       navegador.findElement(By.id("item_4_title_link")).click();

       //Clicar no botão através do seu xpath "ADD TO CART"
       navegador.findElement(By.xpath("//div[@id=\"inventory_item_container\"]//button[@class=\"btn_primary btn_inventory\"]")).click();

       //Clicar no link do ícone do carrinho
       navegador.findElement(By.id("shopping_cart_container")).click();

       //Clicar no link do botão "CHECKOUT"
       WebElement linkCheckout = navegador.findElement(By.linkText("CHECKOUT"));
       linkCheckout.click();

       //Clicar no campo id "first-name" e preencher com "Paloma"
       navegador.findElement(By.id("first-name")).sendKeys("Paloma");

       //Clicar no campo id "last-name" e preencher com "Alves"
       navegador.findElement(By.id("last-name")).sendKeys("Alves");

       //Clicar no campo id "postal-code" e preencher com "02130-050"
       navegador.findElement(By.id("postal-code")).sendKeys("02130-050");

       //Clicar no botão através do xpath "CONTINUE"
       navegador.findElement(By.xpath("//div[@class=\"checkout_buttons\"]//input")).click();

       //Clilcar no botão "FINISH"
       WebElement linkFinish = navegador.findElement(By.linkText("FINISH"));
       linkFinish.click();

       //Validar a mensagem "THANK YOU FOR YOUR ORDER"
       WebElement completeheader = navegador.findElement(By.className("complete-header"));
       String mensagem = completeheader.getText();
       assertEquals("THANK YOU FOR YOUR ORDER", mensagem);
   }

   @After
   public void tearDown() {
      //Fechar o navegador
      navegador.quit();

   }

}
