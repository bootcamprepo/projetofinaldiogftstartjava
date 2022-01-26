package com.luiz.dio.facade;

import cep.subsystem.CepApi;
import external.crm.CRMService;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstance().returnCity(cep);
		String estado = CepApi.getInstance().returnState(cep);
		
		CRMService.saveClient(nome, cep, cidade, estado);
	}
}
