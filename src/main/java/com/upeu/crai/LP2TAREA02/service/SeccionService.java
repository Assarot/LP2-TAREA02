package com.upeu.crai.LP2TAREA02.service;

import java.util.List;

import com.upeu.crai.LP2TAREA02.entity.Seccion;

public interface SeccionService {
	Seccion create(Seccion s);
	Seccion update(Seccion s);
	void delete(Long id);
	Seccion read(Long id);
	List<Seccion> readAll();
}
