import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test1 window = new test1();
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
	public test1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1078, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(153, 58, 293, 57);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(630, 58, 293, 57);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(381, 238, 291, 49);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception f) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(153, 163, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception f) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}	
			}
		});
		btnNewButton_1.setBounds(349, 163, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1*num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception f) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}	
			}
		});
		btnNewButton_2.setBounds(630, 163, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					
					ans=num1/num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception f) {
						
						JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}	
			}
		});
		btnNewButton_3.setBounds(826, 163, 97, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("The Answer is");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(262, 253, 124, 16);
		frame.getContentPane().add(lblNewLabel);
	}

}