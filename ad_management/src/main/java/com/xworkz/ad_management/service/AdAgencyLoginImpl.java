package com.xworkz.ad_management.service;

import com.xworkz.ad_management.entity.AdAgencyEntity;
import com.xworkz.ad_management.repository.AdAgencyLoginRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class AdAgencyLoginImpl implements AdAgencyLogin {
 private AdAgencyLoginRepo repo;
	
	@Override
	public boolean findByEmailandPassword(String email, String password) {
		 AdAgencyEntity entity = repo.findByEmailAndPassword(email, password);
	        return entity != null;
	}

}
