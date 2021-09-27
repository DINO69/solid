package br.com.guifr.solid.dip.codesmells;

public class BandeiraServiceOracle {

    private Oracle oracle;

    public BandeiraServiceOracle() {
        this.oracle = new Oracle();
    }

    public void inserirBandeira(String bandeira){
        oracle.inserir(bandeira);
    }

}
