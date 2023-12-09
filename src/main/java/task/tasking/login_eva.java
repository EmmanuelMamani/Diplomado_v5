package task.tasking;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.check;
import ui.evaluacion;
import ui.HomePageUI;
public class login_eva {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, evaluacion.log);
        Enter.text(webDriver,evaluacion.user_log,"emmanuelmamani101@gmail.com");
        Enter.text(webDriver,evaluacion.pass_log,"Emma79793177");
        Click.on(webDriver, evaluacion.button_log);
    }
}
