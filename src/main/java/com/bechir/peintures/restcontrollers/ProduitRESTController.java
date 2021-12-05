package com.bechir.peintures.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bechir.peintures.entities.Peinture;
import com.bechir.peintures.service.PeintureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
@Autowired
PeintureService peintureService;
@RequestMapping(method = RequestMethod.GET)
public List<Peinture> getAllPeintures() {
return peintureService.getAllPeintures();
}

@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Peinture getPeintureById(@PathVariable("id") Long id) {
return peintureService.getPeinture(id);
}


@RequestMapping(method = RequestMethod.POST)
public Peinture createProduit(@RequestBody Peinture peinture) {
return peintureService.savePeinture(peinture);
}

@RequestMapping(method = RequestMethod.PUT)
public Peinture updateProduit(@RequestBody Peinture peinture) {
return peintureService.updatePeinture(peinture);
}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deletePeinture(@PathVariable("id") Long id)
{
peintureService.deletePeintureById(id);
}

@RequestMapping(value="/peints/{idPeint}",method = RequestMethod.GET)
public List<Peinture> getPeinturesByPeintreId(@PathVariable("idPeint") Long idPeintre) {
return peintureService.findByPeintreIdPeintre(idPeintre);
}
}
