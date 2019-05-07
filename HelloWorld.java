
package javaapplication4;

import java.awt.Color;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorld extends JFrame implements ActionListener {
    
    private JLabel mensaje;
    private JButton boton;
    private JTextField caja;
    private JTextField cajaB;
    
    public HelloWorld(){
        super();
        configurarVentana();
        crearComponentes();
    }
    
     private void  configurarVentana(){
        this.setTitle("Hello World");
        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
     private void crearComponentes(){
        mensaje = new JLabel();
        mensaje.setText("HELLO WORLD");
        mensaje.setBounds(50, 50, 100, 30);
        mensaje.setForeground(Color.green);
        this.add(mensaje);
        
        caja = new JTextField();
        caja.setBounds(50, 90, 100, 30);
        this.add(caja);
        
        cajaB = new JTextField();
        cajaB.setBounds(150, 90, 100, 30);
        this.add(cajaB);
        
        boton = new JButton();
        boton.setText("SUMA");
        boton.setBounds(50, 120, 100, 30);
        boton.addActionListener(this);
        this.add(boton);
        
        
     }
     
     @Override
     public void actionPerformed(ActionEvent e){
         String resultado = caja.getText();
         String resultado2 = cajaB.getText();
         int valor1 = Integer.parseInt(resultado);
         int valor2 = Integer.parseInt(resultado2);
         int suma  =  valor1 + valor2;
         JOptionPane.showMessageDialog(this,"La suma es:  "+suma);
     }
     
     public static void main(String[] args){
         HelloWorld ventana = new HelloWorld();
         ventana.setVisible(true);
     }
}
