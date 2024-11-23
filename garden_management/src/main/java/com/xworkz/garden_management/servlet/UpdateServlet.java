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

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		Gardenrepo rep = new Gardenrepoimpl();
		Gardenservice ser = new Gardenserviceimpl(rep);
		int id = Integer.parseInt(req.getParameter("id"));
		Gardendetailsdto dto = ser.searchByid(id);
		req.setAttribute("search", dto);
		RequestDispatcher dispatch = req.getRequestDispatcher("update.jsp");
		try {
			dispatch.forward(req, resp);
		}catch(IOException|ServletException e) {
			System.out.println(e.getMessage());
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  {
	
		Gardendetailsdto dto = new Gardendetailsdto();
	//	dto.setId(Integer.parseInt(req.getParameter("id")));
		dto.setName(req.getParameter("name"));
		dto.setSpace(Integer.parseInt(req.getParameter("space")));
		dto.setPlants(Integer.parseInt(req.getParameter("plants")));
		dto.setCity(req.getParameter("city"));
		
		Gardenrepo repo = new Gardenrepoimpl();
		Gardenservice ser = new Gardenserviceimpl(repo);
		int id = Integer.parseInt(req.getParameter("id"));
		String updateresult = ser.UpdateById(id, dto);
		req.setAttribute("update", updateresult);
		RequestDispatcher dispatch = req.getRequestDispatcher("view.jsp");
		try {
			dispatch.forward(req, resp);
		}catch(IOException|ServletException e) {
			System.out.println(e.getMessage());
		}
	}
}
