import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnButton = new JButton("버튼");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "Hello World");
				textField.setText("Hello world");
			}
		});
		btnButton.setBackground(Color.GRAY);
		btnButton.setForeground(Color.BLACK);
		btnButton.setBounds(167, 182, 97, 23);
		frame.getContentPane().add(btnButton);
		
		JLabel lblMessage = new JLabel("메시지");
		lblMessage.setBounds(108, 61, 48, 15);
		frame.getContentPane().add(lblMessage);
		
		textField = new JTextField();
		textField.setBounds(179, 58, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
