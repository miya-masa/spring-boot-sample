package com.miya_masa.sample.controller;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.miya_masa.sample.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class HelloWorldControllerTest {

	@Autowired
	private HelloWorldController helloWorldController;

	@Test
	public void test() {

		String actual = helloWorldController.index();
		assertThat(actual, is(equalTo("Hello World!!!")));
	}

}
