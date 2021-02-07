import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View extends JFrame {
    // Set variables to private
    private static final long serialVersionUID = 1L;
    private JTextField num1 = new JTextField();
    private JTextField num2 = new JTextField();
    private JButton addButton = new JButton("+");
    private JButton minusButton = new JButton("-");
    private JButton timesButton = new JButton("*");
    private JButton divideButton = new JButton("/");
    private JButton clearButton = new JButton("Clear");
    private JLabel result = new JLabel("0");
    private JLabel windowTitle = new JLabel("MVC Calculator");

    //Builds the GUI
    View() {
		num1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		num1.setBackground(Color.LIGHT_GRAY);
		num1.setHorizontalAlignment(SwingConstants.TRAILING);
		num1.setBounds(10, 52, 224, 29);
		this.getContentPane().add(num1);
		
		num2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		num2.setBackground(Color.LIGHT_GRAY);
		num2.setHorizontalAlignment(SwingConstants.TRAILING);
		num2.setBounds(10, 85, 224, 29);
        this.getContentPane().add(num2);
        
		result.setFont(new Font("Tahoma", Font.BOLD, 30));
		result.setForeground(Color.WHITE);
		result.setHorizontalAlignment(SwingConstants.TRAILING);
		result.setBounds(10, 125, 224, 45);
        this.getContentPane().add(result);
        
        windowTitle.setForeground(Color.WHITE);
		windowTitle.setHorizontalAlignment(SwingConstants.CENTER);
		windowTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		windowTitle.setBounds(10, 11, 224, 30);
        this.getContentPane().add(windowTitle);
        
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		addButton.setBackground(SystemColor.activeCaption);
		addButton.setBounds(10, 181, 110, 23);
		this.getContentPane().add(addButton);
		
		minusButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		minusButton.setBackground(SystemColor.activeCaption);
		minusButton.setBounds(124, 181, 110, 23);
		this.getContentPane().add(minusButton);
		
		timesButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		timesButton.setBackground(SystemColor.activeCaption);
		timesButton.setBounds(10, 210, 110, 23);
		this.getContentPane().add(timesButton);
		
		divideButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		divideButton.setBackground(SystemColor.activeCaption);
		divideButton.setBounds(124, 210, 110, 23);
		this.getContentPane().add(divideButton);
		
		clearButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clearButton.setBackground(SystemColor.activeCaption);
		clearButton.setBounds(10, 240, 224, 37);
		this.getContentPane().add(clearButton);

        this.setTitle("MVC Calculator");
		this.setResizable(false);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		this.getContentPane().setForeground(Color.WHITE);
		this.setBounds(100, 100, 260, 325);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
        this.setVisible(true);
    }

    public void setNum1(int num) {
        num1.setText(Integer.toString(num));
    }
    public int getNum1() {
        return Integer.parseInt(num1.getText());
    }
    public void setNum2(int num) {
        num2.setText(Integer.toString(num));
    }
    public int getNum2() {
        return Integer.parseInt(num2.getText());
    }
    public void setResult(int num) {
        result.setText(Integer.toString(num));
    }

    void calculateNumbers(ActionListener listener) {
        addButton.addActionListener(listener);
        minusButton.addActionListener(listener);
        timesButton.addActionListener(listener);
        divideButton.addActionListener(listener);
        clearButton.addActionListener(listener);
    }

    void errorMessage(String message) {
        JOptionPane.showMessageDialog(
            this,
            message,
            "Error",
            JOptionPane.ERROR_MESSAGE);
    }

	public void clearAll() {
        setNum1(0);
        setNum2(0);
        setResult(0);
	}
}