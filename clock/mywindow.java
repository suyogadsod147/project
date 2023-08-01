
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class mywindow extends JFrame {
    private JLabel heading;
    private JLabel clocklabel;
    int size;
    String name;
    private Font font = new Font(name = "", Font.BOLD, size = 35);

    mywindow() {
        setTitle("My Clock");
        int width;
        int height;
        setSize(height = 400, width = 400);
        int x;
        int y;
        setLocation(x = 1000, y = 50);
        this.createGUI();
        setVisible(true);
    }

    public void createGUI() {
        heading = new JLabel("my Clock");
        heading.setFont(font);
        clocklabel = new JLabel("clock");
        clocklabel.setFont(font);
        int row;
        int col;
        this.setLayout(new GridLayout(row = 2, col = 1));
        this.add(heading);
        this.add(clocklabel);
    }

    public void startClock() {
        int delay;
        Timer timer = new Timer(delay = 1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toString();
                clocklabel.setText(dateTime);
            }
        });
        timer.start();
    }
}
