/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Metodos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MONSTER
 */
public class Consulta_de_empleados extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numero = request.getParameter("numero");
        Metodos m = new Metodos();
        String temp = m.contador(numero);

        int numEntero = Integer.parseInt(temp);
        m.contador = numEntero;

        request.getRequestDispatcher("Registro_de_empleados1.jsp").forward(request, response);

    }

}
