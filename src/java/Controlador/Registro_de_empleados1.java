/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion_BD;
import Conexion.Metodos;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MONSTER
 */
public class Registro_de_empleados1 extends HttpServlet {

    public class Registro_de_empleados extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            try (PrintWriter out = response.getWriter()) {

                Metodos m = new Metodos();
                Conexion_BD bd = new Conexion_BD();
                boolean result = false;

                String Primer_Apellido = request.getParameter("Primer_Apellido");
                String Segundo_Apellido = request.getParameter("Segundo_Apellido");
                String Primer_Nombre = request.getParameter("Primer_Nombre");
                String Otros_nombres = request.getParameter("Otros_nombres");
                String Pais_del_empleado = request.getParameter("Pais_del_empleado");
                String Tipo_de_identificacion = request.getParameter("Tipo_de_identificacion");
                String Numero_de_identificacion = request.getParameter("Numero_de_identificacion");
                String Correo_Electronico = "";
                Correo_Electronico = m.Correo(Pais_del_empleado, Correo_Electronico, Primer_Nombre, Primer_Apellido);
                String Fecha_de_ingreso = request.getParameter("Fecha_de_ingreso");
                String Area = request.getParameter("Area");
                String Estado = "Activo";
                String Fecha_y_hora_de_registro = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

                String temp = null;
                temp = m.Verificaciones(Primer_Apellido);
                temp = m.Verificaciones(Segundo_Apellido) + temp;
                temp = m.Verificaciones(Primer_Nombre) + temp;
                temp = m.Verificaciones2(Numero_de_identificacion) + temp;
                temp = m.Verificaciones3(Fecha_de_ingreso) + temp;

                int number = Integer.parseInt(temp);
                if (number == 0) {
                    out.println("<h1> " + " Registro exitoso" + "</h1>");
                    Modelo.Registro_de_empleados1 r = new Modelo.Registro_de_empleados1(Primer_Apellido, Segundo_Apellido, Primer_Nombre, Otros_nombres, Pais_del_empleado, Tipo_de_identificacion, Numero_de_identificacion, Correo_Electronico, Fecha_de_ingreso, Area, Estado, Fecha_y_hora_de_registro);

                    if (bd.Update(r) == true) {
                        request.getRequestDispatcher("Opcion.jsp").forward(request, response);
                    } else {
                        out.println("<h1> " + " Verifique su informacion" + "</h1>");
                        request.getRequestDispatcher("Registro_de_empleados.jsp").forward(request, response);
                    }

                } else {
                    out.println("<h1> " + " Verifique su informacion" + "</h1>");
                    request.getRequestDispatcher("Registro_de_empleados.jsp").forward(request, response);
                }

            } catch (ParseException ex) {
                Logger.getLogger(Registro_de_empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Registro_de_empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (URISyntaxException ex) {
                Logger.getLogger(Registro_de_empleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registro_de_empleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
