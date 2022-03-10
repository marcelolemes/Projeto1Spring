package com.teste.add.teste.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RestController;

import com.teste.add.teste.Interface.AlunoRepository;
import com.teste.add.teste.Interface.GenericDao;
import com.teste.add.teste.Model.Aluno;

@RestController
public class AlunoDao implements GenericDao<Aluno> {

	private List<Aluno> alunos = new ArrayList<>();

	private static final Logger LOGGER = Logger.getLogger(AlunoDao.class.getName());
	private final AlunoRepository alunoRepository;

	public AlunoDao(AlunoRepository alunoRepository) {
		super();
		this.alunoRepository = alunoRepository;
//		alunos.add(new Aluno("João", LocalDate.parse("2015-02-20")));
//		alunos.add(new Aluno("Lucas ", LocalDate.parse("2000-12-15")));
//		alunos.stream().forEach(e -> create(e));
		getAll().stream().forEach(e -> System.out.println(e.getId()+" "+e.getNome()));

	}

	@Override
	public void create(Aluno aluno) {
		LOGGER.log(Level.INFO, "Salvando ");
		alunoRepository.save(aluno);
		LOGGER.log(Level.INFO, aluno.toString());
	}

	@Override
	public Optional<Aluno> getById(long id) {
		// TODO Auto-generated method stub
		Optional <Aluno> aluno =alunoRepository.findById(id);
		return aluno;   
	};

	@Override
	public List<Aluno> getAll() {	

		return alunoRepository.findAll();

	}

	@Override
	public void update(Integer id, Aluno aluno, String[] params) {
		Aluno antigo;
		antigo = alunoRepository.findById((long)id).get();
		antigo.setNome(aluno.getNome());
		antigo.setDataDeNascimento(aluno.getDataDeNascimento());
		alunoRepository.save(antigo);
		
		

	}

	@Override
	public void delete(Aluno t) {
		alunoRepository.deleteById((long) t.getId());

	}

}
