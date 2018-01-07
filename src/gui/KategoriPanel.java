package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import kategori.*;

public class KategoriPanel extends JPanel {
    Kategori kategori;

    public KategoriPanel(Connection conn){
        try {
            this.kategori = new Kategori(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setElement(){
        DefaultListModel model = new DefaultListModel();
        JButton tambahButton = new JButton("Tambah");
        model.addElement("e");
        model.addElement("e");
        model.addElement("e");
        model.addElement("e");

        JList list = new JList(model);
        list.setBounds(10, 0, 350, 600);

        tambahButton.setBounds(250,610,75,30);
        tambahButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DialogInsert();
            }
        });

        add(tambahButton);

        add(list);
        setLayout(null);
    }

    public void DialogInsert(){
        JOptionPane dialog = new JOptionPane();
        String[] tipeKategori = new String[]{"Pemasukan", "Pengeluaran" };
        JTextField nama = new JTextField(15);
        JComboBox tipe = new JComboBox(tipeKategori);
        Object[] inputFields = {"Masukan Nama Kategori", nama,
                "Pilih tipe Kategori", tipe};

        int result = JOptionPane.showConfirmDialog(this, inputFields,
                "Masukan Nama dan Tipe Kategori", JOptionPane.OK_CANCEL_OPTION);

        this.kategori.setKategori(new varKategori(0, nama.getText(),
                "no Icon", tipe.getSelectedItem().toString()));

        try {
            this.kategori.insert();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
