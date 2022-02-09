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

	public SakilaDbApplication(LanguageRepository languageRepository){
		this.languageRepository = languageRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaDbApplication.class, args);
	}

	@GetMapping("/AllLanguages")
	public @ResponseBody
	Iterable<Language> getAllLanguages(){
		return languageRepository.findAll();
	}
}
