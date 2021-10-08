package com.example.restservice;
import java.util.*;

public class SettingsRepository {
	private List<Settings> settings;
	
	public SettingsRepository() {
		this.settings = new ArrayList<Settings>();
	}
	
	public SettingsRepository(List<Settings> settings) {
		this.settings = settings;
	}
	
	public List<Settings> getSettings(){
		return new ArrayList<Settings>(settings);
	}
}
