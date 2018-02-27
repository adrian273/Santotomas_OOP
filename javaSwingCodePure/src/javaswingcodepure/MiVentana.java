/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingcodepure;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author kdr
 */
public class MiVentana  extends JFrame{
    
    public MiVentana() {
        super("Estudian java Swing");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Nombre: ");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Saluda");
        cp.add(etiqueta);
        cp.add(textField);
        cp.add(button);
    }
}
