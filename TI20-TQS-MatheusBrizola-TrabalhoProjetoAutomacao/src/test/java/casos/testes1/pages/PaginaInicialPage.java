package casos.testes1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaginaInicialPage {

    static WebDriver driver;

    public PaginaInicialPage(WebDriver driver) {this.driver = driver;}


    public void preencherProduto() {
        WebElement produto = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/form[1]/input[1]"));
        produto.sendKeys("asdladsjlnsdlknasd");
        produto.sendKeys(Keys.ENTER);
    }

    public void esperarNenhumProdutoEncontrada() {
        WebDriverWait esperar = new WebDriverWait(driver, Duration.ofSeconds(10));
        esperar.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='root']/div[@id='rsyswpsdk']/div[1]/main[1]/div[1]/div[1]/section[1]/span[1]")));
    }

    public String validarMensagemNenhumProduto() {
        return driver.findElement(By.xpath("//body/div[@id='root']/div[@id='rsyswpsdk']/div[1]/main[1]/div[1]/div[1]/section[1]/span[1]")).getText();
    }

}
