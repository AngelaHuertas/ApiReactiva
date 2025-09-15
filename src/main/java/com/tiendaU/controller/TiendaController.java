package com.tiendaU.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiendaU.model.Tienda;
import com.tiendaU.service.TiendaService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/tienda")
public class TiendaController {
	private final TiendaService service;
	
	public TiendaController(TiendaService service) {
		this.service = service;
	}
	
	@PostMapping
	public Mono<Tienda> create(@RequestBody Tienda tienda){
		return service.create(tienda);
	}
	
	@GetMapping
	public Flux<Tienda> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Mono<Tienda> getById(@PathVariable int id){
		return service.getById(id);
	}
	
	@PutMapping("/{id}")
	public Mono<Tienda> update(@PathVariable int id, @RequestBody Tienda tienda){
		return service.update(id, tienda);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> deleye(@PathVariable int id){
		return service.delete(id);
	}
	
}

