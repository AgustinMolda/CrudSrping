package ar.com.garbatrucho.dominian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "id_producto")
	private int id_producto;
	
	@Column(name = "id_cliente")
	private int id_cliente;
	
	@Column(name = "id_personal")
	private int id_personal;
	
	@Column(name = "id_detalle")
	private int id_detalle;
	
}
