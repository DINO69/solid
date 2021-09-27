package br.com.guifr.solid.isp.refactors;


public class ISPRefactors {

    public static void execute() {

        Gaviao gaviao = new Gaviao();
        gaviao.bicar();
        gaviao.voar();

        Pinguim pinguim = new Pinguim();
        pinguim.bicar();

    }


}
