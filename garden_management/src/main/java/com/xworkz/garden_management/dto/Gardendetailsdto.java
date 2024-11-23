package com.xworkz.garden_management.dto;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Gardendetailsdto {

	private int id;
	private String name;
	private int space;
	private int plants;
	private String city;
}
