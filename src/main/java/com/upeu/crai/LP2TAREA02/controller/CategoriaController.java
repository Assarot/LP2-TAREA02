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

import com.upeu.crai.LP2TAREA02.entity.Categoria;
import com.upeu.crai.LP2TAREA02.service.CategoriaService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> readAll(){
		try {
			List<Categoria> categorias = categoriaService.readAll();
			if (categorias.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(categorias, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Categoria> create(@Valid @RequestBody Categoria cat){
		try {
			Categoria c = categoriaService.create(cat);
			return new ResponseEntity<>(c,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getCategoriaId(@PathVariable("idcategoria") Long id){
		try {
			Categoria c = categoriaService.read(id);
			return new ResponseEntity<>(c,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Categoria> delCategoria(@PathVariable("idcategoria") Long id){
		try {
			categoriaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Categoria> updateCategoria(@PathVariable("idcategoria") Long id, @Valid @RequestBody Categoria cat){
		
			Categoria c = categoriaService.read(id);
			if (c.getIdCategoria()>0) {
				return new ResponseEntity<>(categoriaService.update(cat), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}
}
