package gui;

import javax.swing.*;
import java.awt.*;

public class RencanaPanel extends JPanel{
    JLabel labelKeranjang=new JLabel("Rencana Belanja");
    JLabel labelNamaItem=new JLabel("Nama Item");
    JLabel labelBiaya=new JLabel("Perkiraan Biaya");

    JTextField txtNamaItem=new JTextField();
    JTextField txtBiaya=new JTextField();
    JButton buttonTambah=new JButton("TAMBAH");

    public void setElement(){
        labelKeranjang.setBounds(10,10,300,20);
        labelKeranjang.setFont(new Font("Times New Roman", Font.BOLD, 25));

        labelNamaItem.setBounds(10,75,300,30);
        labelNamaItem.setFont(new Font("Times New Roman", Font.BOLD, 15));

        labelBiaya.setBounds(10,135,300,30);
        labelBiaya.setFont(new Font("Times New Roman", Font.BOLD, 15));

        txtNamaItem.setBounds(10,100,300,30);
        txtBiaya.setBounds(10,160,300,30);

        buttonTambah.setBounds(10,220,300,30);

        setBackground(Color.red);

        add(labelKeranjang);
        add(labelNamaItem);
        add(labelBiaya);

        add(txtNamaItem);
        add(txtBiaya);
        add(buttonTambah);

        setLayout(null);
    }
}
