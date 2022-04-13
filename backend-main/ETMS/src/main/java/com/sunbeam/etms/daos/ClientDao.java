package com.sunbeam.etms.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.etms.entities.Client;

public interface ClientDao extends JpaRepository<Client, Integer>{

}
