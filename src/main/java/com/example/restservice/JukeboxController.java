package com.example.restservice;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JukeboxController {
	private JukeboxRepository repo = new JukeboxRepository();

	@GetMapping("/jukes")
	public List<Jukebox> getJukeboxes(){
		List<Jukebox> jukeboxes = repo.getJukeboxes();
		for(int i =0;i<jukeboxes.size();i++) {
			if(jukeboxes.get(i).getId() == "") {
				error();
			}
			if(jukeboxes.get(i).getModel() == "") {
				error();
			}
		}
		return jukeboxes;	
	}
	
	@ResponseBody
	private ResponseEntity error() {
		return new ResponseEntity(org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
	}
	
}
