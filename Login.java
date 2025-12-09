import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton rulesBtn, backBtn, startBtn;
    JTextField tfName;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon raw = new ImageIcon("logo.png");
        Image scaled = raw.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        JLabel image = new JLabel(new ImageIcon(scaled));
        image.setBounds(50, 80, 300, 300);
        add(image);

        JLabel heading = new JLabel("Simple Quiz");
        heading.setBounds(420, 80, 500, 50);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        heading.setForeground(new Color(30,144,254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(420, 170, 300, 25);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        name.setForeground(new Color(30,144,254));
        add(name);

        tfName = new JTextField();
        tfName.setBounds(420, 210, 350, 30);
        tfName.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(tfName);

        rulesBtn = new JButton("Rules");
        rulesBtn.setBounds(420, 270, 150, 35);
        rulesBtn.setBackground(new Color(30,144,254));
        rulesBtn.setForeground(Color.WHITE);
        rulesBtn.addActionListener(this);
        add(rulesBtn);

        startBtn = new JButton("Start");
        startBtn.setBounds(600, 270, 150, 35);
        startBtn.setBackground(new Color(34,167,240));
        startBtn.setForeground(Color.WHITE);
        startBtn.addActionListener(this);
        add(startBtn);

        setSize(1000, 500);
        setLocation(200,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String name = tfName.getText().trim();

        if(e.getSource() == rulesBtn) {
            setVisible(false);
            new Rules(name);

        } else if(e.getSource() == startBtn) {
            setVisible(false);
            new Quiz(name);
        }
    }

    public static void main(String[] args){
        new Login();
    }
}
