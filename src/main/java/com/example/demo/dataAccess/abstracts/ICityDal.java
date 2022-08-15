package com.example.demo.dataAccess.abstracts;

import java.util.List;

import com.example.demo.entities.concretes.City;


public interface ICityDal {
	List<City> getAll();
	City getById(int id);
	void add(City city);
	void update(City city);
	void delete(City city);
}