package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import userinterface.*;
import java.time.Duration;

public class Registrar implements Task {
    private final String strNombre;
    private final String strApellido;
    private final String strCorreo;
    private final String strCiudad;
    private final String strZip;
    private final String strPais;
    private final String strPassword;

    public Registrar(String strNombre, String strApellido, String strCorreo, String strCiudad, String strZip, String strPais, String strPassword) {
        this.strNombre = strNombre;
        this.strApellido = strApellido;
        this.strCorreo = strCorreo;
        this.strCiudad = strCiudad;
        this.strZip = strZip;
        this.strPais = strPais;
        this.strPassword = strPassword;
    }

    public static Registrar elUsuarioPaso1(String strNombre, String strApellido, String strCorreo, String strCiudad, String strZip, String strPais, String strPassword) {
        return Tasks.instrumented(Registrar.class,strNombre,strApellido,strCorreo,strCiudad,strZip,strPais,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestPaginaRegistroPaso1.JOIN_BUTTON),

                Enter.keyValues(strNombre).into(uTestPaginaRegistroPaso1.INPUT_NAME.waitingForNoMoreThan(Duration.ofMinutes(2))),
                Enter.theValue(strApellido).into(uTestPaginaRegistroPaso1.INPUT_LASTNAME.waitingForNoMoreThan(Duration.ofSeconds(4))),
                Enter.theValue(strCorreo).into(uTestPaginaRegistroPaso1.INPUT_EMAIL),
                Click.on(uTestPaginaRegistroPaso1.INPUT_MONTHBIRTH),
                Click.on(uTestPaginaRegistroPaso1.INPUT_BIRTHDAY),
                Click.on(uTestPaginaRegistroPaso1.INPUT_BIRTHYEAR),
                Click.on(uTestPaginaRegistroPaso1.NEXT_BUTTON),
                Enter.keyValues(strCiudad).into(uTestPaginaRegistroPaso2.INPUT_CITY),
                Enter.theValue(strZip).into(uTestPaginaRegistroPaso2.INPUT_ZIP),
                Click.on(uTestPaginaRegistroPaso2.CHOOSE_SELECT),
                Enter.keyValues(strPais).into(uTestPaginaRegistroPaso2.WRITE_COUNTRY),
                Click.on(uTestPaginaRegistroPaso2.INPUT_COUNTRY),
                Click.on(uTestPaginaRegistroPaso2.NEXT_BUTTON),
                Click.on(uTestPaginaRegistroPaso3.REMOVE_OPTION.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(uTestPaginaRegistroPaso3.CHOOSE_OPTION_PC_OS),
                Click.on(uTestPaginaRegistroPaso3.INPUT_COMPUTER_OS),
                Click.on(uTestPaginaRegistroPaso3.CHOOSE_OPTION_VERSION_OS),
                Click.on(uTestPaginaRegistroPaso3.INPUT_VERSION),
                Click.on(uTestPaginaRegistroPaso3.CHOOSE_OPTION_LANGUAGE_OS),
                Click.on(uTestPaginaRegistroPaso3.INPUT_LANGUAJE_OS),
                Click.on(uTestPaginaRegistroPaso3.NEXT_BUTTON),
                Enter.theValue(strPassword).into(uTestPaginaRegistroPaso4.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(uTestPaginaRegistroPaso4.INPUT_CONFIRM_PASSWORD)
                );
    }
}
