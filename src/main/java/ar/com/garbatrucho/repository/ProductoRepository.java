package ar.com.garbatrucho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.garbatrucho.dominian.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
