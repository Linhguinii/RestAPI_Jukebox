package com.example.restservice;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JukeboxTest {

	@Test
	public void	getIdTest() {
		String id = "12345";
		String model = "fusion";
		List<Component> components = new ArrayList<Component>();
		Jukebox j = new Jukebox(id, model, components);
		assertEquals(id, j.getId());
	}
	
	@Test
	public void getModelTest() {
		String id = "12345";
		String model = "fusion";
		List<Component> components = new ArrayList<Component>();
		Jukebox j = new Jukebox(id, model, components);
		assertEquals(model, j.getModel());	
	}
	
	@Test
	public void getComponentsTest() {
		String id = "12345";
		String model = "fusion";
		List<Component> components = new ArrayList<Component>();
		components.add(new Component("led_panel"));
		Jukebox j = new Jukebox(id, model, components);
		assertEquals("led_panel", j.getComponents().get(0).getName());
	}

}
