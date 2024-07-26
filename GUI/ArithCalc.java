package JavaPrograms.GUI;

import javax.swing.*;
import java.awt.*;

public class ArithCalc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(420, 550);
        frame.setLayout(null);

        JTextField display = new JTextField();
        display.setBounds(50, 25, 300, 50);
        display.setEditable(false);
        frame.add(display);

        JButton[] numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFocusable(false);
            int finalI = i;
            numberButtons[i].addActionListener(e -> display.setText(display.getText().concat(String.valueOf(finalI))));
        }

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton decButton = new JButton(".");
        JButton equButton = new JButton("=");
        JButton delButton = new JButton("Del");
        JButton clrButton = new JButton("Clr");


        JPanel panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);

        final double[] num1 = {0};
        final double[] num2 = {0};
        final double[] result = {0};
        final char[] operator = new char[1];

        addButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(display.getText());
            operator[0] = '+';
            display.setText("");
        });

        subButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(display.getText());
            operator[0] = '-';
            display.setText("");
        });

        mulButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(display.getText());
            operator[0] = '*';
            display.setText("");
        });

        divButton.addActionListener(e -> {
            num1[0] = Double.parseDouble(display.getText());
            operator[0] = '/';
            display.setText("");
        });

        equButton.addActionListener(e -> {
            num2[0] = Double.parseDouble(display.getText());

            switch (operator[0]) {
                case '+':
                    result[0] = num1[0] + num2[0];
                    break;
                case '-':
                    result[0] = num1[0] - num2[0];
                    break;
                case '*':
                    result[0] = num1[0] * num2[0];
                    break;
                case '/':
                    result[0] = num1[0] / num2[0];
                    break;
            }
            display.setText(String.valueOf(result[0]));
            num1[0] = result[0];
        });

        clrButton.addActionListener(e -> display.setText(""));

        delButton.addActionListener(e -> {
            String str = display.getText();
            display.setText("");
            for (int i = 0; i < str.length() - 1; i++) {
                display.setText(display.getText() + str.charAt(i));
            }
        });
    }
}
