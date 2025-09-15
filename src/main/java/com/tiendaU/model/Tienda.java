package com.tiendaU.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("productos")
public record Tienda(
		@Id int id,
		String nombre,
		String descripcion, 
		double precio,
		int stock
		) {}
