package com.example.restservice;
import java.util.*;

public class JukeboxRepository {
	private List<Jukebox> jukeboxes;
	
	public JukeboxRepository() {
		this.jukeboxes = new ArrayList<Jukebox>();
	}

	public JukeboxRepository(List<Jukebox> jukeboxes) {
		this.jukeboxes = jukeboxes; 
	}
	public List<Jukebox> getJukeboxes(){
		return jukeboxes;
	}
	
}
