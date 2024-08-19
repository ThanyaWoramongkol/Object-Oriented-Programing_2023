import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JTextField t;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    
    private String op = "", order = "";
    private double result = 0;

    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        
        t = new JTextField();
        
        b1 = new JButton("0"); b2 = new JButton("1"); b3 = new JButton("2"); b4 = new JButton("3");
        b5 = new JButton("4"); b6 = new JButton("5"); b7 = new JButton("6"); b8 = new JButton("7");
        b9 = new JButton("8"); b10 = new JButton("9"); b11 = new JButton("+"); b12 = new JButton("-");
        b13 = new JButton("x"); b14 = new JButton("/"); b15 = new JButton("c"); b16 = new JButton("=");
        
        b1.addActionListener(this); b2.addActionListener(this); b3.addActionListener(this); b4.addActionListener(this);
        b5.addActionListener(this); b6.addActionListener(this); b7.addActionListener(this);
        b8.addActionListener(this); b9.addActionListener(this); b10.addActionListener(this);
        b11.addActionListener(this); b12.addActionListener(this); b13.addActionListener(this);
        b14.addActionListener(this); b15.addActionListener(this); b16.addActionListener(this);
        
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
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(b1)){ t.setText("0"); } 
        else if (ae.getSource().equals(b2)){ order += "1"; t.setText(order);} 
        else if (ae.getSource().equals(b3)){ order += "2"; t.setText(order);}
        else if (ae.getSource().equals(b4)){ order += "3"; t.setText(order);}
        else if (ae.getSource().equals(b5)){ order += "4"; t.setText(order);}
        else if (ae.getSource().equals(b6)){ order += "5"; t.setText(order);}
        else if (ae.getSource().equals(b7)){ order += "6"; t.setText(order);}
        else if (ae.getSource().equals(b8)){ order += "7"; t.setText(order);}
        else if (ae.getSource().equals(b9)){ order += "8"; t.setText(order);}
        else if (ae.getSource().equals(b10)){ order += "9"; t.setText(order);}

        else if (ae.getSource().equals(b11)){ /* + */
            OperatorActivator(Double.parseDouble(t.getText()));
            t.setText(""); order = "";
            op = "+";
            
        }
        else if (ae.getSource().equals(b12)){ /* - */
            OperatorActivator(Double.parseDouble(t.getText()));
            t.setText(""); order = "";
            op = "-";
            
        }
        else if (ae.getSource().equals(b13)) { /* * */
            OperatorActivator(Double.parseDouble(t.getText()));
            t.setText(""); order = "";
            op = "*";
            
        }
        else if (ae.getSource().equals(b14)) { /* / */
            OperatorActivator(Double.parseDouble(t.getText()));
            t.setText(""); order = "";
            op = "/";
            
        }

        else if (ae.getSource().equals(b15)) { /* c */
            t.setText(""); order = "";
            op = "";
            result = 0.0;
        }
        else if (ae.getSource().equals(b16)) { /* = */
            OperatorActivator(Double.parseDouble(t.getText()));
            op = "="; order = "";
            t.setText(Double.toString(result));
        }
    }
    
    public void OperatorActivator(double num){
        if (this.op.equals("+")) { result += num; }
        else if (this.op.equals("-")) { result -= num; }
        else if (this.op.equals("*")) { result *= num; }
        else if (this.op.equals("/")) { result /= num; }
        else { result = num; }
    }
    
    public static void main(String[] args) {
        new CalculatorSample();
    }
}
