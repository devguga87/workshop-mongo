package com.workshop_mongo.workshop_mongo.models.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String email;

    @DBRef(lazy = true)
    public List<Post> posts = new ArrayList<>();

    public User(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
