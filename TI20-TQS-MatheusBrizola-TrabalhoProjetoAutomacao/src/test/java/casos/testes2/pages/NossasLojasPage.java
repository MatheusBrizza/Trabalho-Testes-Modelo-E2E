package casos.testes2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NossasLojasPage {

    static WebDriver driver;

    public NossasLojasPage(WebDriver driver) {this.driver = driver; }

    public  void esperarIniciar() {
        waite().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")));
    }

    public void preencherCEP() {
        WebElement cep = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        cep.sendKeys("91530-034");
        cep.sendKeys(Keys.ENTER);
    }

    public void esperar() {
        waite().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")));
    }

    public String validarMensagemLojasPerto() {
        return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[1]/span[1]")).getText();
    }

    public void pesquisarMartelloHotel() {
        WebElement martello = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        martello.sendKeys("martello hotel");
        martello.sendKeys(Keys.ENTER);
    }

    public void pesquisarSapopema() {
        WebElement sapopema = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        sapopema.sendKeys("Sapopema");
        sapopema.sendKeys(Keys.ENTER);
    }

    public void esperarNenhumaLojaEncontrada() {
       waite().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/span[1]")));
    }

    public String validarNenhumaLojaEncontrada() {
        return driver.findElement(By.xpath("//body/div[@id='root']/div[4]/div[2]/div[1]/div[2]/span[1]")).getText();
    }

    private WebDriverWait waite() {
        return new WebDriverWait(driver, Duration.ofSeconds(15));
    }
}
