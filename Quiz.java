
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String question[][] = new String[10][5]; 
    String answer[][] = new String[10][2]; 
    JLabel qno, questions; 
    JRadioButton opt1, opt2, opt3, opt4; 
    ButtonGroup groupoptions; 
    
    String useranswers[][] = new String[10][1]; 
    public static int timer = 15;
    public static int ans_given = 0; 
    public static int count = 0; 
    public static int score = 0; 
    
    JButton next, lifeline, submit; 
    String username; 
    
    Quiz(String username){ 
        this.username = username; 
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
        
        qno = new JLabel(); 
        qno.setBounds(100, 330, 50, 40);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno); 
        
        questions = new JLabel(); 
        questions.setBounds(160, 330, 1000, 40);
        questions.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(questions); 
        
        question[0][0] = "Apa tipe data untuk angka desimal di Java?"; 
        question[0][1] = "int";
        question[0][2] = "double";
        question[0][3] = "char";
        question[0][4] = "boolean";
        
        question[1][0] = "Apa kata kunci untuk mendeklarasikan kelas di Java?"; 
        question[1][1] = "function";
        question[1][2] = "class";
        question[1][3] = "method";
        question[1][4] = "variable";
    
        question[2][0] = "Apa yang digunakan untuk mendeklarasikan variabel dalam Java?"; 
        question[2][1] = "define";
        question[2][2] = "var";
        question[2][3] = "let";
        question[2][4] = "int";
        
        question[3][0] = "Apa tipe data untuk menyimpan karakter tunggal di Java?"; 
        question[3][1] = "string";
        question[3][2] = "char";
        question[3][3] = "boolean";
        question[3][4] = "byte";
        
        question[4][0] = "Pernyataan berikut yang benar untuk mendeklarasikan array di Java?"; 
        question[4][1] = "int[] arr";
        question[4][2] = "array arr[]";
        question[4][3] = "list arr[]";
        question[4][4] = "new arr[]";
        
        question[5][0] = "Kata kunci untuk mendeklarasikan variabel konstan di Java?"; 
        question[5][1] = "constant";
        question[5][2] = "static";
        question[5][3] = "final";
        question[5][4] = "read only";
    
        question[6][0] = "Apa yang digunakan untuk menangani exception di Java?"; 
        question[6][1] = "catch";
        question[6][2] = "throw";
        question[6][3] = "try";
        question[6][4] = "error";
        
        question[7][0] = "Apa tipe data default untuk variabel boolean di Java?"; 
        question[7][1] = "true";
        question[7][2] = "false";
        question[7][3] = "0";
        question[7][4] = "null";
        
        question[8][0] = "Bagaimana cara mendeklarasikan metode tanpa return value di Java?"; 
        question[8][1] = "void";
        question[8][2] = "return";
        question[8][3] = "int";
        question[8][4] = "null";
        
        question[9][0] = "Apa operator yang digunakan untuk membandingkan dua nilai di Java?"; 
        question[9][1] = "=";
        question[9][2] = "==";
        question[9][3] = "!=";
        question[9][4] = "<=";
        
        answer[0][1] = "double"; 
        answer[1][1] = "class";
        answer[2][1] = "int";
        answer[3][1] = "char";
        answer[4][1] = "int[] arr";
        answer[5][1] = "final"; 
        answer[6][1] = "catch";
        answer[7][1] = "false";
        answer[8][1] = "void";
        answer[9][1] = "==";
        
        opt1 = new JRadioButton(); 
        opt1.setBounds(160, 400, 700, 35); 
        opt1.setBackground(Color.WHITE); 
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20)); 
        add(opt1); 
        
        opt2 = new JRadioButton(); 
        opt2.setBounds(160, 450, 700, 35); 
        opt2.setBackground(Color.WHITE); 
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20)); 
        add(opt2); 
        
        opt3 = new JRadioButton(); 
        opt3.setBounds(160, 500, 700, 35); 
        opt3.setBackground(Color.WHITE); 
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20)); 
        add(opt3); 
        
        opt4 = new JRadioButton(); 
        opt4.setBounds(160, 550, 700, 35); 
        opt4.setBackground(Color.WHITE); 
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20)); 
        add(opt4); 
        
        groupoptions = new ButtonGroup(); 
        groupoptions.add(opt1); 
        groupoptions.add(opt2); 
        groupoptions.add(opt3); 
        groupoptions.add(opt4); 
        
        next = new JButton("Next"); 
        next.setBounds(1100, 480, 200, 40);
        next.setFont(new Font("TAHOMA", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255)); 
        next.setForeground(Color.WHITE);
        next.addActionListener(this); 
        add(next); 
    
        lifeline = new JButton("50-50 lifeline"); 
        lifeline.setBounds(1100, 560, 200, 40);
        lifeline.setFont(new Font("TAHOMA", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255)); 
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this); 
        add(lifeline); 
        
        submit = new JButton("Submit"); 
        submit.setBounds(1100, 640, 200, 40);
        submit.setFont(new Font("TAHOMA", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255)); 
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this); 
        add(submit);  
        
        start(count); 
        
        Timer t = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timer >= 0) {
                    timer--;
                } 
                
                if (timer == 0){
                    opt1.setEnabled(true); 
                    opt2.setEnabled(true); 
                    opt3.setEnabled(true); 
                    opt4.setEnabled(true); 
                    
                    timer = 15; 
                    
                    repaint(); 
                    count++; 
                    start(count); 
                    ans_given = 1; 
                  
                    if(groupoptions.getSelection() == null){
                        useranswers[count][0] = "";
                    } else {
                        useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                    }
                    
                    if(count == 9){
                        next.setEnabled(false); 
                        submit.setEnabled(true); 
                    }
                    
                    
                    if (count == 10){
                        if(groupoptions.getSelection() == null){
                            useranswers[count][0] = "";
                        } else {
                            useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                        }
                
                        for(int i = 0; i < useranswers.length; i++){
                            if(useranswers[i][0].equals(answer[i][1])){
                                score += 10; 
                            } else {
                                score += 0;
                            }
                        }
                        setVisible(false); 
                    } else {
                        if(groupoptions.getSelection() == null){
                            useranswers[count][0] = "";
                        } else {
                            useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                        }
                        // count++; 
                        start(count); 
                    }
                                     
                                                          
                    
                } 
                
                repaint(); 
            }
        });
        t.start();

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == next){
            opt1.setEnabled(true); 
            opt2.setEnabled(true); 
            opt3.setEnabled(true); 
            opt4.setEnabled(true); 
            
            timer = 15; 
            
            repaint(); 
            count++; 
            start(count); 
            ans_given = 1; 
            
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if(count == 9){
                next.setEnabled(false); 
                submit.setEnabled(true); 
            }
            
            if (count == 10){
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for(int i = 0; i < useranswers.length; i++){
                    if(useranswers[i][0].equals(answer[i][1])){
                        score += 10; 
                    } else {
                        score += 0;
                    }
                }
                setVisible(false); 
            } else {
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                // count++; 
                start(count); 
            }
            
        } else if (ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false); 
                opt3.setEnabled(false); 
            } else {
                opt1.setEnabled(false); 
                opt4.setEnabled(false); 
            }
            lifeline.setEnabled(false); 
            
        } else if (ae.getSource() == submit){
            ans_given = 1; 
            System.out.println("Hasil : " + score); 
            new Score(username, score);
            setVisible(false); 
            
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
                
            for(int i = 0; i < useranswers.length; i++){
                if(useranswers[i][0].equals(answer[i][1])){
                    score += 10; 
                } else {
                    score += 0;
                }
            }
            
        }
    }
    
    public void paint(Graphics g){
        super.paint(g); 
        
        String time = "Time left -" + timer + "seconds";   
        g.setColor(Color.RED);
        g.setFont(new Font("TAHOMA", Font.BOLD, 25)); 
        
        if(timer >=0){
            g.drawString(time, 1000, 460); 
        } else {
            // g.drawString("Times Up!!!", 1000, 460);
        }
        
        if (ans_given == 1){
            ans_given = 0; 
        } else if (timer < 0){
            timer = 15; 
            opt1.setEnabled(true); 
            opt2.setEnabled(true); 
            opt3.setEnabled(true); 
            opt4.setEnabled(true); 
            
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            count++; 
            start(count); 
        }
        
    }
    
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". "); 
        questions.setText(question[count][0]); 
        opt1.setText(question[count][1]);
        opt1.setActionCommand(question[count][1]); 
        
        opt2.setText(question[count][2]);
        opt2.setActionCommand(question[count][2]); 
        
        opt3.setText(question[count][3]);
        opt3.setActionCommand(question[count][3]); 
        
        opt4.setText(question[count][4]);
        opt4.setActionCommand(question[count][4]); 
        
        groupoptions.clearSelection(); 
    }
    
    public static void main(String[] args){
        new Quiz("User"); 
    }
    
}
