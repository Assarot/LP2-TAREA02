package com.upeu.crai.LP2TAREA02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upeu.crai.LP2TAREA02.entity.Seccion;
import com.upeu.crai.LP2TAREA02.service.SeccionService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/secciones")
public class SeccionController {
	@Autowired
	private SeccionService seccionService;
	
	@GetMapping
	public ResponseEntity<List<Seccion>> readAll(){
		try {
			List<Seccion> secciones = seccionService.readAll();
			if (secciones.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(secciones, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Seccion> create(@Valid @RequestBody Seccion sec){
		try {
			Seccion s = seccionService.create(sec);
			return new ResponseEntity<>(s,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Seccion> getCategoriaId(@PathVariable("idseccion")Long id){
		try {
			Seccion s = seccionService.read(id);
			return new ResponseEntity<>(s,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping
	public ResponseEntity<Seccion> delSeccion(@PathVariable("idseccion")Long id){
		try {
			seccionService.delete(id);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping
	public ResponseEntity<Seccion> updateSeccion(@PathVariable("idseccion") Long id,  @Valid @RequestBody Seccion sec){
		Seccion s = seccionService.read(id);
		if (s.getIdSeccion()>0) {
			return new ResponseEntity<>(seccionService.update(sec), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
}
