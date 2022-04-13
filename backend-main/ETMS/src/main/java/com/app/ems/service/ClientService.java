package com.app.ems.service;

import java.util.List;

import com.app.ems.entities.Client;

public interface ClientService {
	Client save(Client client);
	Client update(Client client);
	boolean delete (int client);
	 List<Client> findAll ();
	Client findById(int id);
}
