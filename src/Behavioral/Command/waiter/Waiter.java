package Behavioral.Command.waiter;

import Behavioral.Command.cook.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Waiter {
    public JTextArea textField;
    private OrderHistory history = new OrderHistory();

    public void init(){
        JFrame frame = new JFrame("Hello, do you want something to order?");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlC = new JButton("Boiled food");
        JButton ctrlX = new JButton("Baked food");
        JButton ctrlV = new JButton("Fried food");
        JButton ctrlZ = new JButton("Cancel my order");
        Waiter waiter = this;
        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCook(new BoilCook(waiter));
            }
        });
        ctrlX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCook(new BakeCook(waiter));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCook(new FryCook(waiter));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCook(Cook cook) {
        if (cook.cook()) {
            history.push(cook);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Cook cook = history.pop();
        if (cook != null) {
            cook.orderСancellation();
        }
    }
}
