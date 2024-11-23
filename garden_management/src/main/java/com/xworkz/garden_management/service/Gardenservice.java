package com.xworkz.garden_management.service;

import java.util.List;

import com.xworkz.garden_management.dto.Gardendetailsdto;

public interface Gardenservice {
	
	public String save(Gardendetailsdto dto);
   List<Gardendetailsdto>read();
  String deleteById(int id);
  Gardendetailsdto searchByid(int id);
  String UpdateById(int id,Gardendetailsdto dto);
}
