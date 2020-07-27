import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	boolean isXTurn = true; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel gameScreen = new JPanel();
		gameScreen.setBackground(Color.ORANGE);
		contentPane.add(gameScreen, "gameScr");
		gameScreen.setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setOpaque(true);
		btn1.setFocusPainted(false);
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn1.setBounds(0, 63, 145, 104);
		gameScreen.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setOpaque(true);
		btn2.setFocusPainted(false);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn2.setBackground(Color.DARK_GRAY);
		btn2.setBounds(145, 63, 145, 104);
		gameScreen.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFocusPainted(false);
		btn3.setOpaque(true);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn3.setBackground(Color.DARK_GRAY);
		btn3.setBounds(289, 63, 145, 104);
		gameScreen.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setOpaque(true);
		btn4.setFocusPainted(false);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn4.setBackground(Color.DARK_GRAY);
		btn4.setBounds(0, 166, 145, 104);
		gameScreen.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setOpaque(true);
		btn5.setFocusPainted(false);
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn5.setBackground(Color.DARK_GRAY);
		btn5.setBounds(145, 166, 145, 104);
		gameScreen.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setOpaque(true);
		btn6.setFocusPainted(false);
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn6.setBackground(Color.DARK_GRAY);
		btn6.setBounds(289, 166, 145, 104);
		gameScreen.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setOpaque(true);
		btn7.setFocusPainted(false);
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn7.setBackground(Color.DARK_GRAY);
		btn7.setBounds(0, 269, 145, 104);
		gameScreen.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setOpaque(true);
		btn8.setFocusPainted(false);
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn8.setBackground(Color.DARK_GRAY);
		btn8.setBounds(145, 269, 145, 104);
		gameScreen.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setOpaque(true);
		btn9.setFocusPainted(false);
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Dialog", Font.PLAIN, 68));
		btn9.setBackground(Color.DARK_GRAY);
		btn9.setBounds(289, 269, 145, 104);
		gameScreen.add(btn9);
		
		JPanel endScreen = new JPanel();
		contentPane.add(endScreen, "endScr");
		
		JButton mat[][] = new JButton[3][3];
		mat[0][0] = btn1; 		
		mat[0][1] = btn2; 
		mat[0][2] = btn3; 
		mat[1][0] = btn4; 
		mat[1][1] = btn5;
		mat[1][2] = btn6; 
		mat[2][0] = btn7; 
		mat[2][1] = btn8;
		mat[2][2] = btn9; 
		
		JLabel lblCurrentTurnX = new JLabel("Current Turn: X");
		lblCurrentTurnX.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentTurnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrentTurnX.setBounds(25, 11, 375, 41);
		gameScreen.add(lblCurrentTurnX);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn1.getText().equals(""))
				{
					btn1.setText("X");
				}
				else if(!isXTurn && btn1.getText().equals(""))
				{
					btn1.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn2.getText().equals(""))
				{
					btn2.setText("X");
				}
				else if(!isXTurn && btn2.getText().equals(""))
				{
					btn2.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn3.getText().equals(""))
				{
					btn3.setText("X");
				}
				else if(!isXTurn && btn3.getText().equals(""))
				{
					btn3.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn4.getText().equals(""))
				{
					btn4.setText("X");
				}
				else if(!isXTurn && btn4.getText().equals(""))
				{
					btn4.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn5.getText().equals(""))
				{
					btn5.setText("X");
				}
				else if(!isXTurn && btn5.getText().equals(""))
				{
					btn5.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn6.getText().equals(""))
				{
					btn6.setText("X");
				}
				else if(!isXTurn && btn6.getText().equals(""))
				{
					btn6.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn7.getText().equals(""))
				{
					btn7.setText("X");
				}
				else if(!isXTurn && btn7.getText().equals(""))
				{
					btn7.setText("O");
				}
				
				String[] s = gameOver(mat);
				
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else	
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn8.getText().equals(""))
				{
					btn8.setText("X");
				}
				else if(!isXTurn && btn8.getText().equals(""))
				{
					btn8.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isXTurn && btn9.getText().equals(""))
				{
					btn9.setText("X");
				}
				else if(!isXTurn && btn9.getText().equals(""))
				{
					btn9.setText("O");
				}
				String[] s = gameOver(mat);
				if(s[0].equals("GAME_OVER"))
				{
					lblCurrentTurnX.setText("GAME OVER, " + s[1] + " wins");
				}
				else if(isTie(mat))
					lblCurrentTurnX.setText("The Game is a Tie!");
				else
				{
					isXTurn = !isXTurn;
					if(isXTurn)
						lblCurrentTurnX.setText("Current Turn: X");
					else
						lblCurrentTurnX.setText("Current Turn: O");
				}
				
			}
		});
	}
	
	public static String[] gameOver(JButton mat[][])
	{
		if(mat[0][0].getText().equals(mat[0][1].getText()) && mat[0][0].getText().equals(mat[0][2].getText()) && !mat[0][0].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[0][0].getText(); 
			return s;
		}
		else if(mat[1][0].getText().equals(mat[1][1].getText()) && mat[1][0].getText().equals(mat[1][2].getText()) && !mat[1][0].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[1][0].getText(); 
			return s;
		}
		else if(mat[2][0].getText().equals(mat[2][1].getText()) && mat[2][0].getText().equals(mat[2][2].getText()) && !mat[2][0].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[2][0].getText(); 
			return s;
		}
		
		else if(mat[0][0].getText().equals(mat[1][0].getText()) && mat[0][0].getText().equals(mat[2][0].getText()) && !mat[0][0].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[0][0].getText(); 
			return s;
		}
		else if(mat[0][1].getText().equals(mat[1][1].getText()) && mat[0][1].getText().equals(mat[2][1].getText()) && !mat[0][1].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[0][1].getText(); 
			return s;
		}
		else if(mat[0][2].getText().equals(mat[1][2].getText()) && mat[0][2].getText().equals(mat[2][2].getText()) && !mat[0][2].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[0][2].getText(); 
			return s;
		}
		
		else if(mat[0][0].getText().equals(mat[1][1].getText()) && mat[0][0].getText().equals(mat[2][2].getText()) && !mat[0][0].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[0][0].getText(); 
			return s;
		}
		else if(mat[0][2].getText().equals(mat[1][1].getText()) && mat[0][2].getText().equals(mat[2][0].getText()) && !mat[0][2].getText().equals(""))
		{
			String[] s = new String[2];
			s[0] = "GAME_OVER";
			s[1] = mat[0][2].getText(); 
			return s;
		}
		else
		{
			String[] s = new String[2]; 
			s[0] = "NO";
			return s; 
		}
		
				
	}
	
	public static boolean isTie(JButton[][] mat)
	{
		for(int r  = 0; r<mat.length; r++)
		{
			for(int c = 0; c<mat[r].length; c++)
			{
				if(mat[r][c].getText().equals(""))
					return false; 
			}
		}
		return true; 
	}
}
