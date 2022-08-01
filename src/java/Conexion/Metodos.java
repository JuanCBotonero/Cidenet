/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author MONSTER
 */
public class Metodos {

    public int contador = 0;

    public boolean contieneSoloLetras(String cadena) {

        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;

    }

    public String Verificaciones(String Validacion) {
        int temp = 0;
        if (temp == 0) {
            for (int x = 0; x < Validacion.length(); x++) {
                char c = Validacion.charAt(x);
                // Si no está entre a y z, ni entre A y Z, ni es un espacio
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                    temp++;
                }
            }
        }

        if (temp == 0) {
            if (Validacion.length() > 20) {
                System.out.println("validacion de mayor de 20");
                temp++;

            }

        }

        if (temp == 0) {
            for (int i = 0; i < Validacion.length(); i++) {
                char c = Validacion.charAt(i);
                if (c == 'ñ') {
                    temp++;
                    System.out.println("validacion de ñ");
                }
                if (c == 'Ñ') {
                    temp++;
                    System.out.println("validacion de Ñ");
                }

            }

        }

        Validacion = Integer.toString(temp);
        return Validacion;

    }

    public String Verificaciones1(String Validacion) {
        int temp = 0;
        if (temp == 0) {
            for (int x = 0; x < Validacion.length(); x++) {
                char c = Validacion.charAt(x);
                // Si no está entre a y z, ni entre A y Z, ni es un espacio
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                    temp++;
                }
            }

        }

        if (temp == 0) {
            if (Validacion.length() > 50) {
                System.out.println("validacion de mayor de 20");
                temp++;
            }
        }

        if (temp == 0) {
            for (int i = 0; i < Validacion.length(); i++) {
                char c = Validacion.charAt(i);
                if (c == 'ñ') {
                    temp++;
                    System.out.println("validacion de ñ");
                }
                if (c == 'Ñ') {
                    temp++;
                    System.out.println("validacion de Ñ");
                }
            }
        }
        Validacion = Integer.toString(temp);
        return Validacion;
    }

    public String Verificaciones2(String Validacion) {
        int temp = 0;
        if (temp == 0) {
            if (Validacion.length() > 20) {
                System.out.println("validacion de mayor de 20");
                temp++;
            }
        }
        Validacion = Integer.toString(temp);
        return Validacion;

    }

    public String Verificaciones3(String Validacion) throws ParseException {

        int temp = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dia_actual = LocalDate.now();
        LocalDate fecha1 = LocalDate.parse(Validacion, formatter);
        if (fecha1.isEqual(dia_actual)) {
            //System.out.println("calidacion 1 es igual a fecha2");
        } else if (fecha1.isAfter(dia_actual)) {
            //System.out.println("calidacion 1 es mayor a fecha2");
            temp++;
        } else if (fecha1.isBefore(dia_actual)) {
            //System.out.println("validacion 1 es menor a fecha2");
        }
        Validacion = Integer.toString(temp);
        return Validacion;

    }

    public String Correo(String Pais_del_empleado, String Correo_Electronico, String Primer_Nombre, String Segundo_Apellido) {
        Segundo_Apellido = Segundo_Apellido.replace(" ", "");
        if ("Colombia".equals(Pais_del_empleado)) {
            Correo_Electronico = Primer_Nombre + "." + Segundo_Apellido + "@cidenet.com.co";
        } else {
            Correo_Electronico = Primer_Nombre + "." + Segundo_Apellido + "@cidenet.com.us";
        }
        return Correo_Electronico;

    }

    public String Eliminar_Espacios(String P) {
        String Temp = "";
        Temp = P.replace(" ", "");
        return Temp;

    }

    public String contador(String contador) {

        int temp = Integer.parseInt(contador);
        temp--;
        String numCadena = Integer.toString(temp);
        return numCadena;

    }

}
