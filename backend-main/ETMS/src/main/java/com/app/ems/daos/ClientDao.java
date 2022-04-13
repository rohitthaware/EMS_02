package com.app.ems.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ems.entities.Client;

public interface ClientDao extends JpaRepository<Client, Integer>{

}
