package com.example.restservice;
import java.util.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingsController {
	private SettingsRepository repo = new SettingsRepository();
	
	@GetMapping("/settings")
	public List<Settings> getSettings(){
		List<Settings> settings = repo.getSettings();
		for(int i =0;i<settings.size();i++) {
			if(settings.get(i).getId() == "") {
				error();
			}
			for(int j=0;j<settings.get(i).getRequirements().size();j++) {
				if(settings.get(i).getRequirements().get(j) == "") {
					error();
				}
			}
		}
		return settings;
	}
	
	@ResponseBody
	private ResponseEntity error() {
		return new ResponseEntity(org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
	}
}
