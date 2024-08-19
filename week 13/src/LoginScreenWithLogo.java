import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreenWithLogo {

    public LoginScreenWithLogo() {
        JFrame frame = new JFrame("Login");

        // Using GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(4, 2));
        JLabel logoLabelGrid = new JLabel(new ImageIcon("logo.png"));
        JLabel usernameLabelGrid = new JLabel("Username:");
        JTextField usernameFieldGrid = new JTextField(15);
        JLabel passwordLabelGrid = new JLabel("Password:");
        JPasswordField passwordFieldGrid = new JPasswordField(15);
        JButton loginButtonGrid = new JButton("Login");
        loginButtonGrid.addActionListener(e -> {
            String username = usernameFieldGrid.getText();
            char[] password = passwordFieldGrid.getPassword();
            System.out.println("Username: " + username);
            System.out.println("Password: " + new String(password));
        });
        gridPanel.add(logoLabelGrid);
        gridPanel.add(new JLabel()); // Empty label for layout purposes
        gridPanel.add(usernameLabelGrid);
        gridPanel.add(usernameFieldGrid);
        gridPanel.add(passwordLabelGrid);
        gridPanel.add(passwordFieldGrid);
        gridPanel.add(new JLabel()); // Empty label for layout purposes
        gridPanel.add(loginButtonGrid);

        // Using FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        JLabel logoLabelFlow = new JLabel(new ImageIcon("logo.png"));
        flowPanel.add(logoLabelFlow);
        flowPanel.add(new JLabel("Username:"));
        flowPanel.add(new JTextField(15));
        flowPanel.add(new JLabel("Password:"));
        flowPanel.add(new JPasswordField(15));
        JButton flowLoginButton = new JButton("Login");
        flowLoginButton.addActionListener(e -> {
            // Login logic here
        });
        flowPanel.add(flowLoginButton);

        // Using BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout(5, 5));
        JLabel logoLabelBorder = new JLabel(new ImageIcon("logo.png"));
        borderPanel.add(logoLabelBorder, BorderLayout.NORTH);
        JPanel fieldsPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        fieldsPanel.add(new JTextField(15));
        fieldsPanel.add(new JPasswordField(15));
        borderPanel.add(fieldsPanel, BorderLayout.CENTER);
        JButton borderLoginButton = new JButton("Login");
        borderLoginButton.addActionListener(e -> {
            // Login logic here
        });
        borderPanel.add(borderLoginButton, BorderLayout.SOUTH);

        // Add panels to frame
        frame.add(gridPanel, BorderLayout.NORTH);
        frame.add(flowPanel, BorderLayout.CENTER);
        frame.add(borderPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginScreenWithLogo::new);
    }
}
