package JavaPrograms.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CalcGame {
    public static JLabel nameCandidate = new JLabel();
    public static JLabel gameLevel = new JLabel();

    public static void main(String[] args) {
        GameGUI();
    }

    public static void GameGUI() {
        JFrame jFrame = new JFrame("Calc Game");
        jFrame.setLayout(new BorderLayout()); // Use BorderLayout for JFrame

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout); // This panel uses CardLayout

        // Details side
        JPanel detailSide = new JPanel();
        detailSide.setLayout(null); // Use null layout for manual positioning

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setBounds(10, 10, 50, 30); // Set bounds for the label
        detailSide.add(nameLabel);

        JTextField nameInput = new JTextField();
        nameInput.setBounds(60, 10, 100, 30);
        detailSide.add(nameInput);

        String[] levelArray = {"Beginner", "Intermediate", "Expert"};

        JComboBox<String> levelSelector = new JComboBox<>(levelArray);
        levelSelector.setBounds(270, 10, 100, 30);
        detailSide.add(levelSelector);

        JButton startBtn = new JButton("Start");
        startBtn.setBounds(150, 100, 100, 30);
        detailSide.add(startBtn);

        //quiz screen
        JPanel quizScreen = new JPanel();
        quizScreen.setLayout(null);

        JLabel nameLabelQuiz = new JLabel("Name: ");
        nameLabelQuiz.setBounds(10, 10, 50, 30); // Set bounds for the label
        quizScreen.add(nameLabelQuiz);

        nameCandidate.setBounds(60, 10, 100, 30); // Set bounds for the label
        quizScreen.add(nameCandidate);

        JLabel levelLabel = new JLabel("Level: ");
        levelLabel.setBounds(210, 10, 50, 30); // Set bounds for the label
        quizScreen.add(levelLabel);

        gameLevel.setBounds(260, 10, 100, 30);
        quizScreen.add(gameLevel);

        //screen add management
        cardPanel.add(detailSide, "first");
        cardPanel.add(quizScreen, "second");
        cardLayout.show(cardPanel, "first");

        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameCandidate.setText(nameInput.getText());
                gameLevel.setText((String) levelSelector.getSelectedItem());
                cardLayout.show(cardPanel, "second");

                //game parts
                char[] opr = {'+', '-'};
                Random random = new Random();

                //for beginner
                if (gameLevel.getText().equals("Beginner")) {
                    JLabel t1 = new JLabel(String.valueOf(random.nextInt(99)));
                    t1.setBounds(130, 40,100,30);
                    quizScreen.add(t1);

                    int iOprIndex = random.nextInt(2);
                    JLabel bopr = new JLabel(String.valueOf(opr[iOprIndex]));
                    bopr.setBounds(160 , 40,50,30);
                    quizScreen.add(bopr);

                    JLabel t2 = new JLabel(String.valueOf(random.nextInt(99)));
                    t2.setBounds(190, 40,100,30);
                    quizScreen.add(t2);

                    JTextField ansB = new JTextField();
                    ansB.setBounds(160 , 80,50,30);
                    quizScreen.add(ansB);

                    JButton ansBtnB = new JButton("Next");
                    ansBtnB.setBounds(140 , 120,100,30);
                    quizScreen.add(ansBtnB);
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int ansBCheck = 0;
                    String charOpr = bopr.getText();

//                    switch (bopr.getText()) {
//                        case '+':
//                            ansBCheck = num1 + num2;
//                            break;
//                        case '-':
//                            ansBCheck = num1 - num2;
//                            break;
//                        // You can add more cases if you have more operators
//                    }

                    // You can add more beginner-specific setup here
                }
            }
        });

        jFrame.add(cardPanel, BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
    }
}
