package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TransferPanel extends JPanel{
    JButton buttonTambahTransfer = new JButton("Tambah Transfer");
    public void setElement(){

        buttonTambahTransfer.setBounds(10,10,300,30);
        buttonTambahTransfer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String jmlTransfer = JOptionPane.showInputDialog(null, "Masukkan Jumlah Transfer : ");
                String deskripsi = JOptionPane.showInputDialog(null, "Deskripsi : ");
            }
        });

        add(buttonTambahTransfer);
        setBackground(Color.red);
        setLayout(null);
    }
}
