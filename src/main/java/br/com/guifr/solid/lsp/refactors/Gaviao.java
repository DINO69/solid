package br.com.guifr.solid.lsp.refactors;

public class Gaviao implements AveVoadora {

    @Override
    public void voar() {
        System.out.println("Gavião voando.");
    }

    @Override
    public void bicar() {
        System.out.println("Gavião bicando");
    }
}
