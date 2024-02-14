package in.reqres.stepDefinitions;

import in.reqres.constants.Constants;
import in.reqres.questions.ResponseServerCode;
import in.reqres.tasks.ActualizarUsuarioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

public class ActualizarUsuarioStepDefinitions {

    private String restBaseUrl;
    private EnvironmentVariables environmentVariables;
    private Actor user;

    @Before
    public void setUp(){
        // Especificar la ruta
        restBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                .orElse(Constants.getUrlBaseUser());

        user = Actor.named("user").whoCan(CallAnApi.at(restBaseUrl));
    }

    @Cuando("el usuario consume el endpoint  se envia la informacion para actualizar")
    public void elUsuarioConsumeElEndpointSeEnviaLaInformacionParaActualizar() {
        user.attemptsTo(
                ActualizarUsuarioTask.actualizarUsuario()
        );
    }

    @Entonces("el servidor responde status code {int}")
    public void elServidorRespondeStatusCode(Integer int1) {
        user.should(
                seeThat(ResponseServerCode.was(),equalTo(int1))
               /* seeThatResponse(
                        validatableResponse -> validatableResponse.statusCode(int1)
                )*/
        );
    }


}
