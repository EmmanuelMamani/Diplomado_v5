import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.new_pry;

public class test_new_pry extends BaseTest {
    // Test realizado por Emmanuel Mamani
    @Test
    public void checkSuccessTest() {
        new_pry.as(webDriver);
        WebElement elemento = null;
        try {
            elemento = webDriver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div/table/tbody/tr/td[2]/div[1]/div[1]/div[2]"));
        } catch (org.openqa.selenium.NoSuchElementException e) {

            e.printStackTrace();
        }
        Assert.assertNotNull(elemento, "El elemento no está presente en la página");
    }
}
