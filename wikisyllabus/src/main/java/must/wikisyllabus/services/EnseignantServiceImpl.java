package must.wikisyllabus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import must.wikisyllabus.entities.Enseignant;
import must.wikisyllabus.repositories.EnseignantRepository;

@Service
public class EnseignantServiceImpl implements EnseignantService {

@Autowired EnseignantRepository enseignantRepo;
	
	@Override
	public void addENS(@RequestBody Enseignant e) {
		enseignantRepo.save(e);
	}
	
	@Override
	public List<Enseignant> getAll() {
		return enseignantRepo.findAll();
	}

	@Override
	public void deleteENS(@PathVariable(name = "id") int id) {
		enseignantRepo.deleteById(id);
	}
	
	@Override
	public void updateENS(@PathVariable(name = "id") int id, @RequestBody Enseignant e) {
		Enseignant ed = enseignantRepo.findById(id).get();
		ed.setNom(e.getNom());
		ed.setPrenom(e.getPrenom());
		ed.setGrade(e.getGrade());
		enseignantRepo.save(ed);
	}

}
