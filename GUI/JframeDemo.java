package JavaPrograms.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeDemo {
    public static void main(String[] args) {
        System.out.println("Jframe is used to build GUI Application");
        JFrame jFrame = new JFrame("BMI Calculator");

        //to use the default layout set setLayout to null
        jFrame.setLayout(null);
        //add size in frame
        jFrame.setSize(400 ,300);
        //set visibility
        jFrame.setVisible(true);

        JLabel userWeight = new JLabel("Enter your weight in kg");
        userWeight.setBounds(10, 40 , 200 , 40);
        jFrame.add(userWeight);

        JTextField inWeight = new JTextField("0");
        inWeight.setBounds(210 , 40 , 60, 40);
        jFrame.add(inWeight);

        JLabel userHeight = new JLabel("Enter your height in cm");
        userHeight.setBounds(10, 90 , 200 , 40);
        jFrame.add(userHeight);

        JTextField inHeight = new JTextField("0");
        inHeight.setBounds(210 , 90 , 60, 40);
        jFrame.add(inHeight);

        JLabel resLabel = new JLabel();
        resLabel.setBounds(10 , 400 , 100 , 30);
        jFrame.add(resLabel);

        JButton calcBTN = new JButton("Calculate");
        calcBTN.setBounds(10 , 200 , 100 , 30);
        calcBTN.setVisible(true);
        calcBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float w = Float.parseFloat(inWeight.getText().toString());
                float h = Float.parseFloat(inHeight.getText().toString());
                h = h/100;
                float res = w/(h*h);
                resLabel.setText(String.valueOf(res));
            }
        });
        jFrame.add(calcBTN);

    }
}
