import java.awt.*;
import javax.swing.*;

public class StopWatch extends JFrame {
    private int time = 0;
    private Timer timer;
    private JLabel label;

    public StopWatch() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        label = new JLabel("0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));
        add(label, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");
        JButton reset = new JButton("Reset");
        panel.add(start);
        panel.add(stop);
        panel.add(reset);
        add(panel, BorderLayout.SOUTH);

        timer = new Timer(1000, e -> {
            time++;
            label.setText(String.valueOf(time));
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());
        reset.addActionListener(e -> {
            timer.stop();
            time = 0;
            label.setText("0");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new StopWatch();
    }
}
