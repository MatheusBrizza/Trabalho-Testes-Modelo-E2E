package casos.testes2.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbriNavegadores {

    static WebDriver driver;


    @BeforeClass
    public static void setUpBefforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mathe/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://nossaslojas.americanas.com.br/?chave=o2o_hm_00_0_0_nossaslojas/");
        driver.manage().window().maximize();
    }

    @Test
    public void test() {

    }


}
