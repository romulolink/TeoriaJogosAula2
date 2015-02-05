package br.com.bilac.teoriajogos;

import javax.swing.*;
import java.awt.*;


public class DesenhaPainel extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        for (int i = 0; i < 15; i++){
            g.drawLine(10+i*10, 10+i*10, 50+i*10,50+i*10);
            
        }
    }
}
