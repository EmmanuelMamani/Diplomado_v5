package task.tasking;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.check;
import ui.HomePageUI;
public class check1 {
    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePageUI.check);
        Click.on(webDriver, check.checkBoxes);
    }
}
