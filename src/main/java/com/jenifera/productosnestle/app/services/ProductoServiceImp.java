package com.jenifera.productosnestle.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jenifera.productosnestle.app.dao.ProductoDao;
import com.jenifera.productosnestle.app.documents.Producto;

@Service
public class ProductoServiceImp implements ProductoService{

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	public List<Producto> findAll() {
		return productoDao.findAll();
	}

	@Override
	public Optional<Producto> findById(String id) {
		return productoDao.findById(id);
	}

	@Override
	public void save(Producto producto) {
		productoDao.save(producto);
		
	}

	@Override
	public void delete(Producto producto) {
		productoDao.delete(producto);
		
	}
	

}
