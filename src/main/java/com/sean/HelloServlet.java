package com.sean;

import lombok.extern.slf4j.Slf4j;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : sean
 * @version V1.0
 * @Project: simpleFramework
 * @Package ${PACKAGE_NAME}
 * @Description: TODO
 * @date Date : 2021年01月08日 9:36
 */


public class HelloServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name="简易框架";
        request.setAttribute("name",name);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
