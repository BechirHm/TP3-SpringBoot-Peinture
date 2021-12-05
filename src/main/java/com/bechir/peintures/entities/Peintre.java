package com.bechir.peintures.entities;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Peintre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPeintre;
	private String nomPeintre;
	private String nationalite;
	@JsonIgnore
	@OneToMany(mappedBy = "peintre")
	List<Peinture> peintures;
	@Override
	public String toString() {
		return "Peintre [idPeintre=" + idPeintre + ", nomPeintre=" + nomPeintre + ", nationalite=" + nationalite + "]";
	}
	
	
}
