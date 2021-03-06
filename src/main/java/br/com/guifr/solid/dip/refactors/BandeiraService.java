package br.com.guifr.solid.dip.refactors;

public class BandeiraService {

    private Repositorio repositorio;

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public BandeiraService(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void inserirBandeira(String bandeira){
        repositorio.inserir(bandeira);
    }

}
