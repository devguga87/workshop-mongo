package com.workshop_mongo.workshop_mongo.models.embedded;

import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    private String text;
    private Instant moment;

    private Author author;
}
