package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import model.uTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import cucumber.api.DataTable;
import tasks.Abrir;
import tasks.Aceptar;
import tasks.Registrar;
import tasks.Respuesta;

import java.util.List;


public class uTestStepDefinitions {

    @Before
    public void SetStage(){OnStage.setTheStage(new OnlineCast());}
    @Dado("^que Andres quiera registrarse en la pagina Utest$")
    public void queAndresQuieraRegistrarseEnLaPaginaUtest(DataTable dataTable) {
        List<uTestData> uTestData=dataTable.asList(model.uTestData.class);
        OnStage.theActorCalled("Andres").wasAbleTo(Abrir.laPagina(), Registrar.elUsuarioPaso1(uTestData.get(0).getStrNombre(),uTestData.get(0).getStrApellido(),uTestData.get(0).getStrCorreo(),uTestData.get(0).getStrCiudad(),uTestData.get(0).getStrZip(),uTestData.get(0).getStrPais(),uTestData.get(0).getStrPassword()));
    }

    @Cuando("^el intente crear su usuario y acepte los terminos y condiciones$")
    public void elIntenteCrearSuUsuarioYAcepteLosTerminosYCondiciones(DataTable dataTable) {
        List<uTestData> uTestData = dataTable.asList(model.uTestData.class);
        OnStage.theActorInTheSpotlight().attemptsTo(Aceptar.losTerminosyCondiciones());
    }

    @Entonces("^el creara su usuario con exito$")
    public void elCrearaSuUsuarioConExito(DataTable dataTable) {
        List<uTestData> uTestData = dataTable.asList(model.uTestData.class);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.delRegistro(uTestData.get(0).getStrRespuesta())));

    }
}
