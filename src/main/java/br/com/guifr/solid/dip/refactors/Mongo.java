package br.com.guifr.solid.dip.refactors;

public class Mongo implements Repositorio {

    @Override
    public void inserir(String texto){
        System.out.printf("Estou inserindo este texto[%s] no banco MONGO.%n",texto);
    }

}
