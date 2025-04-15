package org.example.vistas;

import javax.swing.*;

public class MenuPrincipal extends JDialog {
    private JPanel MenuPrincipal;
    private JButton vheiculojbtn;

    public MenuPrincipal(){
        setContentPane(MenuPrincipal);
        setModal(true);
        setSize(800,600);
        setLocationRelativeTo(null);



    }
    public static void main(String[]args){

        MenuPrincipal dialog = new MenuPrincipal();
        dialog.setVisible(true);

        JButton vheiculoButton = new JButton("Vehiculo");
        vheiculoButton.addActionListener(e ->Vehiculo);


    }
}
