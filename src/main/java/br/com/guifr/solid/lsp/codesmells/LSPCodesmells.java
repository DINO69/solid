package br.com.guifr.solid.lsp.codesmells;

public class LSPCodesmells {

    public static void execute() {

        Gaviao gaviao = new Gaviao();
        Pinguim pinguim = new Pinguim();

        Ave ave1 = new Gaviao();
        Ave ave2 = new Pinguim();

        pegarComidaArvore(gaviao);
        pegarComidaArvore(pinguim);

        pegarComidaArvore(ave1);
        pegarComidaArvore(ave2);

    }

    public static void pegarComidaArvore(Ave ave) {

        System.out.println("Voando até a arvore");
        ave.voar();

        System.out.println("Bicando o alimento");
        ave.bicar();

    }

}
