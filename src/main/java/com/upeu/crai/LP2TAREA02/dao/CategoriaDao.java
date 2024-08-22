package com.upeu.crai.LP2TAREA02.dao;

import java.util.List;

import com.upeu.crai.LP2TAREA02.entity.Categoria;

public interface CategoriaDao {
	Categoria create(Categoria C); 
	Categoria update(Categoria C);
	void delete(Long id);
	Categoria read(Long id);
	List<Categoria> readAll();
}
