/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

/**
 *
 * @author MONSTER
 */
import Modelo.Registro_de_empleados1;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conexion_BD {

    public boolean insert(Registro_de_empleados1 t) throws SQLException, URISyntaxException, ClassNotFoundException {
        boolean result = false;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://MONSTER-PC\\SQLEXPRESS:1433;" + "databaseName=Cidenet;" + "user = sa;" + "password = BELfo970421.";
        Connection con = DriverManager.getConnection(connectionURL);
        Statement st = con.createStatement();
        Conexion_BD bd = new Conexion_BD();

       // PreparedStatement preparedStmt = null;
        //String query = " insert into Lista_Empleados (Primer_Apellido,Segundo_Apellido,Primer_Nombre,Otros_nombres,Pais_del_empleado,Tipo_de_identificacion,Numero_de_identificacion,Correo_Electronico,Fecha_de_ingreso,Area,Estado,Fecha_y_hora_de_registro) " + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
        //preparedStmt = con.prepareStatement(query);
        PreparedStatement ps = con.prepareStatement("insert into Lista_Empleados (Primer_Apellido,Segundo_Apellido,Primer_Nombre,Otros_nombres,Pais_del_empleado,Tipo_de_identificacion,Numero_de_identificacion,Correo_Electronico,Fecha_de_ingreso,Area,Estado,Fecha_y_hora_de_registro) " + "values (?,?,?,?,?,?,?,?,?,?,?,?)");

        for (int i = 0; i < bd.findAll().size(); i++) {

            if (t.getNumero_de_identificacion() == bd.findAll().get(i).getNumero_de_identificacion()) {
                result = false;
            } else {

                ps.setString(1, t.getPrimer_Apellido());
                ps.setString(2, t.getSegundo_Apellido());
                ps.setString(3, t.getPrimer_Nombre());
                ps.setString(4, t.getOtros_nombres());
                ps.setString(5, t.getPais_del_empleado());
                ps.setString(6, t.getTipo_de_identificacion());
                ps.setString(7, t.getNumero_de_identificacion());
                ps.setString(8, t.getCorreo_Electronico());
                ps.setString(9, t.getFecha_de_ingreso());
                ps.setString(10, t.getArea());
                ps.setString(11, t.getEstado());
                ps.setString(12, t.getFecha_y_hora_de_registro());

   

                result = true;

            }

        }

        return result;
    }

    public boolean Update(Registro_de_empleados1 t) throws SQLException, URISyntaxException, ClassNotFoundException {

        boolean result = false;

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://MONSTER-PC\\SQLEXPRESS:1433;" + "databaseName=Cidenet;" + "user = sa;" + "password = BELfo970421.";
        Connection con = DriverManager.getConnection(connectionURL);
        Statement st = con.createStatement();
        Conexion_BD bd = new Conexion_BD();

//        PreparedStatement preparedStmt = null;
//        String query = " insert into Lista_Empleados (Primer_Apellido,Segundo_Apellido,Primer_Nombre,Otros_nombres,Pais_del_empleado,Tipo_de_identificacion,Numero_de_identificacion,Correo_Electronico,Fecha_de_ingreso,Area,Estado,Fecha_y_hora_de_registro) " + "values (?,?,?,?,?,?,?,?,?,?,?,?)";
//        preparedStmt = con.prepareStatement(query);
        PreparedStatement ps = con.prepareStatement("UPDATE Lista_Empleados SET Primer_Apellido=?,Segundo_Apellido=?,Primer_Nombre=?,Otros_nombres=?,Pais_del_empleado=?,Tipo_de_identificacion=?,Numero_de_identificacion=?,Correo_Electronico=?,Fecha_de_ingreso=?,Area=?,Estado=?,Fecha_y_hora_de_registro=? WHERE Numero_de_identificacion=?) ");

        for (int i = 0; i < bd.findAll().size(); i++) {

            if (t.getNumero_de_identificacion() == bd.findAll().get(i).getNumero_de_identificacion()) {
                result = false;
            } else {

                ps.setString(1, t.getPrimer_Apellido());
                ps.setString(2, t.getSegundo_Apellido());
                ps.setString(3, t.getPrimer_Nombre());
                ps.setString(4, t.getOtros_nombres());
                ps.setString(5, t.getPais_del_empleado());
                ps.setString(6, t.getTipo_de_identificacion());
                ps.setString(7, t.getNumero_de_identificacion());
                ps.setString(8, t.getCorreo_Electronico());
                ps.setString(9, t.getFecha_de_ingreso());
                ps.setString(10, t.getArea());
                ps.setString(11, t.getEstado());
                ps.setString(12, t.getFecha_y_hora_de_registro());

                ps.setString(13, t.getNumero_de_identificacion());

  
                result = true;

            }

        }

        return result;

    }

    public List<Registro_de_empleados1> findAll() throws SQLException, URISyntaxException, ClassNotFoundException {
        List<Registro_de_empleados1> departamentos = null;

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://MONSTER-PC\\SQLEXPRESS:1433;" + "databaseName=Cidenet;" + "user = sa;" + "password = BELfo970421.";
            Connection con = DriverManager.getConnection(connectionURL);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Lista_Empleados");

            String Primer_Apellido = null;
            String Segundo_Apellido = null;
            String Primer_Nombre = null;
            String Otros_nombres = null;
            String Pais_del_empleado = null;
            String Tipo_de_identificacion = null;
            String Numero_de_identificacion = null;
            String Correo_Electronico = null;
            String Fecha_de_ingreso = null;
            String Area = null;
            String Estado = null;
            String Fecha_y_hora_de_registro = null;

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<Registro_de_empleados1>();
                }

                Registro_de_empleados1 registro = new Registro_de_empleados1();

                Primer_Apellido = rs.getString("Primer_Apellido");
                registro.setPrimer_Apellido(Primer_Apellido);

                Segundo_Apellido = rs.getString("Segundo_Apellido");
                registro.setSegundo_Apellido(Segundo_Apellido);

                Primer_Nombre = rs.getString("Primer_Nombre");
                registro.setPrimer_Nombre(Primer_Nombre);

                Otros_nombres = rs.getString("Otros_nombres");
                registro.setOtros_nombres(Otros_nombres);

                Pais_del_empleado = rs.getString("Pais_del_empleado");
                registro.setPais_del_empleado(Pais_del_empleado);

                Tipo_de_identificacion = rs.getString("Tipo_de_identificacion");
                registro.setTipo_de_identificacion(Tipo_de_identificacion);

                Numero_de_identificacion = rs.getString("Numero_de_identificacion");
                registro.setNumero_de_identificacion(Numero_de_identificacion);

                Correo_Electronico = rs.getString("Correo_Electronico");
                registro.setCorreo_Electronico(Correo_Electronico);

                Fecha_de_ingreso = rs.getString("Fecha_de_ingreso");
                registro.setFecha_de_ingreso(Fecha_de_ingreso);

                Area = rs.getString("Area");
                registro.setArea(Area);

                Estado = rs.getString("Estado");
                registro.setEstado(Estado);

                Fecha_y_hora_de_registro = rs.getString("Fecha_y_hora_de_registro");
                registro.setFecha_y_hora_de_registro(Fecha_y_hora_de_registro);

                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }

}
