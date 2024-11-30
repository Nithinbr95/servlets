package com.xworkz.ad_management.repository;

import java.util.List;

import com.xworkz.ad_management.dto.AdAgencydto;
import com.xworkz.ad_management.entity.AdAgencyEntity;

public interface AdAgencyRepository {

	public AdAgencydto save(AdAgencyEntity entity);
	List<AdAgencyEntity>findAll();
	
}
