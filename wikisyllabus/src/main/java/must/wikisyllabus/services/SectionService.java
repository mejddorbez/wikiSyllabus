package must.wikisyllabus.services;

import java.util.List;

import must.wikisyllabus.entities.*;

public interface SectionService {

	public void addSection(Section s);
	public List<Section> getAll();
	public void deleteSection(int id);
	public void modifierSection(int id, Section s);
}
