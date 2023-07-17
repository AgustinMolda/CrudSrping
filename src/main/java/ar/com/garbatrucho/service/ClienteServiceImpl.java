package ar.com.garbatrucho.service;

import java.util.List;

import ar.com.garbatrucho.dominian.Cliente;
import ar.com.garbatrucho.repository.ClienteRepository;

public class ClienteServiceImpl implements ClienteService {

	private ClienteRepository repository;
	
	@Override
	public Cliente save(Cliente entity) {
		// TODO Auto-generated method stub
		return this.repository.save(entity);
	}

	@Override
	public Cliente getById(Long id) {
		// TODO Auto-generated method stub
		return this.repository.findById(id).orElse(Cliente.builder().build());
	}

	@Override
	public void update(Cliente clienteDb) {
		this.repository.save(clienteDb);
		
	}

	@Override
	public void eliminar(Long id) {
		this.repository.deleteById(id);
		
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return this.repository.findAll();
	}

}
