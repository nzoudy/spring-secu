package com.zoudys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
