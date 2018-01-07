package gui;

import javax.swing.*;
import kategori.*;

public class AkunPanel extends JPanel {
    public void setElement(){
        DefaultListModel model = new DefaultListModel();
        model.addElement("d");
        model.addElement("d");
        model.addElement("d");
        model.addElement("d");

        JList list = new JList(model);
        list.setBounds(10, 0, 350, 645);

        add(list);
        setLayout(null);
    }
}
