package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.entities.concretes.City;


public interface ICityService {
	List<City> getAll();
	City getById(int id);
	void add(City city);
	void update(City city);
	void delete(City city);
}
