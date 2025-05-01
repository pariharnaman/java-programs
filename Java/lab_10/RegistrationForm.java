import java.awt.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {
    JTextField nameField = new JTextField();
    JTextField emailField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JPasswordField confirmPassField = new JPasswordField();
    JLabel message = new JLabel();

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Password:"));
        add(passField);
        add(new JLabel("Confirm Password:"));
        add(confirmPassField);

        JButton registerButton = new JButton("Register");
        add(registerButton);
        add(message);

        registerButton.addActionListener(e -> validateForm());

        setVisible(true);
    }

    void validateForm() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String pass = new String(passField.getPassword());
        String confirm = new String(confirmPassField.getPassword());

        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
            message.setText("All fields are required.");
        } else if (!email.contains("@")) {
            message.setText("Invalid email.");
        } else if (!pass.equals(confirm)) {
            message.setText("Passwords do not match.");
        } else {
            message.setText("Registration successful!");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}