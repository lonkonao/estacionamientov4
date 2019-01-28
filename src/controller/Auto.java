/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author giovannicaceres
 */
public class Auto {

    //id fechaLlegada operador patente horaLlegada codigo estado horaRetirada total tiempoTotal
    private int id;
    private String fechaLlegada;
    private String operador;
    private String patente;
    private String horaLlegada;
    private int codigo;
    private String estado;
    private String horaRetirada;
    private int total;
    private String tiempoTotal;

    public Auto(int id,String fechaLlegada,String operador,String patente,String horaLlegada,
                int codigo,String estado,String horaRetirada,int total,String tiempoTotal){
        this.id=id;
        this.fechaLlegada=fechaLlegada;
        this.operador=operador;
        this.patente=patente;
        this.horaLlegada=horaLlegada;
        this.codigo=codigo;
        this.estado=estado;
        this.horaRetirada=horaRetirada;
        this.total=total;
        this.tiempoTotal=tiempoTotal;
        

        
    }
}
