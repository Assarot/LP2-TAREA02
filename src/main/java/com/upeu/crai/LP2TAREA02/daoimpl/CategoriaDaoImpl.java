package com.upeu.crai.LP2TAREA02.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upeu.crai.LP2TAREA02.dao.CategoriaDao;
import com.upeu.crai.LP2TAREA02.entity.Categoria;
import com.upeu.crai.LP2TAREA02.repository.CategoriaRepository;
@Component
public class CategoriaDaoImpl implements CategoriaDao{
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Override
	public Categoria create(Categoria C) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(C);
	}

	@Override
	public Categoria update(Categoria C) {
		// TODO Auto-generated method stub
		return categoriaRepository.save(C);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	public Categoria read(Long id) {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id).get();
	}

	@Override
	public List<Categoria> readAll() {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

}
