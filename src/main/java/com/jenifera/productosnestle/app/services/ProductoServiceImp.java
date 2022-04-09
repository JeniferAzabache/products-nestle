package com.jenifera.productosnestle.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.jenifera.productosnestle.app.dao.ProductoDao;
import com.jenifera.productosnestle.app.documents.Producto;

public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Producto> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Producto producto) {
		// TODO Auto-generated method stub
		
	}
	

}
