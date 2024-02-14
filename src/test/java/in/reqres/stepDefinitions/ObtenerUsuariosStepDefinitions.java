package in.reqres.stepDefinitions;

import in.reqres.questions.ResponseServerCode;
import in.reqres.tasks.ObtenerUsuarioTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static in.reqres.constants.Constants.getUrlBaseUser;
import static org.hamcrest.Matchers.equalTo;

public class ObtenerUsuariosStepDefinitions {

    Actor user = Actor.named("user")
            .whoCan(CallAnApi.at(getUrlBaseUser()));

    @Cuando("el usuario consume el endpoint")
    public void elUsuarioConsumeElEndpoint() {
        user.attemptsTo(
                ObtenerUsuarioTask.listarUsuarios()
        );
    }
    @Entonces("el usuario podra ver el status code {int}")
    public void elUsuarioPodraVerElStatusCode(Integer int1) {
        user.should(
                GivenWhenThen.seeThat(
                        ResponseServerCode.was(),equalTo(int1)
                )
        );
    }

}
