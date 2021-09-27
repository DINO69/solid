package br.com.guifr.solid.srp.refactors;

import br.com.guifr.solid.srp.codesmells.LoginPage;

public class SRPRefactors {

    public static void execute(){
        br.com.guifr.solid.srp.codesmells.LoginPage loginPage = new LoginPage();

        loginPage.acessar();
        loginPage.logar();

        MenuPage menuPage = new MenuPage();
        menuPage.acessarMenuUsuario();

        UsuarioPage usuarioPage = new UsuarioPage();
        usuarioPage.cadastrarUsuario();
    }

}
