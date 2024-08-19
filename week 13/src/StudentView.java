
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentView implements ActionListener, WindowListener{
    private JFrame frame;
    private JPanel panel;
    private JTextField fieldID;
    private JTextField fieldName;
    private JButton deposit;
    private JButton withdraw;
    private JLabel labelID;
    private JLabel labelName;
    private JLabel labelMoney;
    private JLabel label;
    
    public StudentView(){
        frame = new JFrame();
        panel = new JPanel();
        fieldID = new JTextField();
        fieldName = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        labelID = new JLabel("ID");
        labelName = new JLabel("Name");
        labelMoney = new JLabel("Money:");
        label = new JLabel("0");
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        frame.addWindowListener(this);
        
        panel.setLayout(new GridLayout(4, 2));
        panel.add(labelID);
        panel.add(fieldID);
        panel.add(labelName);
        panel.add(fieldName);
        panel.add(labelMoney);
        panel.add(label);
        panel.add(deposit);
        panel.add(withdraw);
        
        frame.setLayout(new BorderLayout());
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void actionPerformd(ActionEvent ae){
        if (ae.getSource().equals(deposit)){
            label.setText((Integer.parseInt(label.getText()) + 100) + "");
        } else if (ae.getSource().equals(withdraw)){
            label.setText((Integer.parseInt(label.getText()) - 100) + "");
        }
    }
    
    public void windowOpened(WindowEvent we){
        try (FileInputStream fin = new FileInputStream("StudentM.dat")){
            ObjectInputStream in = new ObjectInputStream(fin);
            Student s = (Student) in.readObject();
            this.fieldName.setText(s.getName());
            this.fieldID.setText("" + s.getID());
            this.label.setText("" + s.getMoney());
            fin.close();
            in.close();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
    public void windowClosing(WindowEvent we){
        try(FileOutputStream fout = new FileOutputStream("StudentM.dat")){
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(new Student(this.fieldName.getText(), Integer.parseInt(this.fieldID.getText()), Integer.parseInt(this.label.getText())));
            fout.close();
            out.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }    
    
    public static void main(String[] args) {
        new StudentView();
    }

}
