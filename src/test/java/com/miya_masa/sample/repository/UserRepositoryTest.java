package com.miya_masa.sample.repository;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.miya_masa.sample.Application;
import com.miya_masa.sample.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test_findAll() {
		assertThat(userRepository.count(), is(equalTo(3L)));
		userRepository.findAll().stream().forEach(System.out::println);
	}

	@Test
	public void test_findById() {

		User actual = userRepository.findOne("00001");
		assertThat(actual.getFirstName(), is(equalTo("suzuki")));
		assertThat(actual.getSecondName(), is(equalTo("taro")));
	}

}
