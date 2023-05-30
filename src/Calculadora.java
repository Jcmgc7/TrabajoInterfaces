import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		ArrayList<Integer> numer = new ArrayList<Integer>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 421);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbEtiquetaPrincipal = new JLabel("CALCULADORA");
		lbEtiquetaPrincipal.setFont(new Font("Stencil", Font.PLAIN, 17));
		lbEtiquetaPrincipal.setBounds(218, 10, 130, 43);
		contentPane.add(lbEtiquetaPrincipal);
		
		JLabel lb_resultado = new JLabel("");
		lb_resultado.setBackground(new Color(255, 255, 255));
		lb_resultado.setForeground(new Color(0, 0, 0));
		lb_resultado.setBounds(98, 45, 350, 38);
		contentPane.add(lb_resultado);
		
		JButton bt1_0 = new JButton("1");
		bt1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("1");
			}
		});
		bt1_0.setForeground(new Color(255, 255, 255));
		bt1_0.setBackground(new Color(0, 0, 0));
		bt1_0.setBounds(51, 93, 53, 32);
		contentPane.add(bt1_0);
		
		JButton bt1_1 = new JButton("4");
		bt1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("4");
			}
		});
		bt1_1.setForeground(Color.WHITE);
		bt1_1.setBackground(Color.BLACK);
		bt1_1.setBounds(51, 137, 53, 32);
		contentPane.add(bt1_1);
		
		JButton bt1_2 = new JButton("7");
		bt1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("2");
			}
		});
		bt1_2.setForeground(Color.WHITE);
		bt1_2.setBackground(Color.BLACK);
		bt1_2.setBounds(51, 179, 53, 32);
		contentPane.add(bt1_2);
		
		JButton bt1_3 = new JButton("2");
		bt1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("2");
			}
		});
		bt1_3.setForeground(Color.WHITE);
		bt1_3.setBackground(Color.BLACK);
		bt1_3.setBounds(131, 93, 53, 32);
		contentPane.add(bt1_3);
		
		JButton bt1_4 = new JButton("5");
		bt1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("5");
			}
		});
		bt1_4.setForeground(Color.WHITE);
		bt1_4.setBackground(Color.BLACK);
		bt1_4.setBounds(131, 137, 53, 32);
		contentPane.add(bt1_4);
		
		JButton bt1_5 = new JButton("8");
		bt1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("8");
			}
		});
		bt1_5.setForeground(Color.WHITE);
		bt1_5.setBackground(Color.BLACK);
		bt1_5.setBounds(131, 179, 53, 32);
		contentPane.add(bt1_5);
		
		JButton bt1_6 = new JButton("3");
		bt1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("3");
			}
		});
		bt1_6.setForeground(Color.WHITE);
		bt1_6.setBackground(Color.BLACK);
		bt1_6.setBounds(206, 93, 53, 32);
		contentPane.add(bt1_6);
		
		JButton bt1_7 = new JButton("6");
		bt1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("6");
			}
		});
		bt1_7.setForeground(Color.WHITE);
		bt1_7.setBackground(Color.BLACK);
		bt1_7.setBounds(206, 137, 53, 32);
		contentPane.add(bt1_7);
		
		JButton bt1_8 = new JButton("9");
		bt1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("9");
			}
		});
		bt1_8.setForeground(Color.WHITE);
		bt1_8.setBackground(Color.BLACK);
		bt1_8.setBounds(206, 179, 53, 32);
		contentPane.add(bt1_8);
		
		JButton bt1_9 = new JButton("+");
		bt1_9.setForeground(Color.WHITE);
		bt1_9.setBackground(Color.BLACK);
		bt1_9.setBounds(367, 93, 53, 32);
		contentPane.add(bt1_9);
		
		JButton bt1_10 = new JButton("-");
		bt1_10.setForeground(Color.WHITE);
		bt1_10.setBackground(Color.BLACK);
		bt1_10.setBounds(367, 137, 53, 32);
		contentPane.add(bt1_10);
		
		JButton btnX = new JButton("x");
		btnX.setForeground(Color.WHITE);
		btnX.setBackground(Color.BLACK);
		btnX.setBounds(367, 179, 53, 32);
		contentPane.add(btnX);
		
		JButton bt1_12 = new JButton("/");
		bt1_12.setForeground(Color.WHITE);
		bt1_12.setBackground(Color.BLACK);
		bt1_12.setBounds(367, 221, 53, 32);
		contentPane.add(bt1_12);
		
		JButton bt1_13 = new JButton("0");
		bt1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText("0");
			}
		});
		bt1_13.setForeground(Color.WHITE);
		bt1_13.setBackground(Color.BLACK);
		bt1_13.setBounds(206, 221, 53, 32);
		contentPane.add(bt1_13);
		
		JButton bt1_14 = new JButton(",");
		bt1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb_resultado.setText(",");
			}
		});
		bt1_14.setForeground(Color.WHITE);
		bt1_14.setBackground(Color.BLACK);
		bt1_14.setBounds(51, 221, 53, 32);
		contentPane.add(bt1_14);
		
		JButton bt1_15 = new JButton("=");
		bt1_15.setForeground(Color.WHITE);
		bt1_15.setBackground(Color.BLACK);
		bt1_15.setBounds(367, 263, 53, 32);
		contentPane.add(bt1_15);
		
		JButton bt1_15_1 = new JButton("<<");
		bt1_15_1.setForeground(Color.WHITE);
		bt1_15_1.setBackground(Color.BLACK);
		bt1_15_1.setBounds(449, 93, 53, 32);
		contentPane.add(bt1_15_1);
		
		
	}

}
