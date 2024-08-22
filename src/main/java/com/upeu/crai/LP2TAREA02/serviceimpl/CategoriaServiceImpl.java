package com.upeu.crai.LP2TAREA02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.crai.LP2TAREA02.dao.CategoriaDao;
import com.upeu.crai.LP2TAREA02.entity.Categoria;
import com.upeu.crai.LP2TAREA02.service.CategoriaService;
@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	private CategoriaDao categoriaDao;
	@Override
	public Categoria create(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaDao.create(c);
	}

	@Override
	public Categoria update(Categoria c) {
		// TODO Auto-generated method stub
		return categoriaDao.create(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaDao.delete(id);
	}

	@Override
	public Categoria read(Long id) {
		// TODO Auto-generated method stub
		return categoriaDao.read(id);
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaDao.readAll();
	}

}
