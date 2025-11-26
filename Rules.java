import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 


public class Rules extends JFrame implements ActionListener {
    
    String name; 
    JButton back, start; 
    
    Rules(String name){
        this.name = name; 
        getContentPane().setBackground(Color.WHITE); 
        setLayout(null); 
        
        JLabel heading = new JLabel("Welcome " + name + " to simple minds"); 
        heading.setBounds(50, 20, 700, 30); 
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD, 40)); 
        heading.setForeground(new Color(30, 144, 254)); 
        add(heading); 
        
        JLabel rules = new JLabel("Welcome " + name + " to simple minds"); 
        rules.setBounds(20, 90, 700, 350); 
        rules.setFont(new Font("TAHOMA", Font.PLAIN, 18)); 
        rules.setForeground(new Color(30, 144, 254));
        rules.setText(
            "<html>"+
            "1. Peserta harus masuk menggunakan akun resmi." + "<br><br>" + 
            "2. Dilarang menyalin atau membagikan soal." + "<br><br>" +
            "3. Waktu ujian harus diikuti sesuai jadwal." + "<br><br>" +
            "4. Tidak diperbolehkan membuka aplikasi lain selama ujian." + "<br><br>" + 
            "5. Kamera dan mikrofon harus tetap aktif." + "<br><br>" +
            "6. Setiap jawaban harus dikumpulkan sebelum waktu habis." + "<br><br>" + 
            "7. Pelanggaran aturan dapat berakibat pembatalan ujian." + "<br><br>" +
            "<html>"
        ); 
        add(rules); 
        
        JButton back = new JButton("Back"); 
        back.setBounds(250, 500, 100, 30); 
        back.setBackground(new Color(30, 144, 254)); 
        back.setForeground(Color.WHITE); 
        back.addActionListener(this); 
        add(back); 
        
        JButton start = new JButton("Start"); 
        start.setBounds(400, 500, 100, 30); 
        start.setBackground(new Color(30, 144, 254)); 
        start.setForeground(Color.WHITE); 
        start.addActionListener(this); 
        add(start); 
        
        setSize(800, 650); 
        setLocation(300, 150); 
        setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("Back")) {
            setVisible(false); 
            new Login(); 
            // JOptionPane.showMessageDialog(this, "Rules button clicked!");
        } else if(command.equals("Start")) {
            // JOptionPane.showMessageDialog(this, "Back button clicked!");
            setVisible(false); 
        }
    }
    
    
    
    public static void main(String[] args){
        new Rules("User"); 
    }
}