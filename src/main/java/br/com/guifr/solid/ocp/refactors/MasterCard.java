package br.com.guifr.solid.ocp.refactors;

public class MasterCard implements Bandeira {
    @Override
    public double getJuros() {
        return 0.8;
    }
}
