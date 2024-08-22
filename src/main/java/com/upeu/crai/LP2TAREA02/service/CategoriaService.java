package com.upeu.crai.LP2TAREA02.service;

import java.util.List;

import com.upeu.crai.LP2TAREA02.entity.Categoria;

public interface CategoriaService {
	Categoria create(Categoria c);
	Categoria update(Categoria c);
	void delete(Long id);
	Categoria read(Long id);
	List<Categoria> readAll();
}
