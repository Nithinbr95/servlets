package com.xworkz.ad_management.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.ad_management.dto.AdAgencydto;
import com.xworkz.ad_management.entity.AdAgencyEntity;

public class AdAgencyUtil {
//	private AdAgencyUtil() {
//		
//	}

	public EntityManager getmanager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return factory.createEntityManager();
	}
	public static AdAgencyEntity mapdtotoentity(AdAgencydto dto) {
		AdAgencyEntity entity = new AdAgencyEntity();
		if(dto!=null) {
		entity.setPersonName(dto.getPersonName());
		entity.setEmail(dto.getEmail());
		entity.setContactNumber(dto.getContactNumber());
		entity.setPassword(dto.getPassword());
		entity.setCompanyName(dto.getCompanyName());
		entity.setProductName(dto.getProductName());
		entity.setDescription(dto.getDescription());
		}
		return entity;
		
	}
	public static AdAgencydto mapentitytodto(AdAgencyEntity entity) {
		AdAgencydto dto = new AdAgencydto();
		if(dto!=null) {
			dto.setId(entity.getId());
		dto.setPersonName(entity.getPersonName());
		dto.setEmail(entity.getEmail());
		dto.setContactNumber(entity.getContactNumber());
		dto.setPassword(entity.getPassword());
		dto.setCompanyName(entity.getCompanyName());
		dto.setProductName(entity.getProductName());
		dto.setDescription(entity.getDescription());
		}
		return dto;
	}
}
