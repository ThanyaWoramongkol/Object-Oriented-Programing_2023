import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JButton b1, b2, b3, b4;
    private JTextField f1, f2, f3;
    
    public CalculatorOneGUI(){
        fr = new JFrame("Calculator");
        p = new JPanel();

        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        
        b1 = new JButton("Plus");
        b2 = new JButton("Minus");
        b3 = new JButton("Times");
        b4 = new JButton("Divide");
        p.add(b1); p.add(b2); p.add(b3); p.add(b4); 
        
        fr.setLayout(new GridLayout(4, 1));
        fr.add(f1); fr.add(f2);
        fr.add(p);
        fr.add(f3);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
