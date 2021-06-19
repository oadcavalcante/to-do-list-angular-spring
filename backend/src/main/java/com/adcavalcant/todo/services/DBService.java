package com.adcavalcant.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adcavalcant.todo.domain.Todo;
import com.adcavalcant.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot e Angular 11",sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Ler", "Ler livro de Java", sdf.parse("27/03/2022"), true);
		Todo t3 = new Todo(null, "Exercício", "Correr", sdf.parse("27/03/2022"), false);
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 20 minutos", sdf.parse("28/03/2022"), true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4));
	}
	
}
