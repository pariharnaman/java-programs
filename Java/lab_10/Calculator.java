import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    JTextField display;
    double num1 = 0, num2 = 0;
    String operator = "";

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "=", "C", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            panel.add(button);
            button.addActionListener(this::process);
        }

        add(panel);
        setVisible(true);
    }

    private void process(ActionEvent e) {
        String cmd = e.getActionCommand();
        if ("0123456789".contains(cmd)) {
            display.setText(display.getText() + cmd);
        } else if ("+-*/".contains(cmd)) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            display.setText("");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double result = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num2 != 0 ? num1 / num2 : 0;
                default -> 0;
            };
            display.setText(String.valueOf(result));
        } else if (cmd.equals("C")) {
            display.setText("");
            num1 = num2 = 0;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}