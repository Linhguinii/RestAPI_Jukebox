package com.example.restservice;
import java.util.*;

public class Jukebox {
	private final String id;
	private final String model;
	private List<Component> components;
	
	public Jukebox(String id, String model, List<Component> components) {
		this.id = id;
		this.model = model;
		this.components = components;
	}
	
	public Jukebox(Jukebox j) {
		this.id= j.getId();
		this.model = j.getModel();
		this.components= j.getComponents();
	}

	public String getId() {
		return this.id;
	}

	public String getModel() {
		return this.model;
	}
	
	public List<Component> getComponents() {
		return new ArrayList<Component>(components);
	}
}

