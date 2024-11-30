package com.xworkz.ad_management.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ad_management.repository.AdAgencyLoginRepo;
import com.xworkz.ad_management.repository.AdAgencyLoginRepoImpl;
import com.xworkz.ad_management.service.AdAgencyLogin;
import com.xworkz.ad_management.service.AdAgencyLoginImpl;


@WebServlet("/signin")
public class AdAgencyLogServlet extends HttpServlet {

	public AdAgencyLogServlet() {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		AdAgencyLoginRepo repo = new AdAgencyLoginRepoImpl();
		AdAgencyLogin service = new AdAgencyLoginImpl(repo);

		boolean isAuthenticated = service.findByEmailandPassword(email, password);
		
		if (isAuthenticated) {
            request.setAttribute("message", "Login Successful");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signinsuccess.jsp");
            try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            request.setAttribute("error", "Invalid Email or Password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("signinfail.jsp");
            try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

	}

}