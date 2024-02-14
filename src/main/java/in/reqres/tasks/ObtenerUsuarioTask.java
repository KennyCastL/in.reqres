package in.reqres.tasks;

import static in.reqres.constants.Constants.getGetUsers;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ObtenerUsuarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(getGetUsers()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .log()
                                .all()
                )
        );
    }

    public static ObtenerUsuarioTask listarUsuarios(){
        return instrumented(ObtenerUsuarioTask.class);
    }
}
