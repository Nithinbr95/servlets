package com.xworkz.ad_management.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ad_management.dto.AdAgencydto;
import com.xworkz.ad_management.repository.AdAgencyRepoImpl;
import com.xworkz.ad_management.repository.AdAgencyRepository;
import com.xworkz.ad_management.service.AdAgencyServiceImpl;
import com.xworkz.ad_management.service.AdAgencyservice;

@WebServlet(urlPatterns = "/submit")
public class AdAgencyServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		AdAgencydto dto = new AdAgencydto();
		dto.setPersonName(req.getParameter("personName"));
		dto.setEmail(req.getParameter("email"));
		dto.setPassword(req.getParameter("password"));
		dto.setContactNumber(req.getParameter("contactNumber"));
		dto.setCompanyName(req.getParameter("companyName"));
		dto.setProductName(req.getParameter("productName"));
		dto.setDescription(req.getParameter("description"));
		
		AdAgencyRepository repo = new AdAgencyRepoImpl();
		AdAgencyservice serv = new AdAgencyServiceImpl(repo);
		String saved = serv.save(dto); 
		req.setAttribute("save",saved );
		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
		try {
			dispatcher.forward(req, resp);
		}catch(ServletException|IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
