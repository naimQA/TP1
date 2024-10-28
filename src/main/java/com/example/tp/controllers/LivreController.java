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
        @PostMapping("/insert")
        public Livre addLivre(@RequestBody Livre livre) {
            Livre l3=new Livre();
            l3.setAuteur(livre.getAuteur());
            l3.setPrix(livre.getPrix());
            l3.setTitre(livre.getTitre());
            livreRepository.save(l3);
            return l3;



    }}