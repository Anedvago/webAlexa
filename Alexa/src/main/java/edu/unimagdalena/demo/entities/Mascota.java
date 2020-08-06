package edu.unimagdalena.demo.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Mascotas")
public class Mascota implements Serializable{
	
	///////////////////////////////////////////////////Attributes///////////////////////////////////////////////////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String tipo;
	@Column
	private String fn;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="propietario_id", nullable = false)
	private Propietario propietario;
	
	///////////////////////////////////////////////////Constructors//////////////////////////////////////////////////////////
	
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mascota(Long id, String nombre, String tipo, String fn) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fn = fn;
	}

	//////////////////////////////////////////////////////Getters////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public String getFn() {
		return fn;
	}
	public Propietario getPropietario() {
		return propietario;
	}

	//////////////////////////////////////////////////////Setters////////////////////////////////////////////////////////////
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}	
	
}
