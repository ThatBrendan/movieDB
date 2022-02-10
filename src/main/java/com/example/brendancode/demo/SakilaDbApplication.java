package com.example.brendancode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

	@Autowired
	private CategoryRepository categoryRepository;

	private String save = "save";

	public SakilaDbApplication(LanguageRepository languageRepository,
							   ActorRepository actorRepository,
							   FilmRepository filmRepository,
							   CategoryRepository categoryRepository){
		this.languageRepository = languageRepository;
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.categoryRepository = categoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaDbApplication.class, args);
	}

	//*LANGUAGES*//
	@PostMapping("/newLanguages")
	public @ResponseBody
	String addLanguage(@RequestParam String name){
		Language addLanguage = new Language(name);
		languageRepository.save(addLanguage);
		return save;
	}

	@GetMapping("/Languages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}

	@GetMapping("/GetLanguage/{language_id}")
	public @ResponseBody
	Optional<Language> getLanguageByID(@PathVariable int language_id) {
		return languageRepository.findById(language_id);
	}

	//*LANGUAGES*//

	//*CATEGORY*//
	@PostMapping("/newCategory")
	public @ResponseBody
	String addCategory(@RequestParam String name){
		Category addCategory = new Category(name);
		categoryRepository.save(addCategory);
		return save;
	}

	@GetMapping("/Category")
	public @ResponseBody
	Iterable<Category> getAllCategory(){
		return categoryRepository.findAll();
	}

	@GetMapping("/GetCategory/{category_id}")
	public @ResponseBody
	Optional<Category> getCategoryByID(@PathVariable int category_id){
		return categoryRepository.findById(category_id);
	}

	//*CATEGORY*//

	//*ACTORS*//

	@PostMapping("/newActors")
	public @ResponseBody
	String addActors(@RequestParam String first_name, String last_name){
		Actor addActors = new Actor(first_name, last_name);
		actorRepository.save(addActors);
		return save;
	}

	@GetMapping("/Actors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}


	@GetMapping("/GetActor/{actor_id}")
	public @ResponseBody
	Optional<Actor> getActorByID(@PathVariable int actor_id){
		return actorRepository.findById(actor_id);
	}

	//*ACTORS*//


	//*FILMS*//

	@PostMapping("/newFilms")
	public @ResponseBody
	String addNewFilm(@RequestParam String title, int release_year, String rating, int language_id){
		Film addNewFilm = new Film(title, release_year, rating, language_id);
		filmRepository.save(addNewFilm);
		return save;
	}

	@GetMapping("/Films")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/GetFilm/{film_id}")
	public @ResponseBody
	Optional<Film> getFilmByID(@PathVariable int film_id){
		return filmRepository.findById(film_id);
	}

	//*FILMS*//
}
