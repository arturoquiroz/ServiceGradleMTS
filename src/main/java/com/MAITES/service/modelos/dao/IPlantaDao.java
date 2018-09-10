package com.MAITES.service.modelos.dao;

import java.util.List;

import com.MAITES.service.modelos.entidades.planta;

public interface IPlantaDao {

	public List<planta> findAll();

	public planta findOne(int id);

	public List<String> finAllId();
	
}
