import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JPanel p;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem  mi2, mi3, mi4, msi1, msi2;
    
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI(){
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e){ e.printStackTrace(); }
        
        fr = new JFrame("SubMenuItem Demo");
        p = new JPanel();
        mb = new JMenuBar();
        m1 = new JMenu("File"); m2 = new JMenu("Edit"); m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);

        
        fr.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        
        m1.add(ms1); m1.add(mi2); m1.addSeparator();
        m1.add(mi3); m1.addSeparator(); m1.add(mi4);
        
        ms1.add(msi1); ms1.addSeparator(); ms1.add(msi2);
        
        
        frame1.getContentPane().add(new JLabel(""));
        frame1.setSize(150, 100);
        frame1.setVisible(true);
        
        frame2.getContentPane().add(new JLabel(""));
        frame2.setSize(200, 200);
        frame2.setVisible(true);
        
        frame3.getContentPane().add(new JLabel(""));
        frame3.setSize(300, 150);
        frame3.setVisible(true);
        
        int x2 = frame1.getX() + frame1.getWidth() + 10;
        int y2 = frame1.getY();
        frame2.setLocation(x2, y2);
        
        int x3 = frame2.getX() + frame2.getWidth() + 10;
        int y3 = frame2.getY();
        frame3.setLocation(x3, y3);
        
        desktopPane.add(frame1); desktopPane.add(frame2); desktopPane.add(frame3);
        
        fr.add(desktopPane);
        
        fr.setMinimumSize(new Dimension(750, 500));
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
    public static void main(String[] args) {
        new MDIFromGUI();
    }
}
