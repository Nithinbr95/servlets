package com.xworkz.garden_management.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.garden_management.repository.Gardenrepo;
import com.xworkz.garden_management.repository.Gardenrepoimpl;
import com.xworkz.garden_management.service.Gardenservice;
import com.xworkz.garden_management.service.Gardenserviceimpl;
@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
	
	Gardenrepo rep = new Gardenrepoimpl();
	Gardenservice service = new Gardenserviceimpl(rep);
	 int id = Integer.parseInt(req.getParameter("id"));
	 System.out.println(id);
	 String ser = service.deleteById(id);
	 req.setAttribute("delete", ser);
	 RequestDispatcher dispacth = req.getRequestDispatcher("view.jsp");
	 try {
		dispacth.forward(req, resp);
	} catch (ServletException | IOException e) {
		System.out.println(e.getMessage());
	}
	}
}
