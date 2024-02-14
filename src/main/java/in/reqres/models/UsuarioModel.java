package in.reqres.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    @JsonProperty("name")
    public String name;
    @JsonProperty("job")
    public String job;

}
