package com.example.tp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tp.entities.Livre;
public interface LivreRepository extends JpaRepository <Livre,Long> {

}
