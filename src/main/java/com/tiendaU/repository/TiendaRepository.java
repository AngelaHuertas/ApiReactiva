package com.tiendaU.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.tiendaU.model.Tienda;

@Repository
public interface TiendaRepository extends ReactiveCrudRepository<Tienda, Integer>{
	
}
