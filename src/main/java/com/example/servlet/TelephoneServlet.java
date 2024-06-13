package com.example.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.dao.TelephoneDAO;
import com.example.model.Telephone;

@WebServlet("/telephones")
public class TelephoneServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TelephoneDAO dao = new TelephoneDAO();
        List<Telephone> telephones = dao.getAllTelephones();
        request.setAttribute("telephones", telephones);
        request.getRequestDispatcher("telephones.jsp").forward(request, response);
    }
}
