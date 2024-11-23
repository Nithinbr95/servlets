package com.xworkz.garden_management.repository;

import java.util.List;

import com.xworkz.garden_management.dto.Gardendetailsdto;

public interface Gardenrepo {
	
   boolean save(Gardendetailsdto dto);
	public List<Gardendetailsdto> read();
	boolean deleteById(int id);
	Gardendetailsdto searchById(int id);
	String updateById(int id, Gardendetailsdto dto);
}
