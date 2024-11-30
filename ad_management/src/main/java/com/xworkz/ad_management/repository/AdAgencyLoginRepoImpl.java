package com.xworkz.ad_management.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xworkz.ad_management.entity.AdAgencyEntity;
import com.xworkz.ad_management.util.AdAgencyUtil;

public class AdAgencyLoginRepoImpl implements AdAgencyLoginRepo{
AdAgencyUtil util = new AdAgencyUtil();
	@Override
	public AdAgencyEntity findByEmailAndPassword(String email, String password) {
		EntityManager manager = util.getmanager();
		TypedQuery<AdAgencyEntity> query = manager.createNamedQuery("authentication", AdAgencyEntity.class);
		query.setParameter("email", email);
		query.setParameter("password", password);

		try {
			return query.getSingleResult();
		} catch (Exception e) {
			return new AdAgencyEntity();
		}
	
	}
	}


