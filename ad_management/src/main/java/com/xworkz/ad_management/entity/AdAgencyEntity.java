package com.xworkz.ad_management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
//@Table(name="ad_agency")
@NamedQuery(name = "findAll",query = "select x from AdAgencyEntity x")
@NamedQuery(name = "authentication", query = "SELECT e FROM AdAgencyEntity e WHERE e.email=:email AND e.password=:password")
public class AdAgencyEntity {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "personName")
	private String personName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "productName")
	private String productName;
	@Column(name = "contactNumber")
	private String contactNumber;
	@Column(name = "description")
	private String description;
}
