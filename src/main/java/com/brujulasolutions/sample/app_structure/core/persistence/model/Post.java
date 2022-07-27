/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.persistence.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Tomas
 *
 */
@Entity
@Table (name = "posts")
public class Post {

	@Id
  @GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@Column(name="title", length=100, nullable=false, unique=false, insertable = true, updatable = true)
	private String title;
	
	@Column(name="description", length=255, nullable=true, unique=false, insertable = true, updatable = true)
	private String description;
	
	@Column(name="created_at", nullable=false, unique=false, insertable = true, updatable = false)
	private LocalDate createdAt;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="owner", nullable=false, updatable=false)
	private Person owner;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the createdAt
	 */
	public LocalDate getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the owner
	 */
	public Person getOwner() {
		return owner;
	}
}
