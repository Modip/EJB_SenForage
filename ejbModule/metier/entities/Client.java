package metier.entities;

import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity

public class Client implements Serializable {

	   
	@Id
	private Long nom;
	private Long prenom;
	private Long adresse;
	private Long telephone;
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}   
	public Long getNom() {
		return this.nom;
	}

	public void setNom(Long nom) {
		this.nom = nom;
	}   
	public Long getPrenom() {
		return this.prenom;
	}

	public void setPrenom(Long prenom) {
		this.prenom = prenom;
	}   
	public Long getAdresse() {
		return this.adresse;
	}

	public void setAdresse(Long adresse) {
		this.adresse = adresse;
	}   
	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
   
}
