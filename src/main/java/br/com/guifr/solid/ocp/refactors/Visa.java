package br.com.guifr.solid.ocp.refactors;

public class Visa implements Bandeira {

    @Override
    public double getJuros() {
        return 0.5;
    }
}
