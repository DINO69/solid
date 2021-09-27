package br.com.guifr.solid.isp;

import br.com.guifr.solid.isp.codesmells.ISPCodesmells;
import br.com.guifr.solid.isp.refactors.ISPRefactors;

public class InterfaceSegregationPrinciple {

    public static void main(String[] args) {
        System.out.println("############### CodeSmells ############### ");
        ISPCodesmells.execute();
        System.out.println("############### CodeSmells ############### ");

        System.out.println("############### Refactored ############### ");
        ISPRefactors.execute();
        System.out.println("############### Refactored ############### ");
    }

}
