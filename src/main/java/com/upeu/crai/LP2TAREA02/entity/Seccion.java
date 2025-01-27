package com.upeu.crai.LP2TAREA02.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tbl_secciones")
public class Seccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_seccion")
	private Long idSeccion;
	@Column(name = "seccion", columnDefinition = "varchar(20)")
	private String seccion;
	@Column(name = "estado", columnDefinition = "char(1)")
	private char estado;
	
	@ManyToOne(targetEntity = Categoria.class)
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "seccion")
	@JsonIgnore
	private List<Libro> libros;
}
