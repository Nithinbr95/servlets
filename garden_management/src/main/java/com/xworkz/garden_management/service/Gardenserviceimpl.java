package com.xworkz.garden_management.service;



import java.util.List;


import com.xworkz.garden_management.dto.Gardendetailsdto;
import com.xworkz.garden_management.repository.Gardenrepo;


import lombok.AllArgsConstructor;
@AllArgsConstructor
public class Gardenserviceimpl implements Gardenservice {
 private Gardenrepo repo;
	@Override
	public List<Gardendetailsdto> read() {
		
		
		return repo.read();
	}
	@Override
	public String save(Gardendetailsdto dto) {
		if(dto!=null) {
			if(repo.save(dto)) {
				System.out.println("Not saved");
			}
		}
		return "Saved";

}
	@Override
	public String deleteById(int id) {
		if(repo.deleteById(id)) {
			System.out.println("Deleted Successfully");
		}
		return "Not Deleted";
	}
	@Override
	public Gardendetailsdto searchByid(int id) {
		
		return repo.searchById(id);
	}
	@Override
	public String UpdateById(int id, Gardendetailsdto dto) {
		return "Update"+repo.updateById(id,dto);
	}
}
