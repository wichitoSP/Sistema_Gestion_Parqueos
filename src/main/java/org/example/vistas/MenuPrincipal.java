package org.example.vistas;

import javax.swing.*;

public class MenuPrincipal extends JDialog {
    private JPanel Principal;
    private JButton registarButton;
    private JButton entrarButton;

    public void  MenuPrincipal(){
        setContentPane(Principal);
        setModal(true);
        setSize(800,600);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args){
        MenuPrincipal dialog = new MenuPrincipal();
        dialog.setVisible(true);
    }


}
