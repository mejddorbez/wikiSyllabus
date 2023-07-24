package must.wikisyllabus.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Enseignant {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private String nom;
	private String prenom;
	private String grade;
}
