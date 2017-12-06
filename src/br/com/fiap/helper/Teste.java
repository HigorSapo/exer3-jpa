package br.com.fiap.helper;

import java.util.Date;

import br.com.fiap.config.GenericDao;

import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;

public class Teste {
	
	public static void main(String[] args) {
		
		GenericDao<Clientes> cliDao = new GenericDao<Clientes>(Clientes.class);
		GenericDao<Pedidos> pDao = new GenericDao<Pedidos>(Pedidos.class);
		
		Clientes cli1 = new Clientes();
		cli1.setNome("Higão");
		cli1.setEmail("higao@gmail.com");
		cliDao.adicionar(cli1);
		
		Pedidos p1 = new Pedidos();
		p1.setData(new Date());
		p1.setDescricao("Espingarda 5.5");
		p1.setValor(100.00);
		p1.setClientes(cli1);
		pDao.adicionar(p1);
		
	}

}
