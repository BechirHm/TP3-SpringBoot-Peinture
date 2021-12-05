package com.bechir.peintures.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.bechir.peintures.entities.Peintre;
import com.bechir.peintures.entities.Peinture;

public interface PeintureService {
	Peinture savePeinture(Peinture p);
	Peinture updatePeinture(Peinture p);
	void deletePeinture(Peinture p);
	void deletePeintureById(Long id);
	Peinture getPeinture(Long id);
	List<Peinture> getAllPeintures();
	
	List<Peinture> findByNomPeinture(String nom);
	List<Peinture> findByNomPeintureContains(String nom);
	List<Peinture> findByNomPrix (String nom, Double prix);
	List<Peinture> findByPeintre (Peintre peintre);
	List<Peinture> findByPeintreIdPeintre(Long id);
	List<Peinture> findByOrderByNomPeintureAsc();
	List<Peinture> trierPeinturesNomsPrix ();
}
