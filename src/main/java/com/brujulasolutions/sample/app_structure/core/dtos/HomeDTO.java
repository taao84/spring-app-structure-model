/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.dtos;

import javax.annotation.Generated;

/**
 * @author Tomas
 *
 */
public class HomeDTO {

	private String title;
	
	private PersonDTO personData;

	@Generated("SparkTools")
	private HomeDTO(Builder builder) {
		this.title = builder.title;
		this.personData = builder.personData;
	}

	@Override
	public String toString() {
		return "HomeDTO [title=" + title + ", personData=" + personData + "]";
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the personData
	 */
	public PersonDTO getPersonData() {
		return personData;
	}

	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	@Generated("SparkTools")
	public static final class Builder {
		private String title;
		private PersonDTO personData;

		private Builder() {
		}

		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder withPersonData(PersonDTO personData) {
			this.personData = personData;
			return this;
		}

		public HomeDTO build() {
			return new HomeDTO(this);
		}
	}
	
}