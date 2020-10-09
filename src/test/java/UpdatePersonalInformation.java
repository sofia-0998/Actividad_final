import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdatePersonalInformation {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void test() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        Login.login("sofifronte@gmail.com","Sistemas0998" );

        String resultado_esperado = Actualizacion.actualizacion("Sofia","fronte","Sistemas0998","Sistemas0998","Sistemas0998");
        assertEquals("Your personal information has been successfully updated.", resultado_esperado);




    }
}
