/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author JhanxD
 */
public class RespuestaEvalucaion {
    private int idrespuesta_evaluacion;
    private EvaluacionAtendido evaluacion_atendido;
    private Pregunta pregunta;
    private String res_texto;
    private short res_sino;
    private String res_select;

    public EvaluacionAtendido getEvaluacion_atendido() {
        return evaluacion_atendido;
    }

    public int getIdrespuesta_evaluacion() {
        return idrespuesta_evaluacion;
    }

    public void setIdrespuesta_evaluacion(int idrespuesta_evaluacion) {
        this.idrespuesta_evaluacion = idrespuesta_evaluacion;
    }

    
    public void setEvaluacion_atendido(EvaluacionAtendido evaluacion_atendido) {
        this.evaluacion_atendido = evaluacion_atendido;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public String getRes_texto() {
        return res_texto;
    }

    public void setRes_texto(String res_texto) {
        this.res_texto = res_texto;
    }

    public short getRes_sino() {
        return res_sino;
    }

    public void setRes_sino(short res_sino) {
        this.res_sino = res_sino;
    }

    public String getRes_select() {
        return res_select;
    }

    public void setRes_select(String res_select) {
        this.res_select = res_select;
    }
}
