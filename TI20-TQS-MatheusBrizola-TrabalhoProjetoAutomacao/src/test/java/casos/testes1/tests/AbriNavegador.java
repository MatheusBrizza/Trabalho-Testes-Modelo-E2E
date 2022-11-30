package casos.testes1.tests;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbriNavegador {

    static WebDriver driver;

    @BeforeClass
    public static void setUpBefforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mathe/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.americanas.com.br/");
        driver.manage().window().maximize();
    }

    @Test
    public void test() {

    }

}
