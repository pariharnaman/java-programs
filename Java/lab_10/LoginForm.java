import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel();

        userLabel.setBounds(20, 20, 100, 25);
        passLabel.setBounds(20, 60, 100, 25);
        userField.setBounds(120, 20, 150, 25);
        passField.setBounds(120, 60, 150, 25);
        loginButton.setBounds(120, 100, 80, 30);
        messageLabel.setBounds(20, 140, 250, 25);

        loginButton.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if (user.equals("admin") && pass.equals("password")) {
                messageLabel.setText("Login Successful!");
            } else {
                messageLabel.setText("Invalid username or password.");
            }
        });

        frame.add(userLabel);
        frame.add(passLabel);
        frame.add(userField);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(messageLabel);

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
