package com.example.servlet;
import com.example.User;
import com.example.Warehouse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "GetUsersServlet", urlPatterns = "/users")
public class GetUsersServlet {
    void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Set<User> users = Warehouse.getInstance().getUsers();
        request.setAttribute("users", users);
        request.getRequestDispatcher("jsp/users.jsp").forward(request, response);
    }
}
