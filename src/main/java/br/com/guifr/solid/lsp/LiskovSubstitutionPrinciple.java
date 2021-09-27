package br.com.guifr.solid.lsp;

import br.com.guifr.solid.lsp.codesmells.LSPCodesmells;
import br.com.guifr.solid.lsp.refactors.LSPRefactors;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        System.out.println("############### CodeSmells ############### ");
        LSPCodesmells.execute();
        System.out.println("############### CodeSmells ############### ");

        System.out.println("############### Refactored ############### ");
        LSPRefactors.execute();
        System.out.println("############### Refactored ############### ");
    }

}
