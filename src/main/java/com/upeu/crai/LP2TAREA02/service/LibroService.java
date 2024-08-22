package com.upeu.crai.LP2TAREA02.service;

import java.util.List;

import com.upeu.crai.LP2TAREA02.entity.Libro;

public interface LibroService {
	Libro create(Libro l);
	Libro update(Libro l);
	void delete(Long id);
	Libro read(Long id);
	List<Libro> readAll();
}
