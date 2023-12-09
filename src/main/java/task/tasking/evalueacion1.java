package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.check;
import ui.evaluacion;
import ui.HomePageUI;
public class evalueacion1 {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, evaluacion.boton);
        Enter.text(webDriver,evaluacion.user,"Emmanuel");
        Enter.text(webDriver,evaluacion.email,"emmanuelmamani102@gmail.com");
        Enter.text(webDriver,evaluacion.pass,"Emma79793177");
        Click.on(webDriver, evaluacion.check);
        Click.on(webDriver, evaluacion.login);
    }
}
