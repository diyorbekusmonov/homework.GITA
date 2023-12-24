package Lesson_12.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    private JButton equalsButton, decimalButton, deleteButton, clearButton;

    private double num1 = 0;
    private double result = 0;
    private char operator;

    public Calculator() {
        setTitle("Calculator");
        setBounds(300, 100, 350, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        inputField = new JTextField();
        inputField.setBounds(30, 20, 240, 30);
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField.setEditable(false);
        add(inputField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }

        JButton[] operatorButtons = new JButton[4];
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("x");
        divideButton = new JButton("/");

        operatorButtons[0] = addButton;
        operatorButtons[1] = subtractButton;
        operatorButtons[2] = multiplyButton;
        operatorButtons[3] = divideButton;

        equalsButton = new JButton("=");
        decimalButton = new JButton(".");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        addButton.setBounds(30, 80, 60, 40);
        subtractButton.setBounds(100, 80, 60, 40);
        multiplyButton.setBounds(170, 80, 60, 40);
        divideButton.setBounds(240, 80, 60, 40);

        equalsButton.setBounds(30, 140, 60, 40);
        decimalButton.setBounds(100, 140, 60, 40);
        deleteButton.setBounds(170, 140, 130, 40);
        clearButton.setBounds(30, 200, 200, 40);

        for (int i = 0; i < 10; i++) {
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
        }

        for (int i = 0; i < 4; i++) {
            operatorButtons[i].addActionListener(this);
            operatorButtons[i].setFont(new Font("Arial", Font.PLAIN, 20));
        }

        equalsButton.addActionListener(this);
        decimalButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(equalsButton);
        add(decimalButton);
        add(deleteButton);
        add(clearButton);

        int x = 30, y = 260, buttonWidth = 60, buttonHeight = 40;
        for (int i = 9; i >= 0; i--) {
            numberButtons[i].setBounds(x, y, buttonWidth, buttonHeight);
            add(numberButtons[i]);
            x += 70;
            if (x > 200) {
                x = 30;
                y += 60;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                inputField.setText(inputField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decimalButton) {
            inputField.setText(inputField.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '+';
            inputField.setText("");
        }

        if (e.getSource() == subtractButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '-';
            inputField.setText("");
        }

        if (e.getSource() == multiplyButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = 'x';
            inputField.setText("");
        }

        if (e.getSource() == divideButton) {
            num1 = Double.parseDouble(inputField.getText());
            operator = '/';
            inputField.setText("");
        }

        if (e.getSource() == equalsButton) {
            double num2 = Double.parseDouble(inputField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case 'x':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            inputField.setText(String.valueOf(result));
        }

        if (e.getSource() == clearButton) {
            inputField.setText("");
        }

        if (e.getSource() == deleteButton) {
            String currentText = inputField.getText();
            if (!currentText.isEmpty()) {
                inputField.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();

    }
}
