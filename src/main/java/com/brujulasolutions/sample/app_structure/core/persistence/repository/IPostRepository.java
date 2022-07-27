/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.persistence.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.brujulasolutions.sample.app_structure.core.persistence.model.Post;
import com.brujulasolutions.sample.app_structure.core.persistence.projections.PostAndOwner;

/**
 * @author Tomas
 *
 */
@Repository
@RepositoryRestResource(collectionResourceRel = "posts", path = "posts")
public interface IPostRepository extends org.springframework.data.repository.Repository<Post, Long> {

	PostAndOwner findPostWithOwnerById(@Param("id") Long id);
	
	Iterable<PostAndOwner> findPostWithOwnerByOwnerId(@Param("id") Long id);
}
