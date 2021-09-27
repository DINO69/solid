package br.com.guifr.solid.isp.codesmells;

public class Galinha implements Ave{

    @Override
    public void voar() {
        System.out.println("PUTO FOI O DESENVOLVEDOR QUE CRIOU ISSO... GALINHA NÃO VOA!!!!");
    }

    @Override
    public void bicar() {
        System.out.println("Galinha bicando");
    }

}
