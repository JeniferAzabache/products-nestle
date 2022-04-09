package com.jenifera.productosnestle.app.services;

import java.util.List;
import java.util.Optional;

import com.jenifera.productosnestle.app.documents.Producto;

public interface ProductoService {

	public List<Producto> findAll();
	
	public Optional<Producto> findById(String id);
	
	public void save(Producto producto);
	
	public void delete(Producto producto);
	
	
	
	
}
