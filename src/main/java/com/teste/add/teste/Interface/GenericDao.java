package com.teste.add.teste.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.add.teste.Model.Aluno;

public interface GenericDao<T>{

	public void create(T t);

	Optional<T> getById(long id);

	List<T> getAll();

	void update(Integer i, T t, String[] params);

	void delete(T t);

	void update(Integer id, Aluno aluno, String[] params);
}
