package com.upeu.crai.LP2TAREA02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.crai.LP2TAREA02.dao.LibroDao;
import com.upeu.crai.LP2TAREA02.entity.Libro;
import com.upeu.crai.LP2TAREA02.service.LibroService;
@Service
public class LibroServiceImpl implements LibroService{
	@Autowired
	private LibroDao libroDao;
	@Override
	public Libro create(Libro l) {
		// TODO Auto-generated method stub
		return libroDao.create(l);
	}

	@Override
	public Libro update(Libro l) {
		// TODO Auto-generated method stub
		return libroDao.create(l);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		libroDao.delete(id);
	}

	@Override
	public Libro read(Long id) {
		// TODO Auto-generated method stub
		return libroDao.read(id);
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return libroDao.readAll();
	}
	
}
