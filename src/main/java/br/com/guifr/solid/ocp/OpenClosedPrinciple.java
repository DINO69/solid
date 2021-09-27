package br.com.guifr.solid.ocp;

import br.com.guifr.solid.ocp.codesmells.OCPCodeSmells;
import br.com.guifr.solid.ocp.refactors.OCPRefactors;
import br.com.inmetrics.solid.ocp.refactors.*;

public class OpenClosedPrinciple {

    public static void main(String[] args) {
        System.out.println("############### CodeSmells ############### ");
        OCPCodeSmells.execute();
        System.out.println("############### CodeSmells ############### ");

        System.out.println("############### Refactored ############### ");
        OCPRefactors.execute();
        System.out.println("############### Refactored ############### ");
    }

}
