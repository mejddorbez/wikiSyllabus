package must.wikisyllabus.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import must.wikisyllabus.entities.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer>{

}
