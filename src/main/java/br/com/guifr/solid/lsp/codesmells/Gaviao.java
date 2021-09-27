package br.com.guifr.solid.lsp.codesmells;

public class Gaviao implements Ave{
    @Override
    public void voar() {
        System.out.println("Gavião voando.");
    }

    @Override
    public void bicar() {
        System.out.println("Gavião bicando");
    }
}
