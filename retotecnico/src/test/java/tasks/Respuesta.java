package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.uTestRespuesta;

public class Respuesta implements Question<Boolean> {
    private final String strRespuesta;

    public Respuesta(String strRespuesta) {
        this.strRespuesta = strRespuesta;
    }

    public static Respuesta delRegistro(String strRespuesta) {
        return new Respuesta(strRespuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean Result;
        String response = Text.of(uTestRespuesta.RESPONSE).viewedBy(actor).asString();
        if (strRespuesta.equals(response)){
            return true;
        }
        else {
            return false;
        }
    }

}
