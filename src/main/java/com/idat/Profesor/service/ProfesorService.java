package com.idat.Profesor.service;

import java.util.List;

import com.idat.Profesor.model.Profesor;


public interface ProfesorService {

	void guardarProfesor(Profesor p);
	void actualizarProfesor(Profesor p);
	void eliminarProfesor(Integer idProfesor);
	List<Profesor> listaProfesores();
	Profesor obtenerProfesorId(Integer id);
}
