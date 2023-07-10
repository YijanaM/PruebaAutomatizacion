package net.onlinenotepad.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class OnlineNotepad extends PageObject {

    public static final Target SSEl_NOTE = Target.the("Nota de texto enriquecido").located(By.xpath("//button[@id='richtextnote-tab'and @aria-selected='true']"));
    public static final Target SSEl_B = Target.the("Seleccionar B").located(By.xpath("']"));
}
