package br.com.bilac.teoriajogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Work on 05/02/2015.
 */
public class Paleta extends JFrame {

    private JButton mudarCorBotao;
    private Color cor = Color.LIGHT_GRAY;
    private JPanel corJPanel;

    public Paleta(){
        super("Usando Uma Paleta de Cores");
        corJPanel = new JPanel();
        corJPanel.setBackground(cor);
        mudarCorBotao = new JButton("Mudar Cor");
        mudarCorBotao.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cor = JColorChooser.showDialog(

                                Paleta.this, "Escolha uma cor", cor);
                        if (cor == null)
                            cor = Color.LIGHT_GRAY;
                        corJPanel.setBackground(cor);

                    }
                }

        );
        add(corJPanel,BorderLayout.CENTER);
        add(mudarCorBotao,BorderLayout.SOUTH);
        setSize(400,130);
        setVisible(true);
    }
}
