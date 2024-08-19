
import java.awt.*;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class JDesktop {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(50, 50, 500, 400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        JInternalFrame internalFrame1 = new JInternalFrame("", true,true,true,true);     
        internalFrame1.setSize(50,50);
        internalFrame1.setVisible(true);        

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.add(internalFrame1);
        try {
            internalFrame1.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(JDesktop.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.add(desktopPane, BorderLayout.CENTER);
        f.setVisible(true);
    }

} 