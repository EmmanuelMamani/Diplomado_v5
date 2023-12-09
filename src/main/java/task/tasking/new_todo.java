package task.tasking;


import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.evaluacion;
import ui.loginUI;
public class new_todo {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, evaluacion.log);
        Enter.text(webDriver,evaluacion.user_log,"emmanuelmamani101@gmail.com");
        Enter.text(webDriver,evaluacion.pass_log,"Emma79793177");
        Click.on(webDriver, evaluacion.button_log);
        Click.on(webDriver, loginUI.pry);
        Enter.text(webDriver,loginUI.input_todo,"Tarea completada");
        Click.on(webDriver, loginUI.add_todo);
    }
}
