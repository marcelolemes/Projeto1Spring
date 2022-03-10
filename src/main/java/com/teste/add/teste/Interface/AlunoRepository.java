package com.teste.add.teste.Interface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.add.teste.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
	