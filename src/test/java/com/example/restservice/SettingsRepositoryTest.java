package com.example.restservice;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SettingsRepositoryTest {

	@Test
	public void getSettingsTest() {
		List<Settings> settings = new ArrayList<Settings>();
		List<String> requires = new ArrayList<String>();
		requires.add("camera");
		settings.add(new Settings("12345", requires));
		SettingsRepository sRepo = new SettingsRepository(settings);
		assertEquals(settings, sRepo.getSettings());
	}

}
