package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.ConfirmarTerminosyCondiciones;

public class Aceptar implements Task {
    public static Aceptar losTerminosyCondiciones(){
        return Tasks.instrumented(Aceptar.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ConfirmarTerminosyCondiciones.CHECK_TERMS),
                Click.on(ConfirmarTerminosyCondiciones.CHECK_POLICY),
                Click.on(ConfirmarTerminosyCondiciones.BUTTON_COMPLETE)

        );
    }
}
