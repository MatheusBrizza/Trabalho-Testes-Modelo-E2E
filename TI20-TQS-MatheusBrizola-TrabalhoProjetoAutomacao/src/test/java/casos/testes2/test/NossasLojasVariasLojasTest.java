package casos.testes2.test;

import casos.testes2.pages.NossasLojasPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NossasLojasVariasLojasTest {

    static WebDriver driver;

    static NossasLojasPage nossasLojasPage;

    @BeforeClass
    public static void setUpBefforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mathe/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas/");
        driver.manage().window().maximize();

        nossasLojasPage = new NossasLojasPage(driver);
    }

    @Test
    public void deveRetornarVariasLojasTest() {
        nossasLojasPage.esperarIniciar();
        nossasLojasPage.preencherCEP();
        nossasLojasPage.esperar();
        Assert.assertEquals(nossasLojasPage.validarMensagemLojasPerto() , "20 Americanas perto de você");
    }
}
