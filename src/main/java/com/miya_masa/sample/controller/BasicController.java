package com.miya_masa.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("basic")
public class BasicController {

	@RequestMapping
	public String index() {

		return "basic";
	}

}
