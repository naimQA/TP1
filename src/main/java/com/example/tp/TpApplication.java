package com.example.tp;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.example.tp.entities.Livre;
import com.example.tp.repositories.LivreRepository;


@SpringBootApplication
public class TpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpApplication.class, args);
    }

    @Bean
    CommandLineRunner start(LivreRepository livreRepository) {
        return args -> {
            Livre l1 = Livre.builder()
                    .auteur("Logan")
                    .titre("Apprendre Spring boot")
                    .prix(8000.0)
                    .build();
            livreRepository.save(l1);
            Livre l2 = Livre.builder()
                    .auteur("Link")
                    .titre("Apprendre ORM")
                    .prix(200.0)
                    .build();
            livreRepository.save(l2);
            //List<Livre> livres = LivreRepository.findAll();
            //for(Livre livre:livres)System.out.println(livre.getTitre());
        };
    }
}