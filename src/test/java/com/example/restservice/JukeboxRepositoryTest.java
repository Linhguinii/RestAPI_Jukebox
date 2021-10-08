package com.example.restservice;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JukeboxRepositoryTest {

	@Test
	public void getJukeboxesTest() {
		List<Jukebox> jukeboxes = new ArrayList<Jukebox>();
		Jukebox j = new Jukebox("12345","fusion",new ArrayList<Component>());
		jukeboxes.add(j);
		JukeboxRepository jRepo = new JukeboxRepository(jukeboxes);
		assertEquals(jukeboxes, jRepo.getJukeboxes());
	}

}
