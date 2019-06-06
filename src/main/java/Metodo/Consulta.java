/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodo;

import Modelos.Atendido;
import Modelos.EvaluacionAtendido;
import Modelos.Pregunta;
import Modelos.RespuestaEvalucaion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JhanxD
 */
public class Consulta {

    //PARA LAS PREGUNTAS
    public static ArrayList<Pregunta> traerPreguntas(Connection conexion, int procedimento) throws SQLException {
        ArrayList<Pregunta> lista = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement("select * from pregunta where IDPROCEDIMIENTO = ?");
            consulta.setInt(1, procedimento);
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Pregunta obj = new Pregunta();
                obj.setIdpregunta(rs.getShort("IDPREGUNTA"));
                obj.setPregunta(rs.getString("PREGUNTA"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return lista;
    }

    //para los alumnos
    public static ArrayList<Atendido> traerAlumnos(Connection conexion, int procedimento, int ciclo) throws SQLException {
        ArrayList<Atendido> lista = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement("select a.idatendido, a.APELLIDO_PAT, "
                    + "a.APELLIDO_MAT, a.NOMBRE, a.idescuela, e.nombre as ESCUELA from evaluacion_atendido b inner join "
                    + "atendido a on a.idatendido = b.IDATENDIDO inner join escuela e on a.IDESCUELA = e.IDESCUELA where IDPROCEDIMIENTO = ? AND a.IDCICLO_ACADEMICO_INGRESO = ? order "
                    + "by a.APELLIDO_PAT, a.APELLIDO_MAT, a.NOMBRE asc ");
            consulta.setInt(1, procedimento);
            consulta.setInt(2, ciclo);
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Atendido obj = new Atendido();
                obj.setIdatendido(rs.getShort("IDATENDIDO"));
                obj.setNombre(rs.getString("NOMBRE"));
                obj.setApellido_pat(rs.getString("APELlIDO_PAT"));
                obj.setApellido_mat(rs.getString("APELLIDO_MAT"));
                obj.setEscuela(rs.getString("ESCUELA"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return lista;
    }

    //PARA LAS RESPUESTAS
    public static ArrayList<RespuestaEvalucaion> traerRespuestas(Connection conexion, int idEvaluacion, int procedimento) throws SQLException {
        ArrayList<RespuestaEvalucaion> lista = new ArrayList<>();
        try {
            PreparedStatement consulta = conexion.prepareStatement("select IDEVALUACION_ATENDIDO from evaluacion_atendido where IDATENDIDO=? and IDPROCEDIMIENTO = ?");
            consulta.setInt(1, idEvaluacion);
            consulta.setInt(2, procedimento);
            ResultSet rs = consulta.executeQuery();
            int id = 0;
            while (rs.next()) {
                id = rs.getInt("IDEVALUACION_ATENDIDO");
                PreparedStatement consulta2 = conexion.prepareStatement("select * from respuesta_evaluacion where IDEVALUACION_ATENDIDO = ?");
                consulta2.setInt(1, id);
                ResultSet rs2 = consulta2.executeQuery();
                while (rs2.next()) {
                    RespuestaEvalucaion obj = new RespuestaEvalucaion();
                    //obj.setIdrespuesta_evaluacion(rs2.getShort("IDRESPUESTA_EVALUACION"));
                    obj.setEvaluacion_atendido(new EvaluacionAtendido(rs2.getShort("IDEVALUACION_ATENDIDO")));
                    obj.setPregunta(new Pregunta(rs2.getShort("IDPREGUNTA")));
                    obj.setRes_texto(rs2.getString("RES_TEXTO"));
                    lista.add(obj);
                }
            }

        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
        return lista;
    }
}
