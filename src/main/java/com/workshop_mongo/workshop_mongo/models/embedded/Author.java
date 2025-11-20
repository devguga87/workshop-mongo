package com.workshop_mongo.workshop_mongo.models.embedded;

import com.workshop_mongo.workshop_mongo.models.entities.User;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String id;
    private String name;

    //VER ESSE PARA FAZER COM MAP STRUCT
    public Author(User entity){
        id = entity.getId();
        name = entity.getName();
    }
}
