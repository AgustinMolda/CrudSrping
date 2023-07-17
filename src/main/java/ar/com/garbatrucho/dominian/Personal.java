package ar.com.garbatrucho.dominian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "personal")

public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre" , length = 50)
	private String nombre;
	
	@Column(name = "apellido", length = 50)
	private String apellido;
	
	@Column(name = "email" , length = 50)
	private String email;
	
	@Column(name = "telefono")
	private int telefono;
	
	@Column(name = "dni")
	private int dni;
	
	@ManyToOne
	@JoinColumn(name = "id_venta" ,  referencedColumnName = "id" )
	private Venta venta;
	
	@OneToOne(mappedBy ="usuario")
	@JoinColumn(name = "id_usuario" ,  referencedColumnName = "id" )
	private Usuario usuario; 
}


