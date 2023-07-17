package ar.com.garbatrucho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.garbatrucho.dominian.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
