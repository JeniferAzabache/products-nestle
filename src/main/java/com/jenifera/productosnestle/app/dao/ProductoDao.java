package com.jenifera.productosnestle.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jenifera.productosnestle.app.documents.Producto;

public interface ProductoDao extends MongoRepository<Producto, String> {

}
