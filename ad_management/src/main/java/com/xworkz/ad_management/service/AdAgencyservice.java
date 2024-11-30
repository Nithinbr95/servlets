package com.xworkz.ad_management.service;

import java.util.List;

import com.xworkz.ad_management.dto.AdAgencydto;
import com.xworkz.ad_management.entity.AdAgencyEntity;

public interface AdAgencyservice {

	public String save(AdAgencydto dto);
	 
	List<AdAgencydto>findAll();
}
