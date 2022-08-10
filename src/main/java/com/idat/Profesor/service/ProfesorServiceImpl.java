package com.idat.Profesor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Profesor.model.Profesor;
import com.idat.Profesor.repository.ProfesorRepository;



@Service
public class ProfesorServiceImpl implements ProfesorService {

	@Autowired
	private ProfesorRepository porRepo;
	
	@Override
	public void guardarProfesor(Profesor p) {
		porRepo.save(p);
	}

	@Override
	public void actualizarProfesor(Profesor p) {
		porRepo.saveAndFlush(p);
	}

	@Override
	public void eliminarProfesor(Integer idProfesor) {
		porRepo.deleteById(idProfesor);
	}

	@Override
	public List<Profesor> listaProfesores() {
		return porRepo.findAll();
	}

	@Override
	public Profesor obtenerProfesorId(Integer id) {
		return porRepo.findById(id).orElse(null);
	}

}
