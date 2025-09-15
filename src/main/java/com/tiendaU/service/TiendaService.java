package com.tiendaU.service;


import org.springframework.stereotype.Service;

import com.tiendaU.model.Tienda;
import com.tiendaU.repository.TiendaRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TiendaService {
private final TiendaRepository repo;
	
	public TiendaService (TiendaRepository repo) {
		this.repo = repo;
	}
	
	public Mono<Tienda> create(Tienda usuario) {
		return repo.save(usuario);
	}
	
	public Flux<Tienda> getAll(){
		return repo.findAll();
	}
	
	public Mono<Tienda> getById(int id){ 
		return repo.findById(id);
	}
	
	 public Mono<Tienda> update(int id, Tienda newData) {
	        return repo.findById(id)
	                .flatMap(existing -> repo.save(new Tienda(id, newData.nombre(), newData.descripcion(), newData.precio(), newData.stock())));
	    }

	    public Mono<Void> delete(int id) {
	        return repo.deleteById(id);
	    }
	
}
