package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.SwingConstants;

public class biblioteca {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biblioteca window = new biblioteca();
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
	public biblioteca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem Login = new JMenuItem("Login");
		Login.setHorizontalAlignment(SwingConstants.RIGHT);
		Login.setPreferredSize(new Dimension(50, 26));
		menuBar.add(Login);
		
		JMenuItem Cadastro = new JMenuItem("Cadastro");
		Cadastro.setHorizontalAlignment(SwingConstants.RIGHT);
		Cadastro.setPreferredSize(new Dimension(50, 26));
		menuBar.add(Cadastro);
	}

}
