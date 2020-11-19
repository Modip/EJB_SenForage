package metier.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Village
 *
 */
@Entity

public class Village implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long nom;
	private static final long serialVersionUID = 1L;

	public Village() {
		super();
	}   
	public Long getNom() {
		return this.nom;
	}

	public void setNom(Long nom) {
		this.nom = nom;
	}
   
}
