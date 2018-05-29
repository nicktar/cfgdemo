package com.example.democlient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	private ConfigContainer config;

	@Autowired
	public DemoController(ConfigContainer config) {
		this.config = config;
	}

	@GetMapping(value = "/getdata")
	public String getData() {
		return config.getValue();
	}
}