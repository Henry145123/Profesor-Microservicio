package com.idat.Profesor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Profesor.model.Profesor;



@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}
