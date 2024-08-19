import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField t;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        
        t = new JTextField();
        
        b1 = new JButton("0"); b2 = new JButton("1"); b3 = new JButton("2"); b4 = new JButton("3");
        b5 = new JButton("4"); b6 = new JButton("5"); b7 = new JButton("6"); b8 = new JButton("7");
        b9 = new JButton("8"); b10 = new JButton("9"); b11 = new JButton("+"); b12 = new JButton("-");
        b13 = new JButton("x"); b14 = new JButton("/"); b15 = new JButton("c"); b16 = new JButton("=");
        
        p.setLayout(new GridLayout(4, 4));
        p.add(b8); p.add(b9); p.add(b10); p.add(b11);
        p.add(b5); p.add(b6); p.add(b7); p.add(b12);
        p.add(b2); p.add(b3); p.add(b4); p.add(b13);
        p.add(b1); p.add(b15); p.add(b16); p.add(b14);
        
        fr.setLayout(new BorderLayout());
        fr.add(t, BorderLayout.NORTH);
        fr.add(p);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
