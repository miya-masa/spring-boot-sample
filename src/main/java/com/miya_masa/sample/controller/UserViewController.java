package com.miya_masa.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("userView")
@Controller
public class UserViewController {

	@RequestMapping
	public String index() {

		return "index";
	}

}
