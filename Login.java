import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Login extends JFrame implements ActionListener {
    
    JButton rules, back; 
    JTextField tfname = new JTextField(); 
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 
        ImageIcon il = new ImageIcon("logo.jpg"); 

        JLabel image = new JLabel(il);
        add(image);
        image.setBounds(0, 0, 600, 500); 
        
        JLabel heading = new JLabel("Simple Minds"); 
        heading.setBounds(750, 60, 300, 45); 
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40)); 
        heading.setForeground(new Color(30, 144, 254)); 
        add(heading); 
        
        JLabel name = new JLabel("Enter your name"); 
        name.setBounds(810, 150, 300, 20); 
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18)); 
        name.setForeground(new Color(30, 144, 254)); 
        add(name); 
        
        // JTextField tfname = new JTextField(); 
        tfname.setBounds(735, 200, 300, 25); 
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 18));
        add(tfname); 
        
        JButton rules = new JButton("Rules"); 
        rules.setBounds(735, 270, 120, 25); 
        rules.setBackground(new Color(30, 144, 254)); 
        rules.setForeground(Color.WHITE); 
        rules.addActionListener(this); 
        add(rules); 
        
        JButton back = new JButton("Back"); 
        back.setBounds(915, 270, 120, 25); 
        back.setBackground(new Color(30, 144, 254)); 
        back.setForeground(Color.WHITE); 
        back.addActionListener(this); 
        add(back); 
        
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Rules")) {
            setVisible(false); 
            String name = tfname.getText(); 
            new Rules(name); 
            
            // JOptionPane.showMessageDialog(this, "Rules button clicked!");
        } else if(command.equals("Back")) {
            // JOptionPane.showMessageDialog(this, "Back button clicked!");
            setVisible(false); 
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
