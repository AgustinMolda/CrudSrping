package ar.com.garbatrucho.service;

import java.util.List;

import ar.com.garbatrucho.dominian.Producto;

public interface ProductoService {
	
	public Producto save(Producto entity);
	
	public Producto getById(Long id);
	
	public void update(Producto productoDb);
	
	public void delete(Long id);
	
	public List<Producto> findAll();
}
