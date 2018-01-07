package gui;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import javax.swing.*;
import config.Koneksi;

public class FrameInti extends JFrame{
    JPanel panelMenu=new JPanel();
    JButton buttonBeranda= new JButton("Beranda");
    JButton transferButton = new JButton("Transfer Akun");
    JButton rencanaButton = new JButton("Rencana Belanja");
    JButton akunButton = new JButton("akun");
    JButton KategoriButton = new JButton("Kategori");
    JButton historyButton = new JButton("Histori Transaksi");
    JButton laporanButton = new JButton("Laporan Keuangan");

    BerandaPanel beranda;
    TransferPanel transfer;
    RencanaPanel rencana;
    AkunPanel akun;
    KategoriPanel kategori;
    HistoryPanel histori;
    LaporanPanel laporan;

    public FrameInti(Connection conn){
        this.beranda = new BerandaPanel();
        this.transfer = new TransferPanel();
        this.rencana = new RencanaPanel();
        this.akun = new AkunPanel();
        this.kategori = new KategoriPanel(conn);
        this.histori = new HistoryPanel();
        this.laporan = new LaporanPanel();
    }

    public void setProgram(){

        panelMenu.setBounds(10,10,250,645);
        panelMenu.setBackground(Color.YELLOW);
        panelMenu.setLayout(null);

        buttonBeranda.setBounds(0,15,250,75);
        transferButton.setBounds(0,105,250,75);
        rencanaButton.setBounds(0, 195, 250, 75);
        akunButton.setBounds(0, 285, 250, 75);
        KategoriButton.setBounds(0, 375, 250, 75);
        historyButton.setBounds(0, 465, 250, 75);
        laporanButton.setBounds(0, 555, 250, 75);

        buttonBeranda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beranda.setVisible(true);
                transfer.setVisible(false);
                rencana.setVisible(false);
                akun.setVisible(false);
                kategori.setVisible(false);
                histori.setVisible(false);
                laporan.setVisible(false);
                revalidate();
            }
        });
        transferButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                beranda.setVisible(false);
                transfer.setVisible(true);
                rencana.setVisible(false);
                akun.setVisible(false);
                kategori.setVisible(false);
                histori.setVisible(false);
                laporan.setVisible(false);
                revalidate();
            }
        });
        rencanaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beranda.setVisible(false);
                transfer.setVisible(false);
                rencana.setVisible(true);
                akun.setVisible(false);
                kategori.setVisible(false);
                histori.setVisible(false);
                laporan.setVisible(false);
                revalidate();
            }
        });
        akunButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beranda.setVisible(false);
                transfer.setVisible(false);
                rencana.setVisible(false);
                akun.setVisible(true);
                kategori.setVisible(false);
                histori.setVisible(false);
                laporan.setVisible(false);
                revalidate();
            }
        });
        KategoriButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beranda.setVisible(false);
                transfer.setVisible(false);
                rencana.setVisible(false);
                akun.setVisible(false);
                kategori.setVisible(true);
                histori.setVisible(false);
                laporan.setVisible(false);
                revalidate();
            }
        });
        historyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beranda.setVisible(false);
                transfer.setVisible(false);
                rencana.setVisible(false);
                akun.setVisible(false);
                kategori.setVisible(false);
                histori.setVisible(true);
                laporan.setVisible(false);
                revalidate();
            }
        });
        laporanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                beranda.setVisible(false);
                transfer.setVisible(false);
                rencana.setVisible(false);
                akun.setVisible(false);
                kategori.setVisible(false);
                histori.setVisible(false);
                laporan.setVisible(true);
                revalidate();
            }
        });

        beranda.setElement();
        transfer.setElement();
        rencana.setElement();
        akun.setElement();
        kategori.setElement();
        histori.setElement();
        laporan.setElement();

        beranda.setBounds(280, 10, 600, 645);
        transfer.setBounds(280, 10, 600, 645);
        rencana.setBounds(280, 10, 600, 645);
        akun.setBounds(280, 10, 600, 645);
        kategori.setBounds(280, 10, 600, 645);
        histori.setBounds(280, 10, 600, 645);
        laporan.setBounds(280, 10, 600, 645);

        panelMenu.add(buttonBeranda);
        panelMenu.add(transferButton);
        panelMenu.add(rencanaButton);
        panelMenu.add(akunButton);
        panelMenu.add(KategoriButton);
        panelMenu.add(historyButton);
        panelMenu.add(laporanButton);

        add(panelMenu);
        add(beranda);
        add(transfer);
        add(rencana);
        add(akun);
        add(kategori);
        add(histori);
        add(laporan);

        beranda.setVisible(true);
        transfer.setVisible(false);
        rencana.setVisible(false);
        akun.setVisible(false);
        kategori.setVisible(false);
        histori.setVisible(false);
        laporan.setVisible(false);

        setSize(1000, 700);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
