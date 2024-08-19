import  java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JButton b1, b2, b3;
    private JTextField f1;
    private JLabel l1, l2, l3;
    
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        l1 = new JLabel(" Balance");
        l2 = new JLabel(" Amount");
        l3 = new JLabel("6000");
        f1 = new JTextField();
        
        p1.setLayout(new GridLayout(1, 2));
        p2.setLayout(new GridLayout(1, 2));
        p3.setLayout(new FlowLayout());
        
        p1.add(l1); p1.add(l3);
        p2.add(l2); p2.add(f1);
        p3.add(b1); p3.add(b2); p3.add(b3);

        fr.setLayout(new GridLayout(4, 1));
        fr.add(p1); fr.add(p2); fr.add(p3); fr.add(p4);
        
        fr.pack();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new TellerGUI();
    }
}
