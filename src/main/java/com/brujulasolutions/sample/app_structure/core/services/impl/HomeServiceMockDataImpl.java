/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.services.impl;

import java.time.LocalDate;

import com.brujulasolutions.sample.app_structure.core.dtos.HomeDTO;
import com.brujulasolutions.sample.app_structure.core.dtos.PersonDTO;
import com.brujulasolutions.sample.app_structure.core.services.IHomeService;

/**
 * @author Tomas
 *
 */
public class HomeServiceMockDataImpl implements IHomeService {
	
	public HomeDTO getHomeData() {
		return HomeDTO.builder()
									.withTitle("This is a title is provided by a HomeService mocked data implementation.")
									.withPersonData(
											PersonDTO.builder()
																.withId(1L)
																.withName("Jhon")
																.withLastName("Doe")
																.withBirthDate(LocalDate.MIN)
																.build()
									)
									.build();
	}
}
