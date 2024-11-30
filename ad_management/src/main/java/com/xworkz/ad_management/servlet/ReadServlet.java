package com.xworkz.ad_management.servlet;

import java.io.IOException;
import java.util.List;

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
@WebServlet(urlPatterns = "/view")
public class ReadServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		AdAgencyRepository repo = new AdAgencyRepoImpl();
		AdAgencyservice serv = new AdAgencyServiceImpl(repo);
		List<AdAgencydto>result = serv.findAll();
		req.setAttribute("read", result);
		RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
		try {
			dispatcher.forward(req, resp);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
