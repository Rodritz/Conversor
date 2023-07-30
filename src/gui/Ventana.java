package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import logicaMoneda.Function;
import logicaTemperatura.FunctionTemperatura;



public class Ventana extends JFrame implements ActionListener{
	
	Function monedas = new Function();
	FunctionTemperatura temperatura = new FunctionTemperatura();

	public Ventana() {
		setResizable(false);
        setTitle("Bienvenido al Conversor");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout flowLayout = new FlowLayout();
        flowLayout.setHgap(25);
        flowLayout.setVgap(50);
        getContentPane().setLayout(flowLayout);        
        setLocationRelativeTo(null);
        
        getContentPane().setBackground(new Color(0, 191, 255));

        JButton botonOpcion1 = new JButton("Moneda");
        botonOpcion1.setForeground(Color.BLACK);
        botonOpcion1.setFont(new Font("SansSerif", Font.BOLD, 16));
        
        JButton botonOpcion2 = new JButton("Temperatura");  
        botonOpcion2.setForeground(Color.BLACK);
        botonOpcion2.setFont(new Font("SansSerif", Font.BOLD, 16));        
        
        Dimension botonSize = new Dimension(150, 50);
        botonOpcion1.setPreferredSize(botonSize);
        botonOpcion2.setPreferredSize(botonSize);        

        botonOpcion1.addActionListener(this);
        botonOpcion2.addActionListener(this);        

        getContentPane().add(botonOpcion1);
        getContentPane().add(botonOpcion2);       

        setVisible(true);
    }
	
	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Moneda")) {
            abrirVentanaMoneda();
        } else if (e.getActionCommand().equals("Temperatura")) {
            abrirVentanaTemperatura();
        }
    }
	
	private void abrirVentanaMoneda() {
        // Mostrar un cuadro de diálogo de mensaje
        JOptionPane.showMessageDialog(null,"Seleccionaste el Conversor de Moneda", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        // Solicitar entrada del usuario
        String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
        if(ValidarNumero(input) == true) {
            double Minput = Double.parseDouble(input);
            monedas.ConvertirMonedas(Minput);

            int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
            if (JOptionPane.OK_OPTION == respuesta){
            	System.out.println("Selecciona opción Afirmativa");
            }else{
               	JOptionPane.showMessageDialog(null, "Programa terminado");    
               	System.exit(0);
            }

           } else {
               JOptionPane.showMessageDialog(null, "Valor inválido");                
           }
    }

	private void abrirVentanaTemperatura() {        
        // Mostrar un cuadro de diálogo de mensaje
        JOptionPane.showMessageDialog(null, "Seleccionaste el Conversor de Temperatura", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        // Solicitar entrada del usuario
        String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
        if(ValidarNumero(input) == true) {
            double Minput = Double.parseDouble(input);
            temperatura.ConvertirTemperatura(Minput);

            int respuesta = 0;
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
            if((respuesta == 0) && (ValidarNumero(input) == true)) { 
            } else {
                JOptionPane.showMessageDialog(null, "Programa terminado"); 
                System.exit(0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido");                
        }
        
    }
	
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
