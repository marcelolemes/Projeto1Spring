package com.teste.add.teste.Interface;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericDao<T>{

	public void create(T t);

	Optional<T> getById(long id);

	List<T> getAll();

	void update(T t, String[] params);

	void delete(T t);
}
