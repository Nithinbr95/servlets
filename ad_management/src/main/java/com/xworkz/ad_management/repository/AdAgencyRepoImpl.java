package com.xworkz.ad_management.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xworkz.ad_management.dto.AdAgencydto;
import com.xworkz.ad_management.entity.AdAgencyEntity;
import com.xworkz.ad_management.util.AdAgencyUtil;


public class AdAgencyRepoImpl implements AdAgencyRepository{
AdAgencyUtil util = new AdAgencyUtil();

	@Override
	public AdAgencydto save(AdAgencyEntity entity) {
		EntityManager manager = util.getmanager();
	    manager.getTransaction().begin();
	    manager.persist(entity);
	    manager.getTransaction().commit();
	    manager.close();
		return new AdAgencydto();
	}

	@Override
	public List<AdAgencyEntity> findAll() {
		EntityManager manager = util.getmanager();
		TypedQuery<AdAgencyEntity>query = manager.createNamedQuery("findAll", AdAgencyEntity.class);
		return query.getResultList();
	}

}
