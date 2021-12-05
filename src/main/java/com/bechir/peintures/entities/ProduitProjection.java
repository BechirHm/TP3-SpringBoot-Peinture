package com.bechir.peintures.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomPeint", types = { Peinture.class })
public interface ProduitProjection {
	public String getNomProduit();
}
