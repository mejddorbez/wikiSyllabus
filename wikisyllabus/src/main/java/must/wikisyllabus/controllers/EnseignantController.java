package must.wikisyllabus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import must.wikisyllabus.entities.Enseignant;
import must.wikisyllabus.services.EnseignantServiceImpl;

@RequestMapping("/api/enseignants")
@RestController
public class EnseignantController {

	@Autowired EnseignantServiceImpl enseignantService;
	
	@PostMapping
	public void addENS(@RequestBody Enseignant e) {
		enseignantService.addENS(e);
	}
	
	@GetMapping
	public List<Enseignant> getAll() {
		return enseignantService.getAll();
	}

	@DeleteMapping("/test/{id}")
	public void deleteENS(@PathVariable(name = "id") int id) {
		enseignantService.deleteENS(id);
	}
	
	@PutMapping("/test/{id}")
	public void updateENS(@PathVariable(name = "id") int id, @RequestBody Enseignant e) {
		enseignantService.updateENS(id, e);
	}
}
