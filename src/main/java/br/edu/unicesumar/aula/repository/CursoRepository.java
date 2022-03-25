package br.edu.unicesumar.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unicesumar.aula.domain.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}