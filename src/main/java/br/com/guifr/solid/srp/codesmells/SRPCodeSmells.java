package br.com.guifr.solid.srp.codesmells;

public class SRPCodeSmells {

    public static void execute(){
        LoginPage loginPage = new LoginPage();

        loginPage.acessar();
        loginPage.logar();
        loginPage.acessarMenuUsuario();
        loginPage.cadastrarUsuario();
    }

}
