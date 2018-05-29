package com.example.democlient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigContainer {

	private String value;

	public ConfigContainer(@Value("${value}")String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
