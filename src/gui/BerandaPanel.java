package gui;
import javax.swing.*;
import java.awt.event.*;

public class BerandaPanel extends JPanel{
    public void setElement(){
        DefaultListModel model = new DefaultListModel();
        model.addElement("a");
        model.addElement("a");
        model.addElement("a");
        model.addElement("a");

        JList list = new JList(model);
        list.setBounds(10, 0, 350, 645);
        add(list);
        setLayout(null);
    }
}
