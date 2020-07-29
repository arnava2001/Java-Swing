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
	
	boolean isPlayerturn; 
	TTTEvaluator t = new TTTEvaluator('O'); 
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
		
		double ran = Math.random();
		if(ran < .5)
			isPlayerturn = false; 
		else
			isPlayerturn = true; 
		
		
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
		
		JLabel lblCurrentTurnX;
		if(isPlayerturn)
			 lblCurrentTurnX = new JLabel("Current Turn: X");
		else
			 lblCurrentTurnX = new JLabel("CPU Turn....");
		lblCurrentTurnX.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentTurnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCurrentTurnX.setBounds(25, 11, 375, 41);
		gameScreen.add(lblCurrentTurnX);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int r1 = 0; r1<mat.length; r1++)
				{
					for(int c1= 0; c1<mat[r1].length; c1++)
					{
						mat[r1][c1].setText("");
					}
				}
				isPlayerturn = true; 
				lblCurrentTurnX.setText("Current Turn: X");
			}
		});
		
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setOpaque(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBounds(327, 22, 89, 23);
		gameScreen.add(btnNewButton);
		
		if(!isPlayerturn)
		{
			char[][] converted = convert(mat); 
			Spot sp = t.returnBestMove(converted); 
			int row = sp.row;
			int col = sp.col; 
			mat[row][col].setText("O");
			isPlayerturn = true; 
			lblCurrentTurnX.setText("Player Turn");
		}
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn1.getText().equals(""))
				{
					btn1.setText("X");
					t.turn++; 
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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
				
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn2.getText().equals(""))
				{
					btn2.setText("X");
					t.turn++; 

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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
					
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn3.getText().equals(""))
				{
					btn3.setText("X");
					t.turn++; 

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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
				
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn4.getText().equals(""))
				{
					btn4.setText("X");
					t.turn++; 

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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
				
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn5.getText().equals(""))
				{
					t.turn++; 

					btn5.setText("X");
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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
				
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn6.getText().equals(""))
				{
					btn6.setText("X");
					t.turn++; 

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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
					
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn7.getText().equals(""))
				{
					btn7.setText("X");
					t.turn++; 

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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
					
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn8.getText().equals(""))
				{
					t.turn++; 

					btn8.setText("X");
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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
						isPlayerturn = true; 
						lblCurrentTurnX.setText("Player Turn"); 
					}
				}
				
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isPlayerturn && btn9.getText().equals(""))
				{
					t.turn++; 

					btn9.setText("X");
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
					isPlayerturn = false; 
					lblCurrentTurnX.setText("CPU Turn....");
					char[][] converted = convert(mat); 
					Spot sp = t.returnBestMove(converted); 
					int row = sp.row; 
					int col = sp.col; 
					mat[row][col].setText("O");
					String[] q = gameOver(mat);
					if(q[0].equals("GAME_OVER"))
					{
						lblCurrentTurnX.setText("GAME OVER, " + q[1] + " wins");
					}
					else if(isTie(mat))
						lblCurrentTurnX.setText("The Game is a Tie!");
					else
					{
					isPlayerturn = true; 
					lblCurrentTurnX.setText("Player Turn");
					}
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
	
	public static char[][] convert(JButton[][] mat)
	{
		char[][] ret = new char[3][3]; 
		for(int r = 0; r<mat.length; r++)
		{
			for(int c = 0; c<mat[r].length; c++)
			{
				if(mat[r][c].getText().equals(""))
					ret[r][c] = ' '; 
				else
					ret[r][c] = mat[r][c].getText().charAt(0); 
			}
		}
		return ret;
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
	
	public static void printMat(char[][] mat)
	{
		for(int r = 0; r<mat.length; r++)
		{
			for(int c = 0; c < mat[r].length; c++)
			{
				System.out.println(mat[r][c] + " ");
			}
			System.out.println();
		}
	}
}
