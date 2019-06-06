/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author James Carrillo
 */
public class Procedimiento {

    private int idprocedimiento;
    private String descripcion;
    private short tipo;
    private short tipo2;
    private String comentario;
    private String respuesta;
    private short opcion;

    public Procedimiento() {
    }

    public Procedimiento(int idprocedimiento) {
        this.idprocedimiento = idprocedimiento;
    }

    public Procedimiento(String descripcion) {
        this.descripcion = descripcion;
    }

    public Procedimiento(int idprocedimiento, String descripcion) {
        this.idprocedimiento = idprocedimiento;
        this.descripcion = descripcion;
    }
    
    public int getIdprocedimiento() {
        return idprocedimiento;
    }

    public void setIdprocedimiento(int idprocedimiento) {
        this.idprocedimiento = idprocedimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public short getTipo2() {
        return tipo2;
    }

    public void setTipo2(short tipo2) {
        this.tipo2 = tipo2;
    }
    
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public short getOpcion() {
        return opcion;
    }

    public void setOpcion(short opcion) {
        this.opcion = opcion;
    }
    
    @Override
    public String toString() {
        return this.descripcion;
    }

}
