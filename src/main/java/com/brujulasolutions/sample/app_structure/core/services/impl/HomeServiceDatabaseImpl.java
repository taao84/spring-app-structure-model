/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.services.impl;

import com.brujulasolutions.sample.app_structure.core.dtos.HomeDTO;
import com.brujulasolutions.sample.app_structure.core.dtos.PersonDTO;
import com.brujulasolutions.sample.app_structure.core.persistence.model.Person;
import com.brujulasolutions.sample.app_structure.core.persistence.repository.IPersonCrudRepository;
import com.brujulasolutions.sample.app_structure.core.services.IHomeService;

/**
 * @author Tomas
 *
 */
public class HomeServiceDatabaseImpl implements IHomeService {

	IPersonCrudRepository personRepository;
	
	public HomeServiceDatabaseImpl(IPersonCrudRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public HomeDTO getHomeData() {
		Person p = personRepository.findById(1L).orElseThrow();
		return HomeDTO.builder()
									.withTitle("This is a title provided from a HomeService going to a DB implementation.")
									.withPersonData(
											PersonDTO.builder()
																.withId(p.getId())
																.withName(p.getName())
																.withLastName(p.getLastName())
																.withBirthDate(p.getBirthdate())
																.build()
									)
									.build();
	}
}
