package com.example.restservice;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SettingsTest {

	@Test
	public void getIdTest() {
		String id = "12345";
		List<String> requires = new ArrayList<String>();
		Settings setting = new Settings(id, requires);
		assertEquals(id, setting.getId());
	}
	
	@Test 
	public void getRequirementsTest() {
		String id = "12345";
		List<String> requires = new ArrayList<String>();
		requires.add("touchscreen");
		Settings settings = new Settings(id, requires);
		assertEquals("touchscreen", settings.getRequirements().get(0));
	}

}
