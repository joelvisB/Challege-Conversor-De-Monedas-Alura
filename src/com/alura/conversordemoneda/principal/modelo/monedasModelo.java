package com.alura.conversordemoneda.principal.modelo;
public class monedasModelo {

    private String monedaBase;
    private String monedaObjetivo;
    private double tasaDeCambio;

    public monedasModelo(){

    }

    public monedasModelo(String monedaBase, String monedaObjetivo, double tasaDeCambio){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;
        this.tasaDeCambio = tasaDeCambio;
    }

    public monedasModelo(Monedas monedas){
        this.monedaBase = monedas.base_code();
        this.monedaObjetivo = monedas.target_code();
        this.tasaDeCambio = Double.valueOf(monedas.conversion_rate());
    }

    public String getMonedaBase(){
        return monedaBase;
    }

    public String getMonedaObjetivo(){
        return monedaObjetivo;
    }

    public double getTasaDeCambio() {
        return tasaDeCambio;
    }
}
