package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarTerminosyCondiciones {
    public static final Target CHECK_TERMS = Target.the("Verificar cuadro terminos y condiciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_POLICY = Target.the("Verificar cuadro politica de seguridad").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE = Target.the("Boton para finalizar registro").located(By.xpath("//*[@id=\"laddaBtn\"]"));

}

