package br.com.guifr.solid.isp.codesmells;

public class Pinguim implements Ave {

    @Override
    public void voar() {
        System.out.println("Como Pinguim não voa, vou tentar correr rapido.");
    }

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }
}
