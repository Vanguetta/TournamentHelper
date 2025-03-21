package guitour;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FrameOne extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	String list_club;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOne frame = new FrameOne();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameOne() {
		//setVisible(true);
		setTitle("Tour Helper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(63, 111, 250, 129);
		contentPane.add(scrollPane);
		
		final JTextArea txtrHere = new JTextArea();
		txtrHere.setText("");
		scrollPane.setViewportView(txtrHere);
		
		JLabel lblAddTeamsHere = new JLabel("Add Teams Here!");
		lblAddTeamsHere.setFont(new Font("Monospaced", Font.BOLD, 13));
		lblAddTeamsHere.setBounds(63, 82, 137, 17);
		contentPane.add(lblAddTeamsHere);
		
		JLabel lblInf = new JLabel("* one per line");
		lblInf.setFont(new Font("Monospaced", Font.PLAIN, 12));
		lblInf.setBounds(62, 94, 108, 17);
		contentPane.add(lblInf);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				list_club=txtrHere.getText();
				//System.out.print(list_club);
				//System.out.println("Hey BRo");
				FrameTwo ft = new FrameTwo(list_club);
				ft.setVisible(true);
			}
		});
		btnEnter.setBounds(325, 213, 71, 27);
		contentPane.add(btnEnter);
		
		JLabel lblTourHelper = new JLabel("Tour Helper");
		lblTourHelper.setFont(new Font("Monospaced", Font.BOLD, 14));
		lblTourHelper.setBounds(196, 0, 96, 17);
		contentPane.add(lblTourHelper);
		
		JLabel lblTourname = new JLabel("Tour name");
		lblTourname.setFont(new Font("Monospaced", Font.BOLD, 12));
		lblTourname.setBounds(63, 26, 64, 17);
		contentPane.add(lblTourname);
		
		textField = new JTextField();
		textField.setBounds(63, 40, 154, 21);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
