package br.com.bilac.teoriajogos;

import javax.swing.*;
import java.awt.*;


public class DesenhaPainel extends JPanel {

    public void paintComponent(Graphics g){

        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillOval(10,10,100,100);
        g.setColor(Color.red);
        g.drawOval(10,10,100,100);
    }
}
