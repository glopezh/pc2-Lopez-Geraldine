package com.cjava.clientes.service;

import com.cjava.clientes.model.entities.Cliente;

import java.util.List;

public interface IClienteService {
	
	public List<Cliente> findAll();

	public Cliente findOne(Long id);

	public void save(Cliente cliente);
	
	public void delete(Long id);
	
}
