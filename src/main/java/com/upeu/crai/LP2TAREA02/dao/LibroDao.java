package com.upeu.crai.LP2TAREA02.dao;

import java.util.List;

import com.upeu.crai.LP2TAREA02.entity.Libro;

public interface LibroDao {
	Libro create(Libro l);
	Libro update(Libro l);
	void delete(Long id);
	Libro read(Long id);
	List<Libro> readAll();
}
