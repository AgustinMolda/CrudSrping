package ar.com.garbatrucho.service;

import java.util.List;

import ar.com.garbatrucho.dominian.Producto;
import ar.com.garbatrucho.repository.ProductoRepository;

public class ProductoServiceImpl implements ProductoService {

		private ProductoRepository repository;
	
	@Override
	public Producto save(Producto entity) {
		// TODO Auto-generated method stub
		return this.repository.save(entity);
	}

	@Override
	public Producto getById(Long id) {
		
		return this.repository.findById(id).orElse(Producto.builder().build());
	}

	@Override
	public void update(Producto productoDb) {
		
		this.repository.save(productoDb);
		
	}

	@Override
	public void delete(Long id) {
		
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Producto> findAll() {
		
		return this.repository.findAll();
	}

}
