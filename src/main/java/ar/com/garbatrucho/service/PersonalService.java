package ar.com.garbatrucho.service;

import java.util.List;

import ar.com.garbatrucho.dominian.Personal;

public interface PersonalService {
 
	public Personal save(Personal entity);
	
	public Personal getById(Long id);
	
	public void update(Personal personalDb);
	
	public void eliminar(Long id);
	
	public List<Personal> findAll();
	
}
