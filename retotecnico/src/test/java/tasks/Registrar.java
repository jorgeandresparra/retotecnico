package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;
import userinterface.*;
import java.time.Duration;

public class Registrar implements Task {

    public static Registrar elUsuarioPaso1() {
        return Tasks.instrumented(Registrar.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(uTestPaginaRegistroPaso1.JOIN_BUTTON),

                Enter.keyValues("Andres").into(uTestPaginaRegistroPaso1.INPUT_NAME.waitingForNoMoreThan(Duration.ofMinutes(2))),
                Enter.theValue("Parra").into(uTestPaginaRegistroPaso1.INPUT_LASTNAME.waitingForNoMoreThan(Duration.ofSeconds(4))),
                Enter.theValue("japc48@gmail.com").into(uTestPaginaRegistroPaso1.INPUT_EMAIL),
                Click.on(uTestPaginaRegistroPaso1.INPUT_MONTHBIRTH),
                Click.on(uTestPaginaRegistroPaso1.INPUT_BIRTHDAY),
                Click.on(uTestPaginaRegistroPaso1.INPUT_BIRTHYEAR),
                Click.on(uTestPaginaRegistroPaso1.NEXT_BUTTON),
                Enter.keyValues("Bogota,Bogota").into(uTestPaginaRegistroPaso2.INPUT_CITY),
                Enter.theValue("110111").into(uTestPaginaRegistroPaso2.INPUT_ZIP),
                Click.on(uTestPaginaRegistroPaso2.CHOOSE_SELECT),
                Enter.keyValues("Colombia").into(uTestPaginaRegistroPaso2.WRITE_COUNTRY),
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
                Enter.theValue("Choucair4636*").into(uTestPaginaRegistroPaso4.INPUT_PASSWORD),
                Enter.theValue("Choucair4636*").into(uTestPaginaRegistroPaso4.INPUT_CONFIRM_PASSWORD)
                );
    }
}
