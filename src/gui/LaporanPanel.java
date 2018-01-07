package gui;

import javax.swing.*;

public class LaporanPanel extends JPanel {
    public void setElement(){
        DefaultListModel model = new DefaultListModel();
        model.addElement("g");
        model.addElement("g");
        model.addElement("g");
        model.addElement("g");

        JList list = new JList(model);
        list.setBounds(10, 0, 350, 645);

        add(list);
        setLayout(null);
        setVisible(true);
    }
}
