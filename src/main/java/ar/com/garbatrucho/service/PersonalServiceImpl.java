package ar.com.garbatrucho.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.garbatrucho.dominian.Personal;
import ar.com.garbatrucho.repository.PersonalRepository;

@Service
public class PersonalServiceImpl implements PersonalService {
	private PersonalRepository personalRepository;

	@Override
	public Personal save(Personal entity) {
		// TODO Auto-generated method stub
		return this.personalRepository.save(entity);
	}

	@Override
	public Personal getById(Long id) {
		// TODO Auto-generated method stub
		return this.personalRepository.findById(id).orElse(Personal.builder().build());
	}

	@Override
	public void update(Personal personalDB) {
		this.personalRepository.save(personalDB);
		
	}

	@Override
	public void eliminar(Long id) {
		this.personalRepository.deleteById(id);
		
	}

	@Override
	public List<Personal> findAll() {
		// TODO Auto-generated method stub
		return this.personalRepository.findAll();
	} 
	
	
	
}
