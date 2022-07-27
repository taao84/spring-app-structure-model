package com.brujulasolutions.sample.app_structure.core.persistence.projections;

import java.time.LocalDate;

public interface PostAndOwner {

	public Long getId();
	
	public String getTitle();

	public String getDescription();

	public LocalDate getCreatedAt();

	PostOwner getOwner();
  
  interface PostOwner {
  	
  	public String getName();
  	
  	public String getLastName();
  }
}
