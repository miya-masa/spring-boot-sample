package com.miya_masa.sample.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.miya_masa.sample.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class CityRepositoryTest {

	@Autowired
	private CityRepository cityRepository;

	@Test
	public void test() {

		cityRepository.findAll().stream().forEach(System.out::println);
	}

}
