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
public class Pregunta {
    private int idpregunta;
    private String pregunta;
    private String tooltip_pregunta;
    private String placeholder;
    private short tipo_respuesta;
    private String opciones;
    private short columnas;
    private short orden;
    private short estado;
    private Procedimiento procedimiento;
    private Pregunta pregunta_padre;

    public Pregunta() {
    }
    
    public Pregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTooltip_pregunta() {
        return tooltip_pregunta;
    }

    public void setTooltip_pregunta(String tooltip_pregunta) {
        this.tooltip_pregunta = tooltip_pregunta;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public short getTipo_respuesta() {
        return tipo_respuesta;
    }

    public void setTipo_respuesta(short tipo_respuesta) {
        this.tipo_respuesta = tipo_respuesta;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public short getColumnas() {
        return columnas;
    }

    public void setColumnas(short columnas) {
        this.columnas = columnas;
    }

    public short getOrden() {
        return orden;
    }

    public void setOrden(short orden) {
        this.orden = orden;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(Procedimiento procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Pregunta getPregunta_padre() {
        return pregunta_padre;
    }

    public void setPregunta_padre(Pregunta pregunta_padre) {
        this.pregunta_padre = pregunta_padre;
    }
    
    
}
