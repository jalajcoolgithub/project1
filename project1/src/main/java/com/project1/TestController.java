package com.project1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/name")
	public String name()
	{
		return "jalaj";
	}

}
