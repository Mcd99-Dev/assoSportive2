package org.assoSportive.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sports {

    @Field("Jouer")
    private List<String> jouer;
    @Field("Arbitrer")
    private List <String> arbitrer;
    @Field("Entrainer")
    private List<String> entrainer;

}
