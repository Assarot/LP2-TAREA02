package com.upeu.crai.LP2TAREA02.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upeu.crai.LP2TAREA02.dao.LibroDao;
import com.upeu.crai.LP2TAREA02.entity.Libro;
import com.upeu.crai.LP2TAREA02.repository.LibroRepository;
@Component
public class LibroDaoImpl implements LibroDao{
	@Autowired
	private LibroRepository libroRepository;
	@Override
	public Libro create(Libro l) {
		// TODO Auto-generated method stub
		return libroRepository.save(l);
	}

	@Override
	public Libro update(Libro l) {
		// TODO Auto-generated method stub
		return libroRepository.save(l);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		libroRepository.deleteById(id);
	}

	@Override
	public Libro read(Long id) {
		// TODO Auto-generated method stub
		return libroRepository.findById(id).get();
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

}
