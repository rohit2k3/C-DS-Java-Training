package JavaPrograms.GUI;

import javax.swing.*;
import java.util.Random;

public class CalcGame {
    public static void main(String[] args) {
        GUiGame();
    }
    public static void GUiGame(){
        JFrame jFrame = new JFrame("Calc Game");
        jFrame.setLayout(null);
        Random random = new Random();

        Timer timeCounter = new Timer();
        char[] opr = {'/' , '-' , '+' , '*'};

        JLabel firstNum = new JLabel(String.valueOf(random.nextInt(9999)));
        firstNum.setBounds(30 ,10 ,50,30);
        jFrame.add(firstNum);

        int oprIndex = random.nextInt(3);

        JLabel oprLabel = new JLabel(String.valueOf(opr[oprIndex]));

        oprLabel.setBounds(90 ,10 ,20,30);
        jFrame.add(oprLabel);

        JLabel secondLabel = new JLabel(String.valueOf(random.nextInt(9999)));
        secondLabel.setBounds(120 ,10 ,50,30);
        jFrame.add(secondLabel);

        JTextField ansInput = new JTextField();
        ansInput.setBounds(70 , 40 ,50 , 30 );
        jFrame.add(ansInput);

        JButton ansSubmit = new JButton("Next");
        ansSubmit.setBounds(50 , 90 , 100 , 30);
        jFrame.add(ansSubmit);





        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
    }
}
