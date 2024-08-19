import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel pan;
    private JTextArea ta;
    private JTextField tf;
    private JScrollPane scroll;
    private JButton submit, reset;
    private DateTimeFormatter time;
    
    public ChatDemo(){
        fr = new JFrame("");
        pan = new JPanel();
        ta = new JTextArea(20, 45);
        tf = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setLayout(new BorderLayout());
        ta.setEditable(false);
        pan.setLayout(new FlowLayout());
        
        scroll = new JScrollPane(ta);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        fr.add(scroll, BorderLayout.NORTH);
        fr.add(tf, BorderLayout.CENTER);
        
        pan.add(submit);
        pan.add(reset);
        
        fr.add(pan, BorderLayout.SOUTH);
        
        fr.setSize(400, 420);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource().equals(submit)){
            time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + time.format(LocalDateTime.now()) + ": " + tf.getText() + "\n");
        } else if (ae.getSource().equals(reset)){
            ta.setText("");
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e){
        try(FileInputStream fin = new FileInputStream("ChatDemo.dat");
            ObjectInputStream in = new ObjectInputStream(fin);){
            ta.setText((String) in.readObject());
        } catch (IOException | ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    @Override
    public void windowClosing(WindowEvent e){
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);){
            out.writeObject(ta.getText());
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
    
    @Override
    public void windowClosed(WindowEvent e){
    
    }
    
    @Override
    public void windowIconified(WindowEvent e){
        
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

    public static void main(String[] args) {
        new ChatDemo();
    }
}
