/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generarexcel;

import Metodo.Consulta;
import Modelos.Atendido;
import Modelos.Pregunta;
import Modelos.RespuestaEvalucaion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author JhanxD
 */
public class Prueba {

    private static final Logger LOGGER = Logger.getLogger("newexcel.ExcelOOXML");
    private static final int procedimiento = 8;
    private static final int ciclo = 11;

    public static void main(String[] args) {

        File archivo = new File("C:/Users/JhanxD/Desktop/CUESTIONARIO DE AUTO REPORTAJE PARA ADULTOS (SQR).xlsx");
        // Creamos el libro de trabajo de Excel formato OOXML
        Workbook workbook = new XSSFWorkbook();
        // La hoja donde pondremos los datos
        Sheet pagina = workbook.createSheet("Reporte");
        try {

            ArrayList<Pregunta> titulosbd;
            titulosbd = Consulta.traerPreguntas(Conexion.obtener(),procedimiento);
            String[] titulos = new String[titulosbd.size()+4];
            titulos[0]="APELLIDO PATERNO";
            titulos[1]="APELLIDO MATERNO";
            titulos[2]="NOMBRES";
            titulos[3]="ESCUELA";
            for (int i = 0; i < titulosbd.size(); i++) {
                titulos[i+4] = titulosbd.get(i).getPregunta();
            }
            // Creamos una fila en la hoja en la posicion 0
            Row fila = pagina.createRow(2);
            // Creamos el encabezado
            for (int i = 0; i < titulos.length; i++) {
                Cell celda = fila.createCell(i);
                celda.setCellValue(titulos[i]);
            }

            ArrayList<Atendido> alumnosbd;
            alumnosbd = Consulta.traerAlumnos(Conexion.obtener(),procedimiento, ciclo);
            for (int i = 0; i < alumnosbd.size(); i++) {
                String[] contenido = new String[137];
                ArrayList<RespuestaEvalucaion> respuestasbd;
                respuestasbd = Consulta.traerRespuestas(Conexion.obtener(), (int) alumnosbd.get(i).getIdatendido(),procedimiento);
                contenido[0] = alumnosbd.get(i).getApellido_pat();
                contenido[1] = alumnosbd.get(i).getApellido_mat();
                contenido[2] = alumnosbd.get(i).getNombre();
                contenido[3]= alumnosbd.get(i).getEscuela();
                //LOGGER.info("poscision: "+i+" id: "+(int) alumnosbd.get(i).getIdatendido()+" --->"+respuestasbd.size());
                for (int j = 0; j < respuestasbd.size(); j++) {

                    contenido[j + 4] = respuestasbd.get(j).getRes_texto();
                }
                fila = pagina.createRow(i + 4);
                // Y colocamos los datos en esa fila
                for (int k = 0; k < contenido.length; k++) {
                    // Creamos una celda en esa fila, en la
                    // posicion indicada por el contador del ciclo
                    Cell celda = fila.createCell(k);
                    celda.setCellValue(contenido[k]);
                }
            }

            // Ahora creamos una fila en la posicion 1
            // Ahora guardaremos el archivo
            try {
                // Creamos el flujo de salida de datos,
                // apuntando al archivo donde queremos 
                // almacenar el libro de Excel
                FileOutputStream salida = new FileOutputStream(archivo);

                // Almacenamos el libro de 
                // Excel via ese 
                // flujo de datos
                workbook.write(salida);

                // Cerramos el libro para concluir operaciones
                workbook.close();

                LOGGER.log(Level.INFO, "Archivo creado existosamente en {0}", archivo.getAbsolutePath());

            } catch (FileNotFoundException ex) {
                LOGGER.log(Level.SEVERE, "Archivo no localizable en sistema de archivos");
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, "Error de entrada/salida");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
