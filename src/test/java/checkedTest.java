import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.check1;
import  ui.check;
public class checkedTest extends BaseTest {
    //test realizado por Emmanuel Mamani
    @Test
    public void checkSuccessTest() {
        check1.as(webDriver);
// Obtener el elemento del checkbox
        WebElement checkbox = webDriver.findElement(check.checkBoxes);

        // Verificar si el checkbox está marcado
        boolean isChecked = checkbox.isSelected();

        // Assert para verificar si el checkbox está marcado
        Assert.assertTrue(isChecked, "El checkbox no está marcado");
    }
}
