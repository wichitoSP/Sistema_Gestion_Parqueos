package org.example.vistas;

import javax.swing.*;

public class Vehiculo extends JDialog {
    private JPanel Vehiculos;
    private JButton registarbtn;
    private JTable table1;
    private JTextField textplaca;
    private JTextField textipo;
    private JTextField textmarca;
    private JTextField textcolor;


    public void FormularioVehiculo(){

        setTitle("Registro de Vehiculo");
        setSize(400,300);
        //setLayout(new GridLayout(5, 2));

        textplaca = new JTextField();
        textipo = new JTextField();
        textmarca = new JTextField();
        textcolor = new JTextField();

        add(textplaca);
        add(textipo);
        add(textmarca);
        add(textcolor);

        JButton registarbtn = new JButton("Registro Vehiculo");
        registarbtn.addActionListener(e -> registrarEntrada());
        add(registarbtn);


    }

    private void registrarEntrada() {
    }

    public Vehiculo (){
        setContentPane(Vehiculos);
        setModal(true);
        setSize(800,600);
        setLocationRelativeTo(null);
    }



    public static void main(String[] args){
        Vehiculo dialog = new Vehiculo();
        dialog.setVisible(true);
    }

}
