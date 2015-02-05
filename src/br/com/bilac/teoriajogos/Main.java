package br.com.bilac.teoriajogos;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        DesenhaPainel desenho = new DesenhaPainel();
        JFrame aplicacao = new JFrame("Desenhando linhas");
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(desenho);
        aplicacao.setSize(250,250);
        aplicacao.setVisible(true);



    }
}
