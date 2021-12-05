package com.bechir.peintures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bechir.peintures.entities.Peintre;
import com.bechir.peintures.entities.Peinture;
import com.bechir.peintures.repos.PeintureRepository;

@SpringBootTest
class PeinturesApplicationTests {

	@Autowired
	private PeintureRepository peintureRepository;
	/*
	@Test
	public void testCreatePeinture() {
	Peintre pt = new Peintre();
	pt.setIdPeintre(1L);
	Peinture p = new Peinture(1L,"test","test*test",1000.0,new Date(),pt);
	peintureRepository.save(p);
	}
	
	@Test
	public void testFindPeinture()
	{
	Peinture p = peintureRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdatePeinture()
	{
	Peinture p = peintureRepository.findById(1L).get();
	p.setPrixPeinture(1500.0);
	peintureRepository.save(p);
	}
	
	@Test
	public void testDeletePeinture()
	{
	peintureRepository.deleteById(2L);;
	}
	
	@Test
	public void testListerTousPeintures()
	{
	List<Peinture> peint = peintureRepository.findAll();
	for (Peinture p : peint)
	{
	System.out.println(p);
	}
	}
	*/
	
	@Test 
	public void testFindByNomPeinture() {
		List<Peinture> peint = peintureRepository.findByNomPeinture("test");
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}
	
	@Test 
	public void testFindByNomPeintureContains() {
		List<Peinture> peint = peintureRepository.findByNomPeinture("tes");
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}
	
	@Test 
	public void testFindByNomPrix() {
		List<Peinture> peint = peintureRepository.findByNomPrix("test",1500.0);
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}
	
	@Test 
	public void testFindByPeintre() {
		Peintre pt = new Peintre();
		pt.setIdPeintre(1L);
		List<Peinture> peint = peintureRepository.findByPeintre(pt);
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}
	@Test 
	public void testFindByPeintreIdPeintre() {
		List<Peinture> peint = peintureRepository.findByPeintreIdPeintre(1L);
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}
	@Test 
	public void testFindByOrderByNomPeintureAsc() {
		List<Peinture> peint = peintureRepository.findByOrderByNomPeintureAsc();
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}
	@Test 
	public void testTrierPeinturesNomsPrix() {
		List<Peinture> peint = peintureRepository.trierPeinturesNomsPrix();
		for (Peinture p : peint)
		{
		System.out.println(p);
		}
	}

}
