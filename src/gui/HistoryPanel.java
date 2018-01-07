package gui;

import javax.swing.*;

public class HistoryPanel extends JPanel {
    public void setElement(){
        DefaultListModel model = new DefaultListModel();
        model.addElement("f");
        model.addElement("f");
        model.addElement("f");
        model.addElement("f");

        JList list = new JList(model);
        list.setBounds(10, 0, 350, 645);

        add(list);
        setLayout(null);
    }
}
