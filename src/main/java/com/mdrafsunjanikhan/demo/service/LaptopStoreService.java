package com.mdrafsunjanikhan.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mdrafsunjanikhan.demo.models.Laptop;

@Service
public class LaptopStoreService {

	List<Laptop> laptops = new ArrayList<>(Arrays.asList(
			new Laptop("p101", "Thinkpad", "Lenovo"),
			new Laptop("p102", "Probook", "HP"),
			new Laptop("p103", "M1", "Macbook")
			));
	
	public List<Laptop> getAlllaptops(){
		return laptops;
	}
	
	public List<Laptop> getLaptopById(String id) {
		return laptops.stream().filter(laptop->{
			return laptop.getId().equals(id);
		}).collect(Collectors.toList());
	}

	public List<Laptop> addLaptop(Laptop laptop) {
		laptops.add(laptop);
		return laptops;
		
	}

	public List<Laptop> updateLaptop(String id, Laptop laptop) {
		//System.out.println("Asi");
		for(Laptop l: laptops) {
			if(id.equals(l.getId())) {
				l.setModel_name(laptop.getModel_name());
				l.setBrand_name(laptop.getBrand_name());
			}
		}
		return laptops;
		
	}

	public List<Laptop> deleteLaptop(String id) {
		laptops.removeIf(laptop -> id.equals(laptop.getId()));
		return laptops;
		
	}
}

