
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{ 
    
    Score(String name, int score){
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null); 
        
        ImageIcon il = new ImageIcon("exam.jpg");
        Image img = il.getImage(); 
        Image newImg = img.getScaledInstance(1440, 300, Image.SCALE_SMOOTH);
        
        ImageIcon finalImage = new ImageIcon(newImg);  
        
        JLabel image = new JLabel(finalImage);
        add(image);
        image.setBounds(0, 0, 1440, 300); 
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae){
        
    }
    
    public static void main(String[] args){
        new Score("User", 0); 
    }
}