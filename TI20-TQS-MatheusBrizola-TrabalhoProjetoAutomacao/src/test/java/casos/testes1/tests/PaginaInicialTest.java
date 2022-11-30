package casos.testes1.tests;

import casos.testes1.pages.PaginaInicialPage;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaInicialTest {

    static WebDriver driver;

    static PaginaInicialPage paginaInicialPage;

    @BeforeClass
    public static void setUpBefforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mathe/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.americanas.com.br/");
        driver.manage().window().maximize();

        paginaInicialPage = new PaginaInicialPage(driver);
    }

    @Test
    public void deveRetornarMensagemNenhumProdutoEncontrado() {
        paginaInicialPage.preencherProduto();
        paginaInicialPage.esperarNenhumProdutoEncontrada();
        Assert.assertEquals(paginaInicialPage.validarMensagemNenhumProduto() , "poxa, nenhum resultado encontrado para \"asdladsjlnsdlknasd\".");
    }

}
