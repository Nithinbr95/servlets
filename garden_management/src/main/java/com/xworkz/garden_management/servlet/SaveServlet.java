package com.xworkz.garden_management.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.garden_management.dto.Gardendetailsdto;
import com.xworkz.garden_management.repository.Gardenrepo;
import com.xworkz.garden_management.repository.Gardenrepoimpl;
import com.xworkz.garden_management.service.Gardenservice;
import com.xworkz.garden_management.service.Gardenserviceimpl;
@WebServlet(urlPatterns = "/submit")
public class SaveServlet extends HttpServlet {
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  {
		Gardendetailsdto dto = new Gardendetailsdto();
		dto.setName(req.getParameter("name"));
		dto.setSpace(Integer.parseInt(req.getParameter("space")));
		dto.setPlants(Integer.parseInt(req.getParameter("plants")));
		dto.setCity(req.getParameter("city"));
		Gardenrepo rep = new Gardenrepoimpl();
		Gardenservice service = new Gardenserviceimpl(rep);
		String sav = service.save(dto);
		req.setAttribute("sace", sav);
		RequestDispatcher dispatch = req.getRequestDispatcher("success.jsp");
		try {
			dispatch.forward(req, resp);
		}catch(IOException | ServletException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
