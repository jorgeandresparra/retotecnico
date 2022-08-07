package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import javax.swing.table.TableRowSorter;

public class uTestPaginaRegistroPaso3 {
    public static final Target REMOVE_OPTION = Target.the("Quitar opciones detectadas").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i"));

    public static final Target CHOOSE_OPTION_PC_OS = Target.the("Seleccionar item para escoger el sistema operativo del PC del usuario").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER_OS = Target.the("Donde se ingresa el sistema operativo del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-3-1\"]/span/div"));

    public static final Target CHOOSE_OPTION_VERSION_OS = Target.the("Seleccionar item para escoger la version del sistema operativo del usuario").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("Donde se ingresa la versión del sistema operativo del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-4-16\"]/span/div"));

    public static final Target CHOOSE_OPTION_LANGUAGE_OS = Target.the("Seleccionar item para escoger el lenguaje del sistema operativo del usuario").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANGUAJE_OS = Target.the("Donde se ingresa el lenguaje del sistema operativo del usuario").located(By.xpath("//*[@id=\"ui-select-choices-row-5-37\"]/span/div"));

    public static final Target NEXT_BUTTON = Target.the("Botón para seguir con el registro del usuario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
