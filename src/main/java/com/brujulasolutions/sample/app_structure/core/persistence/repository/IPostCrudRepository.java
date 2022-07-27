package com.brujulasolutions.sample.app_structure.core.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.brujulasolutions.sample.app_structure.core.persistence.model.Post;

@Repository
@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface IPostCrudRepository extends CrudRepository<Post, Long> {
}