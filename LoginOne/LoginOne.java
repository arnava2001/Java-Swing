import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LoginOne extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	static LoginOne frame; 
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LoginOne();
					frame.setUndecorated(true);
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
	public LoginOne() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 469);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 489, 432);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		java.net.URL img1 = getClass().getResource("1.jpg");
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(30, 36, 459, 410);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(489, 0, 347, 498);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 
			}
		});
		btnX.setBackground(Color.WHITE);
		btnX.setForeground(Color.RED);
		btnX.setBounds(265, 0, 47, 27);
		btnX.setOpaque(true);
		btnX.setFocusPainted(false);
		btnX.setBorderPainted(false);
		panel_1.add(btnX);
		
		JButton btnX_1 = new JButton("-");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setState(Frame.ICONIFIED);
			}
		});
		btnX_1.setOpaque(true);
		btnX_1.setForeground(Color.RED);
		btnX_1.setFocusPainted(false);
		btnX_1.setBorderPainted(false);
		btnX_1.setBackground(Color.WHITE);
		btnX_1.setBounds(231, 0, 47, 27);
		panel_1.add(btnX_1);
		
		JLabel label = new JLabel("");
		java.net.URL imgLogo = getClass().getResource("bb65394d021f6f00e1ee634e9a8da16e.jpg"); 
		ImageIcon startIcon = new ImageIcon(imgLogo); 
		Image resizedLogo = getScaledImage(startIcon.getImage(), 100, 100); 
		label.setIcon(new ImageIcon(resizedLogo));
		label.setBounds(116, 0, 246, 174);
		panel_1.add(label);
		
		JTextArea txtrUsername= new JTextArea();
		txtrUsername.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtrUsername.getText().equals("Username"))
				{
					txtrUsername.setText(""); 
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtrUsername.getText().equals(""))
				{
					txtrUsername.setText("Username"); 
				}
			}
		});
		txtrUsername.setWrapStyleWord(true);
		txtrUsername.setText("Username");
		txtrUsername.setLineWrap(true);
		txtrUsername.setForeground(Color.GRAY);
		txtrUsername.setFont(new Font("Berlin Sans FB", Font.PLAIN, 15));
		txtrUsername.setBackground(Color.WHITE);
		txtrUsername.setBounds(29, 144, 296, 40);
		panel_1.add(txtrUsername);
		
		passwordField = new JPasswordField("Password");
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(passwordField.getText().equals("Password"))
				{
					passwordField.setText(""); 
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(passwordField.getText().equals(""))
				{
					passwordField.setText("Password"); 
				}
			}
		});
		passwordField.setForeground(Color.GRAY);
		passwordField.setBounds(29, 200, 97, 20);
		passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		passwordField.setOpaque(true);
		panel_1.add(passwordField);
		
		JButton btnLogIn = new JButton("LOG IN");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogIn.setOpaque(true);
		btnLogIn.setForeground(Color.WHITE);
		btnLogIn.setFocusPainted(false);
		btnLogIn.setBorderPainted(false);
		btnLogIn.setBackground(Color.ORANGE);
		btnLogIn.setBounds(78, 262, 148, 57);
		panel_1.add(btnLogIn);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setOpaque(true);
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnRegister.setFocusPainted(false);
		btnRegister.setBorderPainted(false);
		btnRegister.setBackground(Color.ORANGE);
		btnRegister.setBounds(78, 338, 148, 57);
		panel_1.add(btnRegister);
	}
	
	private Image getScaledImage(Image srcImg, int w, int h){
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	}
}
