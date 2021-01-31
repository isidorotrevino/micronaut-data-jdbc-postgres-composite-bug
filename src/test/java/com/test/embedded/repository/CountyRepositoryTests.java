package com.test.embedded.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.test.embedded.entity.County;
import com.test.embedded.entity.CountyPk;
import com.test.embedded.entity.State;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class CountyRepositoryTests {

	@Inject
	protected CountyRepository repo;
	
	@Test
    public void testInsertion() {
		State state = new State();
        state.setId(Integer.valueOf(3));
        
        CountyPk countyPk = new CountyPk();
        countyPk.setId(Integer.valueOf(5));
        countyPk.setState(state);
        
        County county = new County();
        county.setId(countyPk);
        county.setCountyName("test county");
        county.setEnabled(true);
        
        county = repo.save(county);
        assertNotNull(county);
	}
}
