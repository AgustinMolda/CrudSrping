package ar.com.garbatrucho.service;

import java.util.List;

import ar.com.garbatrucho.dominian.Cliente;

public interface ClienteService {
	
	public Cliente save(Cliente entity);
	
	public Cliente getById(Long id);
	
	public void update(Cliente clienteDb);
	
	public void eliminar(Long id);
	
	public List<Cliente> findAll();
}
