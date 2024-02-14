package in.reqres.tasks;

import in.reqres.questions.ConstruirUsuario;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static in.reqres.constants.Constants.getPostUser;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuarioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to(getPostUser()).with(
                        requestSpecification -> requestSpecification
                                .contentType(ContentType.JSON)
                                .body(
                                        actor.asksFor(ConstruirUsuario.construirUsuarioJson())
                                )
                )
        );
    }

    public static CrearUsuarioTask crearUsuario(){
        return instrumented(CrearUsuarioTask.class);
    }
}
