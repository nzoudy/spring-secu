package com.zoudys;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.zoudys.dao.EtudiantRepository;
import com.zoudys.entities.Etudiant;

@SpringBootApplication
public class SpringSecuApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(SpringSecuApplication.class, args);
		EtudiantRepository etudiantRepository= ctx.getBean(EtudiantRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Nzouda", "Urbain", df.parse("1981-06-12")));
		etudiantRepository.save(new Etudiant("Nzouda", "Priscillia", df.parse("2010-06-06")));
		etudiantRepository.save(new Etudiant("Nzouda", "Sara", df.parse("2014-06-21")));
		etudiantRepository.save(new Etudiant("Nzouda", "MP", df.parse("1984-11-07")));
		
		List<Etudiant> etds = etudiantRepository.findAll();
		etds.forEach(e->System.out.println(e.getNom()));
	}
}
