package com.example.main;

import com.example.config.AppConfig;
import com.example.models.Personne;
import com.example.nation.IEuropean;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		// Try with resources Java 7
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			Personne p = context.getBean("personne", Personne.class);
			System.out.println(p);

			IEuropean e = (IEuropean) context.getBean("fr");
			e.sayHello();
			IEuropean a = (IEuropean) context.getBean("en");
			a.sayHello();
		}

		catch (BeansException e) {
			e.printStackTrace();
		}

	}

}
