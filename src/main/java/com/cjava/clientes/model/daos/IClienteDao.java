package com.cjava.clientes.model.daos;


import com.cjava.clientes.model.entities.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long>{


}
