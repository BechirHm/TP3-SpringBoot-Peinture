package com.bechir.peintures.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bechir.peintures.entities.Peintre;
import com.bechir.peintures.entities.Peinture;

@RepositoryRestResource(path = "rest")
public interface PeintureRepository extends JpaRepository<Peinture, Long> {
	List<Peinture> findByNomPeinture(String nom);
	List<Peinture> findByNomPeintureContains(String nom);
	
	@Query("select p from Peinture p where p.nomPeinture like %?1 and p.prixPeinture > ?2")
	List<Peinture> findByNomPrix (String nom, Double prix);
	
	@Query("select p from Peinture p where p.peintre = ?1")
	List<Peinture> findByPeintre (Peintre peintre);
	
	List<Peinture> findByPeintreIdPeintre(Long id);
	
	List<Peinture> findByOrderByNomPeintureAsc();
	
	@Query("select p from Peinture p order by p.nomPeinture ASC, p.prixPeinture DESC")
	List<Peinture> trierPeinturesNomsPrix ();
}
