package ar.com.garbatrucho.dominian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "modelo" , length = 100)
	private String modelo;
	
	@Column(name = "marca", length = 50)
	private String marca;
	
	@Column(name = "precio")
	private Double precio;
	
	@Column(name = "cantidad")
	private Integer cantidad;
	
	@Column(name = "proveedor", length = 50)
	private String proveedor;
	
	@ManyToOne
	@JoinColumn(name = "id_producto", referencedColumnName="id")
	private Venta venta;
}
