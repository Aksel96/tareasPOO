package org.example.IU;

import org.example.IU.eventos.EventosRaton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends Frame {
    private Label lblnombre;
    private TextField txtnombre;
    private Button btnBoton1;

    public Principal(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        this.setLayout(new FlowLayout());
        lblnombre = new Label("Nombre");
        this.add(lblnombre);
        txtnombre = new TextField(30);
        this.add(txtnombre);
        btnBoton1 = new Button("Saludar");
        //btnBoton1.addMouseListener(new EventosRaton());
        btnBoton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(txtnombre.getText());
                JOptionPane.showMessageDialog(null,"Hola " + txtnombre.getText());
            }
        });
        this.add(btnBoton1);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

}
