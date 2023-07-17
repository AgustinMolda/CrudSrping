package ar.com.garbatrucho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.garbatrucho.dominian.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Long> {
	

}
