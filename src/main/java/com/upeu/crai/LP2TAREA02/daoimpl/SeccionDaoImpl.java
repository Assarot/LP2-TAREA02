package com.upeu.crai.LP2TAREA02.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upeu.crai.LP2TAREA02.dao.SeccionDao;
import com.upeu.crai.LP2TAREA02.entity.Seccion;
import com.upeu.crai.LP2TAREA02.repository.SeccionRepository;
@Component
public class SeccionDaoImpl implements SeccionDao{
	@Autowired
	private SeccionRepository seccionRepository;
	@Override
	public Seccion create(Seccion s) {
		// TODO Auto-generated method stub
		return seccionRepository.save(s);
	}

	@Override
	public Seccion update(Seccion s) {
		// TODO Auto-generated method stub
		return seccionRepository.save(s);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		seccionRepository.deleteById(id);
	}

	@Override
	public Seccion read(Long id) {
		// TODO Auto-generated method stub
		return seccionRepository.findById(id).get();
	}

	@Override
	public List<Seccion> readAll() {
		// TODO Auto-generated method stub
		return seccionRepository.findAll();
	}

}
