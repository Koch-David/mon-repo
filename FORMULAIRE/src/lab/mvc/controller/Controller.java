package lab.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.mvc.model.Person;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Controller() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String last = request.getParameter("last");
		String first = request.getParameter("first");
		String birth = request.getParameter("birth");
		String sex = request.getParameter("sex");
		
		Person person = new Person(first,last,birth,sex);
		request.setAttribute("users",person);
		
		String[] birth_tab = birth.split("/");
		String birth_year = birth_tab[2];
		int b = Integer.parseInt(birth_year);
		
		if(b < 1990){
			this.getServletContext().getRequestDispatcher("/old.jsp").forward(request, response);
		}
		else{
			this.getServletContext().getRequestDispatcher("/young.jsp").forward(request, response);
		}
		
	}

}