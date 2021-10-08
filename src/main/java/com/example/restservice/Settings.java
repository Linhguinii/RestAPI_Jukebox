package com.example.restservice;
import java.util.*;

public class Settings {
	private final String id;
	private List<String> requires;
	
	public Settings(String id, List<String> requires) {
		this.id = id;
		this.requires = requires;
	}
	
	public String getId() {
		return id;
	}
	
	public List<String> getRequirements(){
		return new ArrayList<String>(requires);
	}
}
