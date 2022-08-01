<%-- 
    Document   : Registro_de_empleados
    Created on : 31-jul-2022, 10:49:44
    Author     : MONSTER
--%>

<%@page import="Conexion.Metodos"%>
<%@page import="Conexion.Conexion_BD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CIDENET REGISTRO Y CONTROL DE EMPLEADOS</title>
    </head>
    <body background="https://media-exp1.licdn.com/dms/image/D561BAQFpeqtRzcxcxw/company-background_10000/0/1653682170981?e=2147483647&v=beta&t=8o3PBQjOABBoerByEPUvK-76Fm-5BHL7qNNpP1CJQPQ">

    <center>


        <p></p>
        <div  style="color:#FF0000" >CIDENET REGISTRO Y CONTROL DE EMPLEADOS</div>
    </center>


    <%

        Metodos m = new Metodos();
        int i = m.contador;

        Conexion_BD bd = new Conexion_BD();


    %>


    <form action="Registro_de_empleados1" method="post">

        <p><span style="color:#FF0000" >Primer Apellido</span>
            <input class="contact" type="text" name="Primer_Apellido" value= <% bd.findAll().get(i).getPrimer_Apellido();%> /></p>
        <p><span style="color:#FF0000" >Segundo Apellido</span>
            <input class="contact" type="text" name="Segundo_Apellido" value=<%bd.findAll().get(i).getSegundo_Apellido();%> /></p>
        <p><span style="color:#FF0000" >Primer Nombre</span>
            <input class="contact" type="text" name="Primer_Nombre" value=<%bd.findAll().get(i).getPrimer_Nombre();%> /></p>
        <p><span style="color:#FF0000" >Otros nombres</span>
            <input class="contact" type="text" name="Otros_nombres" value=<%bd.findAll().get(i).getOtros_nombres();%> /></p>


        <p><span style="color:#FF0000" >Pais del empleado</span>
            <select name="Pais_del_empleado">
                <option value="Colombia">Colombia</option>
                <option value="Estados Unidos">Estados Unidos</option>

            </select>
        <p><span style="color:#FF0000" >Tipo de identificacion</span>
            <select name="Tipo_de_identificacion">
                <option value="Cedula de ciudadania"> Cédula de Ciudadanía </option>
                <option value="Cédula de Extranjería"> Cédula de Extranjería </option>
                <option value="Pasaporte"> Pasaporte </option>
                <option value="Permiso Especial"> Permiso Especial </option>

            </select>

        <p><span style="color:#FF0000" >Numero de identificacion</span>
            <input class="contact" type="text" name="Numero_de_identificacion" value=<%bd.findAll().get(i).getNumero_de_identificacion();%> /></p>
        <p><span style="color:#FF0000" >Fecha de ingreso</span>
            <input class="contact" type="text" name="Fecha_de_ingreso" value=<%bd.findAll().get(i).getFecha_de_ingreso();%> /></p>


    </select>

    <p><span style="color:#FF0000" >Area</span>
        <select name="Area">
            <option value="Administración"> Administración </option>
            <option value="Financiera"> Financiera </option>
            <option value="Compras"> Compras </option>
            <option value="Infraestructura"> Infraestructura </option>
            <option value="Operación"> Operación </option>
            <option value="Talento Humano"> Talento Humano </option>
            <option value="Servicios Varios"> Servicios Varios </option>             

        </select>


    <center>


        <p></p>

        <button>Registrar de Empleados</button>


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
