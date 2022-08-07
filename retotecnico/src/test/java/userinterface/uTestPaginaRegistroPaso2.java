package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.time.Duration;

public class uTestPaginaRegistroPaso2 {
    public static final Target WRITE_COUNTRY = Target.the("Escribir nombre del pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target INPUT_CITY = Target.the("Donde se ingresa el nombre de la ciudad").located(By.xpath("//*[@id=\"city\"]"));
    public static final Target INPUT_ZIP = Target.the("Donde se ingresa el ZIP  de la ciudad del usuario").located(By.xpath("//*[@id=\"zip\"]"));
    public static final Target CHOOSE_SELECT = Target.the("Seleccionar item para escoger el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY = Target.the("Donde se ingresa el país del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-2-0\"]/span/div"));
    public static final Target NEXT_BUTTON = Target.the("Botón para seguir con el registro del usuario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
