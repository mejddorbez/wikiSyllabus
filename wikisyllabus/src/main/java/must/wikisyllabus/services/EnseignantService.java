package must.wikisyllabus.services;

import java.util.List;

import must.wikisyllabus.entities.*;

public interface EnseignantService {

	public void addENS(Enseignant e);
	public List<Enseignant> getAll();
	public void deleteENS(int id);
	public void updateENS(int id, Enseignant e);
}
