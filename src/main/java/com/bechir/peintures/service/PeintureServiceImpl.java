package com.bechir.peintures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bechir.peintures.entities.Peintre;
import com.bechir.peintures.entities.Peinture;
import com.bechir.peintures.repos.PeintureRepository;

@Service
public class PeintureServiceImpl implements PeintureService {
	
	@Autowired
	PeintureRepository peintureRepository;
	
	@Override
	public Peinture savePeinture(Peinture p) {
		return peintureRepository.save(p);
	}

	@Override
	public Peinture updatePeinture(Peinture p) {
		return peintureRepository.save(p);
	}

	@Override
	public void deletePeinture(Peinture p) {
		peintureRepository.delete(p);
	}

	@Override
	public void deletePeintureById(Long id) {
		peintureRepository.deleteById(id);
		
	}

	@Override
	public Peinture getPeinture(Long id) {
		return peintureRepository.findById(id).get();
	}

	@Override
	public List<Peinture> getAllPeintures() {
		return peintureRepository.findAll();
	}

	@Override
	public List<Peinture> findByNomPeinture(String nom) {
		return peintureRepository.findByNomPeinture(nom);
	}

	@Override
	public List<Peinture> findByNomPeintureContains(String nom) {
		return peintureRepository.findByNomPeintureContains(nom);
	}

	@Override
	public List<Peinture> findByNomPrix(String nom, Double prix) {
		return peintureRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Peinture> findByPeintre(Peintre peintre) {
		return peintureRepository.findByPeintre(peintre);
	}

	@Override
	public List<Peinture> findByPeintreIdPeintre(Long id) {
		return peintureRepository.findByPeintreIdPeintre(id);
	}

	@Override
	public List<Peinture> findByOrderByNomPeintureAsc() {
		return peintureRepository.findByOrderByNomPeintureAsc();
	}

	@Override
	public List<Peinture> trierPeinturesNomsPrix() {
		return peintureRepository.trierPeinturesNomsPrix();
	}

}
