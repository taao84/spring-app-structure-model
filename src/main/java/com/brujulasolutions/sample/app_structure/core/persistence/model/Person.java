/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.persistence.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Tomas
 *
 */
@Entity
@Table (name = "people")
public class Person {

	@Id
  @GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	@Column(name="name", length=50, nullable=false, unique=false, insertable = true, updatable = true)
	private String name;
	
	@Column(name="last_name", length=50, nullable=false, unique=false, insertable = true, updatable = true)
	private String lastName;
	
	@Column(name="birthdate", nullable=false, unique=false, insertable = true, updatable = true)
  private LocalDate birthdate;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}
}
