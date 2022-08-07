package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestRespuesta {
    public static final Target RESPONSE = Target.the("Cuadro de respuesta").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
