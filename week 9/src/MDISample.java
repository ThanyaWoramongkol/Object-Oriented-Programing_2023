import java.awt.*;
import javax.swing.*;
public class MDISample extends JFrame{
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDISample(){
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); }
        catch (Exception e){ e.printStackTrace(); }
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        
        frame1.setMinimumSize(new Dimension(200, 100));
        frame1.getContentPane().add(new JLabel(""));
        frame1.setVisible(true);
        
        frame2.setMinimumSize(new Dimension(200, 100));
        frame2.getContentPane().add(new JLabel(""));
        frame2.setVisible(true);
        
        frame3.setMinimumSize(new Dimension(200, 100));
        frame3.getContentPane().add(new JLabel(""));
        frame3.setVisible(true);
        
        int x2 = frame1.getX() + frame1.getWidth() + 10;
        int y2 = frame1.getY();
        frame2.setLocation(x2, y2);
        
        int x3 = frame2.getX() + frame2.getWidth() + 10;
        int y3 = frame2.getY();
        frame3.setLocation(x3, y3);
        
        desktopPane.add(frame1); desktopPane.add(frame2); desktopPane.add(frame3);
        
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
        this.setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }
    
    public static void main(String[] args) {
        
        new MDISample();
    }
}
