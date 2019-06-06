/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Date;

/**
 *
 * @author James Carrillo
 */
public class Atendido {

    private long idatendido;
    private String dni;
    private String codigo;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;
    private short tipo_documento;
    private short tipo_atendido;
    private short subtipo_atendido;
    private short sexo;
    private short estado_civil;
    private String celular;
    private java.sql.Date fecha_nacimiento;
    private String email;
    private short estado;
    private short cachimbo;
    private short comensal;
    private String direccion_procedencia;
    private String direccion_actual;
    private short tipo_colegio;
    private short modalidad_ingreso;
    private Atendido atendido_principal;
    private String escuela;

    public Atendido() {
    }

    public Atendido(long idatendido) {
        this.idatendido = idatendido;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    

    public long getIdatendido() {
        return idatendido;
    }

    public void setIdatendido(long idatendido) {
        this.idatendido = idatendido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public short getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(short tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public short getTipo_atendido() {
        return tipo_atendido;
    }

    public void setTipo_atendido(short tipo_atendido) {
        this.tipo_atendido = tipo_atendido;
    }

    public short getSubtipo_atendido() {
        return subtipo_atendido;
    }

    public void setSubtipo_atendido(short subtipo_atendido) {
        this.subtipo_atendido = subtipo_atendido;
    }

    public short getSexo() {
        return sexo;
    }

    public void setSexo(short sexo) {
        this.sexo = sexo;
    }

    public short getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(short estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    public short getCachimbo() {
        return cachimbo;
    }

    public void setCachimbo(short cachimbo) {
        this.cachimbo = cachimbo;
    }

    public short getComensal() {
        return comensal;
    }

    public void setComensal(short comensal) {
        this.comensal = comensal;
    }

    public String getDireccion_procedencia() {
        return direccion_procedencia;
    }

    public void setDireccion_procedencia(String direccion_procedencia) {
        this.direccion_procedencia = direccion_procedencia;
    }

    public String getDireccion_actual() {
        return direccion_actual;
    }

    public void setDireccion_actual(String direccion_actual) {
        this.direccion_actual = direccion_actual;
    }

    public short getTipo_colegio() {
        return tipo_colegio;
    }

    public void setTipo_colegio(short tipo_colegio) {
        this.tipo_colegio = tipo_colegio;
    }

    public short getModalidad_ingreso() {
        return modalidad_ingreso;
    }

    public void setModalidad_ingreso(short modalidad_ingreso) {
        this.modalidad_ingreso = modalidad_ingreso;
    }

    public Atendido getAtendido_principal() {
        return atendido_principal;
    }

    public void setAtendido_principal(Atendido atendido_principal) {
        this.atendido_principal = atendido_principal;
    }
    
}
