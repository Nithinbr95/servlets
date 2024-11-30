package com.xworkz.ad_management.service;

import com.xworkz.ad_management.entity.AdAgencyEntity;

public interface AdAgencyLogin {

	boolean findByEmailandPassword(String email,String password);
}
