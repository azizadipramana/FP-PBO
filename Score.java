 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon il = new ImageIcon("bad.jpg"); 
        JLabel image = new JLabel(il);
        add(image);
        image.setBounds(0, 0, 600, 500); 
        
        JLabel heading = new JLabel("Thank You"); 
        heading.setBounds(750, 60, 300, 45); 
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40)); 
        heading.setForeground(new Color(30, 144, 254)); 
        add(heading); 
        
        JLabel result = new JLabel("Your score is " + score);
        result.setBounds(750, 200, 300, 30);
        result.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(result);
        
        JButton again = new JButton("Play Again"); 
        again.setBounds(800, 270, 150, 25); 
        again.setBackground(new Color(30, 144, 254)); 
        again.setForeground(Color.WHITE); 
        again.addActionListener(this); 
        add(again); 
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
