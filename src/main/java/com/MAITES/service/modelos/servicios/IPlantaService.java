package com.MAITES.service.modelos.servicios;

import java.util.List;

import com.MAITES.service.modelos.entidades.planta;

public interface IPlantaService {

	public List<planta> findAll();

	public planta findOne(int id);
	
	public List<String> findAllId();
	
}
