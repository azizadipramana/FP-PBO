import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

   
    Score(String name, int score, String summary) {
        setBounds(400, 150, 850, 600); 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // --- GAMBAR DAN SKOR DI KIRI ---
        ImageIcon il;
        if (score > 50) {
            il = new ImageIcon("good.jpg"); 
        } else {
            il = new ImageIcon("bad.jpg"); 
        }
        
        Image img = il.getImage();
        Image newImg = img.getScaledInstance(250, 200, Image.SCALE_SMOOTH); 
        ImageIcon finalImage = new ImageIcon(newImg);
        
        JLabel image = new JLabel(finalImage);
        image.setBounds(30, 80, 250, 200); 
        add(image);
        
        JLabel heading = new JLabel("Hasil Kuis " + name);
        heading.setBounds(30, 30, 400, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(heading);
        
        JLabel result = new JLabel("Skor Akhir: " + score);
        result.setBounds(60, 300, 300, 30);
        result.setFont(new Font("Tahoma", Font.BOLD, 24));
        result.setForeground(new Color(30, 144, 254));
        add(result);
        
        JButton again = new JButton("Main Lagi");
        again.setBounds(60, 350, 150, 40);
        again.setBackground(new Color(30, 144, 254));
        again.setForeground(Color.WHITE);
        again.addActionListener(this);
        add(again);

        // --- DAFTAR KOREKSI JAWABAN DI KANAN ---
        JLabel koreksiLabel = new JLabel("Detail Jawaban:");
        koreksiLabel.setBounds(320, 30, 200, 30);
        koreksiLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(koreksiLabel);

        JTextArea textArea = new JTextArea();
        textArea.setText(summary); 
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false); 
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        // Tambahkan ScrollPane agar bisa digulir ke bawah
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(320, 70, 480, 450);
        add(scrollPane);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
      
        String dummyLaporan = "No 1: Benar\n----------------\nNo 2: SALAH\n   Jawabanmu: int\n   Kunci: class\n----------------";
        new Score("User", 40, dummyLaporan);
    }
}
