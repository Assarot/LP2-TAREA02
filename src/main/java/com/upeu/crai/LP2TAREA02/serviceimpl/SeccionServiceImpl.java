package com.upeu.crai.LP2TAREA02.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upeu.crai.LP2TAREA02.dao.SeccionDao;
import com.upeu.crai.LP2TAREA02.entity.Seccion;
import com.upeu.crai.LP2TAREA02.service.SeccionService;
@Service
public class SeccionServiceImpl implements SeccionService{
	@Autowired
	private SeccionDao seccionDao;
	@Override
	public Seccion create(Seccion s) {
		// TODO Auto-generated method stub
		return seccionDao.create(s);
	}

	@Override
	public Seccion update(Seccion s) {
		// TODO Auto-generated method stub
		return seccionDao.create(s);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		seccionDao.delete(id);
	}

	@Override
	public Seccion read(Long id) {
		// TODO Auto-generated method stub
		return seccionDao.read(id);
	}

	@Override
	public List<Seccion> readAll() {
		// TODO Auto-generated method stub
		return seccionDao.readAll();
	}

}
