package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import util.Retardo;

public class uTestPaginaRegistroPaso1 {
    public static final Target JOIN_BUTTON = Target.the("Botón que muestra la página para iniciar el registro").located(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a"));
    public static final Target INPUT_NAME = Target.the("Donde se escribe el nombre del usuario").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target INPUT_LASTNAME = Target.the("Donde se escribe el apellido del usuario").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target INPUT_EMAIL = Target.the("Donde se escribe el correo del usuario").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target INPUT_MONTHBIRTH = Target.the("Donde se ingresa el mes de cumpleaños del usuario").located(By.xpath("//*[@id=\"birthMonth\"]/option[3]"));
    public static final Target INPUT_BIRTHDAY = Target.the("Donde se ingresa el día de cumpleaños del usuario").located(By.xpath("//*[@id=\"birthDay\"]/option[10]"));
    public static final Target INPUT_BIRTHYEAR = Target.the("Donde se ingresa el año de cumpleaños del usuario").located(By.xpath("//*[@id=\"birthYear\"]/option[8]"));
    public static final Target NEXT_BUTTON = Target.the("Botón para seguir con el registro del usuario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
