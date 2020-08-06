package edu.unimagdalena.demo.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Propietarios")
public class Propietario implements Serializable{
	
	///////////////////////////////////////////////////Attributes///////////////////////////////////////////////////////////
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String direccion;
	@Column
	private Long telefono;
	@JsonIgnore
	@OneToMany(mappedBy = "propietario", fetch = FetchType.EAGER)
	private Set<Mascota> mascotas;
	
	///////////////////////////////////////////////////Constructors//////////////////////////////////////////////////////////
	
	public Propietario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Propietario(Long id, String nombre, String apellido, String direccion, Long telefono) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	//////////////////////////////////////////////////////Getters////////////////////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public Long getTelefono() {
		return telefono;
	}
	public Set<Mascota> getMascotas() {
		return mascotas;
	}
	
	//////////////////////////////////////////////////////Setters////////////////////////////////////////////////////////////
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public void setMascotas(Set<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	
}
