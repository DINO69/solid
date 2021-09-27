package br.com.guifr.solid.ocp.refactors;

public class Calculadora {

    public double jurosBandeira(Bandeira bandeira){
        return bandeira.getJuros() + 2;
    }

}
