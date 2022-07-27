/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.dtos;

import java.time.LocalDate;
import javax.annotation.Generated;

/**
 * @author Tomas
 *
 */
public class PersonDTO {

	private Long id;
	
	private String name;
	
	private String lastName;
	
  private LocalDate birthDate;

	@Generated("SparkTools")
	private PersonDTO(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.lastName = builder.lastName;
		this.birthDate = builder.birthDate;
	}

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
	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private Long id;
		private String name;
		private String lastName;
		private LocalDate birthDate;

		private Builder() {
		}

		public Builder withId(Long id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder withBirthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return this;
		}

		public PersonDTO build() {
			return new PersonDTO(this);
		}
	}
}
