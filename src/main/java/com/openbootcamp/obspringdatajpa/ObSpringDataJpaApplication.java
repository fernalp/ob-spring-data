package com.openbootcamp.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringDataJpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);
		System.out.println("Find");
		System.out.println("El número de datos en base de datos es: " + repository.count());
		System.out.println("El número de datos en base de datos es: " + repository.count());

		//Crear y almacenar un coche en base de datos

		Coche toyota = new Coche(null,"Toyota","Prius", 2010);
		repository.save(toyota);


		System.out.println("El número de datos en base de datos es: " + repository.count());

		//recuperar todos los coches

		System.out.println(repository.findAll());


	}

}
