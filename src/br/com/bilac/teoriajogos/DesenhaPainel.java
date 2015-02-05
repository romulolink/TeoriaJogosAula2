package br.com.bilac.teoriajogos;

import javax.swing.*;
import java.awt.*;


public class DesenhaPainel extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        int largura = getWidth();
        int altura = getHeight();
        g.drawLine(0,0,largura,altura);
        g.drawLine(0,altura,largura,0);
    }
}
