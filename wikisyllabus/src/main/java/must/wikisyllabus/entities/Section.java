package must.wikisyllabus.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Section {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String nom;
	@Entity
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@ToString
	private static class Semestre {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		//@ManyToOne
		//@JoinColumn(name = "id")
		private Integer semId; 
		private Integer totalCoeff;
		private Integer totalVolume;
		private Integer totalCredit;
		private Integer num;
		
	}
	//@OneToMany(mappedBy = "semId")
	//private List<Semestre> semestres;
}
