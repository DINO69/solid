package br.com.guifr.solid.ocp.refactors;

public class Alelo implements Bandeira{

    public int getJurosInmetrics(){
        return 1;
    }

    @Override
    public double getJuros() {
        return getJurosInmetrics();
    }
}
