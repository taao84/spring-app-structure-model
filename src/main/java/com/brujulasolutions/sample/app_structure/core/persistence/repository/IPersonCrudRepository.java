package com.brujulasolutions.sample.app_structure.core.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.brujulasolutions.sample.app_structure.core.persistence.model.Person;

@Repository
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface IPersonCrudRepository extends CrudRepository<Person, Long> {

	@RestResource
  List<Person> findByName(@Param("name") String name);
}