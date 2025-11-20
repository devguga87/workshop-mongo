package com.workshop_mongo.workshop_mongo.repositories;

import com.workshop_mongo.workshop_mongo.models.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
