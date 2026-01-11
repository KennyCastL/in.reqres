package in.reqres.questions;

import in.reqres.models.UsuarioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ConstruirUsuario implements Question<UsuarioModel> {
    @Override
    public UsuarioModel answeredBy(Actor actor) {
        return UsuarioModel.builder()
                .name("Jorge Pepe Sierra")
                .job("Eliminador de problemas")
                .build();
    }

    public static ConstruirUsuario construirUsuarioJson(){
        return new ConstruirUsuario();
    }
}