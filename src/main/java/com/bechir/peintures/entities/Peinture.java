package com.bechir.peintures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Peinture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPeinture;
	private String nomPeinture;
	private String dimensions;
	private double prixPeinture;
	private Date dateCreation;
	
	@ManyToOne
	private Peintre peintre;

	public Peinture() {
		super();
	}

	public Peinture(long idPeinture, String nomPeinture, String dimensions, double prixPeinture, Date dateCreation,
			Peintre peintre) {
		super();
		this.idPeinture = idPeinture;
		this.nomPeinture = nomPeinture;
		this.dimensions = dimensions;
		this.prixPeinture = prixPeinture;
		this.dateCreation = dateCreation;
		this.peintre = peintre;
	}

	public long getIdPeinture() {
		return idPeinture;
	}

	public void setIdPeinture(long idPeinture) {
		this.idPeinture = idPeinture;
	}

	public String getNomPeinture() {
		return nomPeinture;
	}

	public void setNomPeinture(String nomPeinture) {
		this.nomPeinture = nomPeinture;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public double getPrixPeinture() {
		return prixPeinture;
	}

	public void setPrixPeinture(double prixPeinture) {
		this.prixPeinture = prixPeinture;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Peintre getPeintre() {
		return peintre;
	}

	public void setPeintre(Peintre peintre) {
		this.peintre = peintre;
	}

	@Override
	public String toString() {
		return "Peinture [idPeinture=" + idPeinture + ", nomPeinture=" + nomPeinture + ", dimensions=" + dimensions
				+ ", prixPeinture=" + prixPeinture + ", dateCreation=" + dateCreation + ", peintre=" + peintre + "]";
	}
	
	
	
}
