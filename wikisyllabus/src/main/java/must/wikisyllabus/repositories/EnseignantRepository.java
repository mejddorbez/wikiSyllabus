package must.wikisyllabus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import must.wikisyllabus.entities.Enseignant;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer>{

}
