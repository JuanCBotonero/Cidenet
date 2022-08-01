/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MONSTER
 */
public class Consulta_de_empleados1 {
    
    private String Primer_Apellido;
    private String Segundo_Apellido;
    private String Primer_Nombre;
    private String Otros_nombres;
    private String Pais_del_empleado;
    private String Tipo_de_identificacion;
    private String Numero_de_identificacion;
    private String Correo_Electronico;
    private String Fecha_de_ingreso;
    private String Area;
    private String Estado;
    private String Fecha_y_hora_de_registro;

    public Consulta_de_empleados1(String Primer_Apellido, String Segundo_Apellido, String Primer_Nombre, String Otros_nombres, String Pais_del_empleado, String Tipo_de_identificacion, String Numero_de_identificacion, String Correo_Electronico, String Fecha_de_ingreso, String Area, String Estado, String Fecha_y_hora_de_registro) {
        this.Primer_Apellido = Primer_Apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Primer_Nombre = Primer_Nombre;
        this.Otros_nombres = Otros_nombres;
        this.Pais_del_empleado = Pais_del_empleado;
        this.Tipo_de_identificacion = Tipo_de_identificacion;
        this.Numero_de_identificacion = Numero_de_identificacion;
        this.Correo_Electronico = Correo_Electronico;
        this.Fecha_de_ingreso = Fecha_de_ingreso;
        this.Area = Area;
        this.Estado = Estado;
        this.Fecha_y_hora_de_registro = Fecha_y_hora_de_registro;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public String getPrimer_Nombre() {
        return Primer_Nombre;
    }

    public String getOtros_nombres() {
        return Otros_nombres;
    }

    public String getPais_del_empleado() {
        return Pais_del_empleado;
    }

    public String getTipo_de_identificacion() {
        return Tipo_de_identificacion;
    }

    public String getNumero_de_identificacion() {
        return Numero_de_identificacion;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public String getFecha_de_ingreso() {
        return Fecha_de_ingreso;
    }

    public String getArea() {
        return Area;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFecha_y_hora_de_registro() {
        return Fecha_y_hora_de_registro;
    }
    
    
    
    
    
}
