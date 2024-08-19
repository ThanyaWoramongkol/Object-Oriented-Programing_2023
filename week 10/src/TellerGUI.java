import  java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2, p3, p4;
    private JButton b1, b2, b3;
    private JTextField f1;
    private JLabel l1, l2, l3;
    
    private Account acct;
    
    public TellerGUI() {
        acct = new Account(0, "");
        
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
        l3 = new JLabel(Double.toString(acct.getBalance()));
        f1 = new JTextField();
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
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
    
    @Override
    public void actionPerformed(ActionEvent ae){
        double a = Double.parseDouble(f1.getText());
        if (ae.getSource().equals(b1)){
            if (a >= 0){
            acct.setBalance(acct.balance + a);
            }
        } else if (ae.getSource().equals(b2)){
            if (a >= 0 && acct.balance - a >= 0){
            acct.setBalance(acct.balance - a);
            }
        }
        f1.setText(""); l3.setText(Double.toString(acct.balance));
    }
    
    public static void main(String[] args) {
        new TellerGUI();
    }
}
