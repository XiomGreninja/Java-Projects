package Interview.Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Main class implementing ActionListener for handling button clicks
public class Calculator implements ActionListener {
    // Declaring main components for the calculator
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, multiButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    // Setting font style and size for buttons and text field
    Font myFont = new Font("Roboto", Font.BOLD, 30);

    // Variables to hold values during calculations
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // Constructor to initialize calculator components
    Calculator() {
        // Setting up main frame for the calculator
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // Text field to display input and results
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false); // Make it non-editable for user input

        // Initializing function buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        // Adding function buttons to an array for easy handling
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multiButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        // Setting properties for each function button
        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this); // Add action listener to handle clicks
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false); // Remove focus from buttons
        }

        // Initializing number buttons 0-9
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this); // Add action listener for each number button
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        // Adding Colors
        textField.setBackground(Color.WHITE);  // Dark background for the text field
        textField.setForeground(Color.DARK_GRAY);   // Green text color

        // Set button colors for number and operator buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i].setBackground(Color.BLACK); // Black background
            numberButtons[i].setForeground(Color.WHITE); // White text
        }

        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].setBackground(Color.BLACK); // Black background
            functionButtons[i].setForeground(Color.WHITE); // White text
        }

        // Setting bounds for special buttons
        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        // Panel for arranging number and operator buttons in a grid layout
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // Grid of 4x4 with spacing
        panel.setBackground(Color.BLACK);   // Background color for the button panel

        frame.getContentPane().setBackground(Color.darkGray);  // Main frame background

        // Adding buttons to the panel in the desired order
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
        panel.add(multiButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Adding components to the main frame
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true); // Display the frame
    }

    // Main method to create an instance of the calculator
    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    // Action performed method to handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        // Handling number button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        // Handling decimal button click
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }

        // Handling operator button clicks
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText()); // Store first number
            operator = '+'; // Set operator
            textField.setText(""); // Clear text field for next input
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == multiButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        // Handling equals button click
        if (e.getSource() == equButton) {
            if (!textField.getText().isEmpty()) { // Check if the text field is not empty
                num2 = Double.parseDouble(textField.getText()); // Get second number
                // Perform operation based on selected operator
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                textField.setText(String.valueOf(result)); // Display result
                num1 = result; // Set result as num1 for continuous calculations
            } else {
                // Optional: Show warning if '=' is pressed without entering a second number
                JOptionPane.showMessageDialog(frame, "Please enter a number before pressing '='");
            }
        }

        // Handling clear button click
        if (e.getSource() == clrButton) {
            textField.setText(""); // Clear the text field
        }

        // Handling delete button click
        if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText(""); // Clear current text
            // Remove the last character
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }

        // Handling negate button click to toggle positive/negative sign
        if (e.getSource() == negButton) {
            if (!textField.getText().isEmpty()) { // Check if the text field is not empty
                double temp = Double.parseDouble(textField.getText());
                temp *= -1; // Negate the number
                textField.setText(String.valueOf(temp)); // Display negated value
            }
        }
    }
}
