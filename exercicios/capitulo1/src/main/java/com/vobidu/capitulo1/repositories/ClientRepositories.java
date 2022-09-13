package com.vobidu.capitulo1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vobidu.capitulo1.entities.Client;

@Repository
public interface ClientRepositories extends JpaRepository<Client, Long> {

}
