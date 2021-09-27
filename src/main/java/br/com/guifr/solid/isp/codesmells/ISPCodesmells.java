package br.com.guifr.solid.isp.codesmells;


public class ISPCodesmells {

    public static void execute() {

        Gaviao gaviao = new Gaviao();
        gaviao.bicar();
        gaviao.voar();

        Pinguim pinguim = new Pinguim();
        pinguim.bicar();
        pinguim.voar();


    }

}
