package com.xworkz.ad_management.repository;

import com.xworkz.ad_management.entity.AdAgencyEntity;

public interface AdAgencyLoginRepo {

	AdAgencyEntity  findByEmailAndPassword(String email,String password);
}
