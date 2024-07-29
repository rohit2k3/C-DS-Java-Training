package JavaPrograms.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvertor {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Currency Convertor");
        jFrame.setLayout(null);


        JRadioButton b1 = new JRadioButton("USD to INR");
        b1.setBounds(10,10,100,30);
        JRadioButton b2 = new JRadioButton("INR to USD");
        b2.setBounds(110,10,100,30);
        jFrame.add(b1);
        jFrame.add(b2);


        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        JLabel inputLabel = new JLabel("User Amount");
        inputLabel.setBounds(15 , 40 , 100 ,30);
        jFrame.add(inputLabel);

        JTextField inputData = new JTextField();
        inputData.setBounds(115 , 40 , 100 , 30);
        jFrame.add(inputData);

        JLabel inputLabelUser = new JLabel("User Amount");
        inputLabelUser.setBounds(220 , 40 , 100 ,30);
        jFrame.add(inputLabelUser);
        inputLabelUser.setVisible(false);

        JTextField inputDataUser = new JTextField();
        inputDataUser.setBounds(330 , 40 , 100 , 30);
        jFrame.add(inputDataUser);
        inputDataUser.setVisible(false);






//        JTextField inputPrice = new JTextField();
//        inputPrice.setBounds(220 , 10 , 100 , 30);
//        jFrame.add(inputData);

        JLabel ansData = new JLabel("Fill and click Convert");
        ansData.setBounds(10 , 70 , 200 ,30 );
        ansData.setVisible(true);
        jFrame.add(ansData);

        JButton submitBTn = new JButton("Convert");
        submitBTn.setBounds(40 , 100 , 100 , 30);
        submitBTn.setVisible(true);
        submitBTn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!b1.isSelected() && !b2.isSelected()|| inputData.getText().isEmpty()){
                    ansData.setForeground(Color.red);
                    ansData.setText("Please fill the Data");
                    return;
                }

                try{
                    float USD_price = 87.5f;
                    float ans = 0f;
                    if (b1.isSelected()){
                        float userValue = Float.parseFloat(inputData.getText());
                        ans = userValue*USD_price;
                    } else if (b2.isSelected()) {
                        float userValue = Float.parseFloat(inputData.getText());
                        ans = userValue/USD_price;
                    }
                    ansData.setForeground(Color.green);
                    ansData.setText("Your answer is "+ ans);
                } catch (NumberFormatException b){
                    ansData.setForeground(Color.red);
                    ansData.setText("Error: "+ b.getMessage());

                }


            }
        });
        jFrame.add(submitBTn);

        jFrame.setSize(600 , 400);
        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }
}
