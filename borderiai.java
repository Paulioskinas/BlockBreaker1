package zaidimas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class borderiai extends JFrame{
    JLabel label = new JLabel("Welcome!", JLabel.CENTER);
    public borderiai(){
        
        setSize(new Dimension(200, 200));
        add(label, BorderLayout.CENTER);
        
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
        setVisible(true);

    }
    public static void main(String[] args) {
        new borderiai();
    }

} 