package casos.testes2.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import casos.testes2.pages.NossasLojasPage;


public class NossasLojasNenhumaLojaTest {

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
    public void deveRetornarNenhumaLojaTest() {
        nossasLojasPage.esperarIniciar();
        nossasLojasPage.pesquisarSapopema();
        nossasLojasPage.esperarNenhumaLojaEncontrada();
        Assert.assertEquals(nossasLojasPage.validarNenhumaLojaEncontrada() , "Não encontramos nenhuma loja próxima\n" +
                "a você. Tente um novo endereço");
    }

}
