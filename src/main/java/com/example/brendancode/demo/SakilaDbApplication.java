package com.example.brendancode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
public class SakilaDbApplication {


	@Autowired
	private LanguageRepository languageRepository;

	@Autowired
	private ActorRepository actorRepository;

	@Autowired
	private FilmRepository filmRepository;

	public SakilaDbApplication(LanguageRepository languageRepository,
							   ActorRepository actorRepository,
							   FilmRepository filmRepository){
		this.languageRepository = languageRepository;
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaDbApplication.class, args);
	}

	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}

	@GetMapping("/AllActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/AllFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}
}
