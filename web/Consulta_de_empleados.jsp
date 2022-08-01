<%-- 
    Document   : Consulta_de_empleados
    Created on : 31-jul-2022, 10:50:17
    Author     : MONSTER
--%>

<%@page import="Conexion.Conexion_BD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CIDENET REGISTRO Y CONTROL DE EMPLEADOS</title>
    </head>
    <body background="https://img.freepik.com/vector-gratis/fondo-abstracto-blanco_23-2148833155.jpg?w=2000">

        <form action="Consulta_de_empleados" method="post">
            <center>


                <p></p>
                <div  style="color:#FF0000" >CIDENET REGISTRO Y CONTROL DE EMPLEADOS</div>
                <p></p>


                <%

                    Conexion_BD bd = new Conexion_BD();
                    int con = 1;
                    for (int i = 0; i < bd.findAll().size(); i++) {

                        out.println("<h9 > " + "Numero: " + con + " " + bd.findAll().get(i).getPrimer_Apellido() + " " + bd.findAll().get(i).getSegundo_Apellido() + " " + bd.findAll().get(i).getPrimer_Nombre() + " " + bd.findAll().get(i).getOtros_nombres() + " " + bd.findAll().get(i).getPais_del_empleado() + " " + bd.findAll().get(i).getTipo_de_identificacion()
                                + " " + bd.findAll().get(i).getNumero_de_identificacion()
                                + " " + bd.findAll().get(i).getCorreo_Electronico()
                                + " " + bd.findAll().get(i).getFecha_de_ingreso()
                                + " " + bd.findAll().get(i).getArea()
                                + " " + bd.findAll().get(i).getEstado()
                                + " " + bd.findAll().get(i).getFecha_y_hora_de_registro()
                                + "</h9>");

                        out.println("<h4>" + "-----------------------------------------------" + "</h4>");
                        con++;

                    }


                %>

                <p></p>

                <p><span style="color:#FF0000" >Digite el numero del empleado a editar</span>
                    <input class="contact" type="text" name="numero" value="" /></p>

                <button>Modificar de Empleados</button>


                <p></p>
                <p></p>
                <p></p>



            </center>
        </form>
    <center>

        <a href="Opcion.jsp">
            <button>Regresar</button>
        </a> 
    </center>

</body>
</html>
