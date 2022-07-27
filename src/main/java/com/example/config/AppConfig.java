package com.example.config;

import org.springframework.context.annotation.Configuration;
import com.example.models.Personne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// @Confiuration permet de déclarer pour spring un composant qui
// ne sert qu"à configurer le contexte de l'application
@Configuration

//permet d’indiquer l’emplacement de beans
@ComponentScan("com.example.nation")
public class AppConfig {

	// Un Bean est un objet qui est instancié,
	// assemblé et gére par Spring Core et sa factory
	@Bean(name = "personne")
	public Personne personne() {
		return new Personne(1, "John");
	}
}
