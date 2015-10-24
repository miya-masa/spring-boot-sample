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
		User test = User.builder().userId("000001").firstName("taro").secondName("suzuki").build();
		userRepository.save(test);
		assertThat(userRepository.count(), is(equalTo(1L)));
	}

}
