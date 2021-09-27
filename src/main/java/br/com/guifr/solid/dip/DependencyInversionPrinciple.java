package br.com.guifr.solid.dip;

import br.com.guifr.solid.dip.refactors.DIPRefactors;
import br.com.guifr.solid.dip.codesmells.DIPCodesmells;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        System.out.println("############### CodeSmells ############### ");
        DIPCodesmells.execute();
        System.out.println("############### CodeSmells ############### ");

        System.out.println("############### Refactored ############### ");
        DIPRefactors.execute();
        System.out.println("############### Refactored ############### ");
    }

}
