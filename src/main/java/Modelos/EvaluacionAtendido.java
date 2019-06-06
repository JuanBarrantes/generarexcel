/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Timestamp;

/**
 *
 * @author James Carrillo
 */
public class EvaluacionAtendido {
    
    private long idevaluacion_atendido;
    private Atendido atendido;
    private java.sql.Timestamp fecha;
    private Procedimiento procedimiento;

    public EvaluacionAtendido() {
    }

    public EvaluacionAtendido(long idevaluacion_atendido) {
        this.idevaluacion_atendido = idevaluacion_atendido;
    }
    
    public long getIdevaluacion_atendido() {
        return idevaluacion_atendido;
    }

    public void setIdevaluacion_atendido(long idevaluacion_atendido) {
        this.idevaluacion_atendido = idevaluacion_atendido;
    }

    public Atendido getAtendido() {
        return atendido;
    }

    public void setAtendido(Atendido atendido) {
        this.atendido = atendido;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }
    
}
