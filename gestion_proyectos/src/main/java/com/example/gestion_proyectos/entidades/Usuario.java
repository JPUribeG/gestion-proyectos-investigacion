package com.example.gestion_proyectos.entidades;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.JoinColumn;

@Entity
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 3165262695141993766L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Long id;
	
	@Column 
	private String nombre;
	@Column 
	private String apellido;
	@Column(unique = true) 
	private String email;
	@Column(unique = true) 
	private String alias;
	@Column
	private String password;
	
	@Transient 
	private String confirmarPassword;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuario_roles"
		,joinColumns=@JoinColumn(name="usuario_id")
		,inverseJoinColumns=@JoinColumn(name="rol_id"))
	private Set<Rol> roles;
	
    public Usuario() {	}
	
	public Usuario(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmarPassword() {
		return confirmarPassword;
	}

	public void setConfirmarPassword(String confirmarPassword) {
		this.confirmarPassword = confirmarPassword;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", alias="
				+ alias + ", password=" + password + ", confirmarPassword=" + confirmarPassword + ", roles=" + roles
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(alias, apellido, confirmarPassword, email, id, nombre, password, roles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(alias, other.alias) && Objects.equals(apellido, other.apellido)
				&& Objects.equals(confirmarPassword, other.confirmarPassword) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(password, other.password) && Objects.equals(roles, other.roles);
	} 
	
}
