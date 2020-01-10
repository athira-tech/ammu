package swing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class swing1 {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JRadioButton m;
	private JRadioButton f;
	private JTextArea print;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing1 window = new swing1();
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
	public swing1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel dob = new JPanel();
		frame.getContentPane().add(dob, BorderLayout.CENTER);
		dob.setLayout(null);
		
		JLabel lblJhfgk = new JLabel("user application form");
		lblJhfgk.setBounds(215, 11, 46, 14);
		dob.add(lblJhfgk);
		
		JLabel FirstName = new JLabel("firstname");
		FirstName.setBounds(27, 50, 46, 14);
		dob.add(FirstName);
		
		t1 = new JTextField();
		t1.setBounds(287, 47, 86, 20);
		dob.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String firstname=t1.getText();
				String lastname=t2.getText();
				String dob=t3.getText();
				String gender;
				if(m.isSelected())
				{
					gender="male";
				}
				else
				{
					gender="female";
				}
				String mobileno=t4.getText();
				String emailid=t5.getText();
			    print.setText("firstname "+firstname+"\n"+"lastname "+lastname+"\n"+"dob "+dob+"\n"+"gender "+gender+"\n"+"mobileno "+mobileno+"\n"+"emailid "+emailid);
			}
		});
		btnNewButton.setBounds(148, 285, 89, 23);
		dob.add(btnNewButton);
		
		print = new JTextArea();
		print.setBounds(55, 309, 356, 140);
		dob.add(print);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(27, 119, 46, -13);
		dob.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("lastname");
		lblNewLabel_2.setBounds(27, 85, 46, 23);
		dob.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("gender");
		lblNewLabel_3.setBounds(27, 163, 46, 14);
		dob.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("D.O.B");
		lblNewLabel_4.setBounds(27, 106, 46, 45);
		dob.add(lblNewLabel_4);
		
		JLabel lblMobileNo = new JLabel("mobile no");
		lblMobileNo.setBounds(27, 194, 46, 14);
		dob.add(lblMobileNo);
		
		JLabel lblEmailid = new JLabel("email-id");
		lblEmailid.setBounds(27, 222, 46, 14);
		dob.add(lblEmailid);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(287, 86, 86, 20);
		dob.add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(287, 118, 86, 20);
		dob.add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(287, 191, 86, 20);
		dob.add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(287, 219, 86, 20);
		dob.add(t5);
		
		m = new JRadioButton("M");
		m.setBounds(277, 159, 109, 23);
		dob.add(m);
		
		f = new JRadioButton("F");
		f.setBounds(380, 159, 109, 23);
		dob.add(f);
	}
}
