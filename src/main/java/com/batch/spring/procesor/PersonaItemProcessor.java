package com.batch.spring.procesor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.batch.spring.model.Persona;

public class PersonaItemProcessor implements ItemProcessor<Persona, Persona> {

	private static final Logger log = LoggerFactory.getLogger(PersonaItemProcessor.class);
	
	@Override
	public Persona process(Persona item) throws Exception {
		String primerNombre = item.getPrimerNombre().toUpperCase();
		String segundoNombre = item.getSegundoNombre().toUpperCase();
		String telefono = item.getTelefono().toUpperCase();
		Persona persona = new Persona(primerNombre, segundoNombre,telefono);
		log.info("Convirtiendo "+(item)+" a "+ persona);
		return persona;
	}

}
