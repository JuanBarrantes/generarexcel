/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generarexcel;

/**
 *
 * @author JhanxD
 */
public class Eliminar {
    public static void main(String[] args) {
    String tabla ="respuesta_evaluacion";
    String condicion= "idevaluacion_atendido = 11972 and idpregunta between 22 and 161";
        
            System.out.println("DELETE FROM "+tabla+" WHERE "+condicion);
        
    }
}
