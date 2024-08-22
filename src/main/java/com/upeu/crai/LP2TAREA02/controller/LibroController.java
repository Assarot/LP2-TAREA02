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

import com.upeu.crai.LP2TAREA02.entity.Libro;
import com.upeu.crai.LP2TAREA02.service.LibroService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/libros")
public class LibroController {
	@Autowired
	private LibroService libroService;
	
	@GetMapping
	public ResponseEntity<List<Libro>> readAll(){
		try {
			List<Libro> libros = libroService.readAll();
			if (libros.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(libros, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Libro> createLibro(@Valid @RequestBody Libro lib){
		try {
			Libro l = libroService.create(lib);
			return new ResponseEntity<>(l, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Libro> getLibro(@PathVariable("idlibro")Long id){
		try {
			Libro l = libroService.read(id);
			return new ResponseEntity<>(l, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping
	public ResponseEntity<Libro> delLibro(@PathVariable("idlibro")Long id){
		try {
			libroService.delete(id);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping
	public ResponseEntity<Libro> updateLibro(@PathVariable("idlibro") Long id, @Valid @RequestBody Libro lib){
		Libro l = libroService.update(lib);
		if (l.getIdLibro()>0) {
			return new ResponseEntity<>(libroService.update(l), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
	}
}
