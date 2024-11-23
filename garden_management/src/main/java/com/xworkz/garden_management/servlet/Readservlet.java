package com.xworkz.garden_management.servlet;

import java.io.IOException;
import java.util.List;

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
@WebServlet(urlPatterns = "/view")
public class Readservlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Gardenrepo repo = new Gardenrepoimpl();
		Gardenservice service = new Gardenserviceimpl(repo);
		List<Gardendetailsdto> lists = service.read();
		System.out.println(lists);
		req.setAttribute("result", lists);
		try {
			RequestDispatcher dispatch = req.getRequestDispatcher("view.jsp");
			dispatch.forward(req, resp);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
