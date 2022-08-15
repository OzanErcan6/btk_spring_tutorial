package com.example.demo.business.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dataAccess.abstracts.ICityDal;
import com.example.demo.entities.concretes.City;


@Service // is katmani oldugunu soyler 
// if kontrolleri vs olabilir, is gereksinimlerine gore
public class CityManager implements ICityService{
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		super();
		this.cityDal = cityDal;
	}
	
	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
		this.cityDal.add(city);
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
	}

	@Override
	public City getById(int id) {
		return 	this.cityDal.getById(id);
	}
	
}
