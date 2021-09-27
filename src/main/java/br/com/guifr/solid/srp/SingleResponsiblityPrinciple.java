package br.com.guifr.solid.srp;

import br.com.guifr.solid.srp.codesmells.SRPCodeSmells;
import br.com.guifr.solid.srp.refactors.SRPRefactors;

public class SingleResponsiblityPrinciple {

    public static void main(String[] args) {
        System.out.println("############### CodeSmells ############### ");
        SRPCodeSmells.execute();
        System.out.println("############### CodeSmells ############### ");

        System.out.println("############### Refactored ############### ");
        SRPRefactors.execute();
        System.out.println("############### Refactored ############### ");
    }

}
