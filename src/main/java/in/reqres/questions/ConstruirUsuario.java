package in.reqres.questions;

import in.reqres.models.UsuarioModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConstruirUsuario implements Question<UsuarioModel> {
    @Override
    public UsuarioModel answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(UsuarioModel.class);
    }

    public static ConstruirUsuario construirUsuarioJson(){
        return new ConstruirUsuario();
    }
}