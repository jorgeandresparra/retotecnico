package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestPaginaRegistroPaso4 {
    public static final Target INPUT_PASSWORD = Target.the("Donde se ingresa la contraseña del usuario").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Donde se rectifica la contraseña del usuario").located(By.xpath("//*[@id=\"confirmPassword\"]"));
    public static final Target CHECK_TERMS = Target.the("Cuadro para aceptar terminos y condiciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY_POLICY = Target.the("Cuadro para aceptar politica de privacidad y seguridad").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

}
