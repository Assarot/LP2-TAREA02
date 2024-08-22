package com.upeu.crai.LP2TAREA02.dao;

import java.util.List;

import com.upeu.crai.LP2TAREA02.entity.Seccion;

public interface SeccionDao {
	Seccion create(Seccion s);
	Seccion update(Seccion s);
	void delete(Long id);
	Seccion read(Long id);
	List<Seccion> readAll();
}
