package br.com.guifr.solid.lsp.refactors;

public class Pinguim implements AveNadadora {

    @Override
    public void bicar() {
        System.out.println("Pinguim bicando");
    }

    @Override
    public void nadar() {
        System.out.println("Pinguim nadando");
    }
}
