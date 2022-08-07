package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.uTestRespuesta;

public class Respuesta implements Question<Boolean> {
    private String pregunta = "Welcome to the world's largest community of freelance software testers!";

    public static Respuesta delRegistro() {
        return new Respuesta();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Result;
        String response = Text.of(uTestRespuesta.RESPONSE).viewedBy(actor).asString();
        if (pregunta.equals(response)){
            return true;
        }
        else {
            return false;
        }
    }

}
