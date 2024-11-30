package com.xworkz.ad_management.service;



import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.ad_management.dto.AdAgencydto;
import com.xworkz.ad_management.entity.AdAgencyEntity;
import com.xworkz.ad_management.repository.AdAgencyRepository;
import com.xworkz.ad_management.util.AdAgencyUtil;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class AdAgencyServiceImpl implements AdAgencyservice {
	
	private AdAgencyRepository repo;
	@Override
	public String save(AdAgencydto dto) {
		AdAgencyEntity entity = AdAgencyUtil.mapdtotoentity(dto);
		repo.save(entity);
		return "saved";
	}
	@Override
	public List<AdAgencydto> findAll() {
		 List<AdAgencyEntity> entities = repo.findAll();
	        return entities.stream() .map(AdAgencyUtil::mapentitytodto) .collect(Collectors.toList());

	}

}
