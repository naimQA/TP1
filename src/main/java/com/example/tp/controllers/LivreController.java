package com.example.tp.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.tp.entities.Livre;
import com.example.tp.repositories.LivreRepository;

    @RestController
    public class LivreController {
        @Autowired
        LivreRepository livreRepository;

        @GetMapping("/Livres/{id}")
        public Livre livres(@PathVariable long id) {
            return livreRepository.findById(id).get();
        }




    }