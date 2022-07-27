package com.example.nation;

import org.springframework.stereotype.Component;

// @Component est une annotation au nieavu de la class
// @Bean est une annotation au  niveau de la méthode 
@Component("fr")
public class French implements IEuropean {

	@Override
	public void sayHello() {
		System.out.println("Bonjour");
	}
}