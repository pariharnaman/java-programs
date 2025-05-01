import java.awt.*;
import javax.swing.*;

public class ToDoList extends JFrame {
    DefaultListModel<String> model = new DefaultListModel<>();
    JList<String> taskList = new JList<>(model);
    JTextField taskField = new JTextField();

    public ToDoList() {
        setTitle("To-Do List");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        JButton addButton = new JButton("Add");
        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        JButton removeButton = new JButton("Remove");
        add(removeButton, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                model.remove(selected);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ToDoList();
    }
}