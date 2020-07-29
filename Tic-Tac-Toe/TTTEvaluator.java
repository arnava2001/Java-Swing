import java.util.ArrayList;
import java.util.Random;

public class TTTEvaluator
{
	private char token; 
	private char oppon; 
	public int turn; 
	public TTTEvaluator(char sign)
	{
		token = sign;
		if(sign == 'X')
			oppon = 'O';
		else
			oppon ='X'; 
		turn = -1;
	}
	
	public Spot returnBestMove(char[][] s)
	{
		turn++; 
		Spot spot = new Spot(); 
		//Handle Cases where AI Can win
		
		//
		//rows
		//
		//firstRow
		if(s[0][0] == token && s[0][1] == token && s[0][2]==' ')
		{
			spot.rc(0, 2);
			return spot;
		}
		else if(s[0][1] == token && s[0][2] == token && s[0][0]==' ')
		{
			spot.rc(0, 0);
			return spot;
		}
		else if(s[0][0] == token && s[0][2] == token && s[0][1]==' ')
		{
			spot.rc(0, 1);
			return spot;
		}
		//secondRow
		else if(s[1][0] == token && s[1][1] == token && s[1][2]==' ')
		{
			spot.rc(1, 2);
			return spot;
		}
		else if(s[1][1] == token && s[1][2] == token && s[1][0]==' ')
		{
			spot.rc(1, 0);
			return spot;
		}
		else if(s[1][0] == token && s[1][2] == token && s[1][1]==' ')
		{
			spot.rc(1, 1);
			return spot;
		}
		//thirdRow
		else if(s[2][0] == token && s[2][1] == token && s[2][2]==' ')
		{
			spot.rc(2, 2);
			return spot;
		}
		else if(s[2][1] == token && s[2][2] == token && s[2][0]==' ')
		{
			spot.rc(2, 0);
			return spot;
		}
		else if(s[2][0] == token && s[2][2] == token && s[2][1]==' ')
		{
			spot.rc(2, 1);
			return spot;
		}
		//
		//Columns
		//
		//firstCol
		else if(s[0][0] == token && s[1][0] == token && s[2][0]==' ')
		{
			spot.rc(2, 0);
			return spot;
		}
		else if(s[0][0] == token && s[2][0] == token && s[1][0]==' ')
		{
			spot.rc(1, 0);
			return spot;
		}
		else if(s[2][0] == token && s[1][0] == token && s[0][0]==' ')
		{
			spot.rc(0, 0);
			return spot;
		}
		
		//secondCol
		else if(s[0][1] == token && s[1][1] == token && s[2][1]==' ')
		{
			spot.rc(2, 1);
			return spot;
		}
		else if(s[0][1] == token && s[2][1] == token && s[1][1]==' ')
		{
			spot.rc(1, 1);
			return spot;
		}
		else if(s[2][1] == token && s[1][1] == token && s[0][1]==' ')
		{
			spot.rc(0, 1);
			return spot;
		}
		//thirdCol
		else if(s[0][2] == token && s[1][2] == token && s[2][2]==' ')
		{
			spot.rc(2, 2);
			return spot;
		}
		else if(s[0][2] == token && s[2][2] == token && s[1][2]==' ')
		{
			spot.rc(1, 2);
			return spot;
		}
		else if(s[2][2] == token && s[1][2] == token && s[0][2]==' ')
		{
			spot.rc(0, 2);
			return spot;
		}
		//
		//diagonals
		//
		//negative
		else if(s[0][0] == token && s[1][1] == token && s[2][2]==' ')
		{
			spot.rc(2, 2);
			return spot;
		}
		else if(s[0][0] == token && s[2][2] == token && s[1][1]==' ')
		{
			spot.rc(1, 1);
			return spot;
		}
		else if(s[1][1] == token && s[2][2] == token && s[0][0]==' ')
		{
			spot.rc(0, 0);
			return spot;
		}
		//positive
		else if(s[0][2] == token && s[1][1] == token && s[2][0]==' ')
		{
			spot.rc(2, 0);
			return spot;
		}
		else if(s[0][2] == token && s[2][0] == token && s[1][1]==' ')
		{
			spot.rc(1, 1);
			return spot;
		}
		else if(s[1][1] == token && s[2][0] == token && s[0][2]==' ')
		{
			spot.rc(0, 0);
			return spot;
		}
		//
		//
		//Handle Cases where AI needs to prvent winning
		//
		//
	
		//
		//rows
		//
		//first Row
		else if(s[0][0] == oppon && s[0][1] == oppon && s[0][2]==' ')
		{
			spot.rc(0, 2);
			return spot;
		}
		else if(s[0][1] == oppon && s[0][2] == oppon && s[0][0]==' ')
		{
			spot.rc(0, 0);
			return spot;
		}
		else if(s[0][0] == oppon && s[0][2] == oppon && s[0][1]==' ')
		{
			spot.rc(0, 1);
			return spot;
		}
		//secondRow
		else if(s[1][0] == oppon && s[1][1] == oppon && s[1][2]==' ')
		{
			spot.rc(1, 2);
			return spot;
		}
		else if(s[1][1] == oppon && s[1][2] == oppon && s[1][0]==' ')
		{
			spot.rc(1, 0);
			return spot;
		}
		else if(s[1][0] == oppon && s[1][2] == oppon && s[1][1]==' ')
		{
			spot.rc(1, 1);
			return spot;
		}
		//thirdRow
		else if(s[2][0] == oppon && s[2][1] == oppon && s[2][2]==' ')
		{
			spot.rc(2, 2);
			return spot;
		}
		else if(s[2][1] == oppon && s[2][2] == oppon && s[2][0]==' ')
		{
			spot.rc(2, 0);
			return spot;
		}
		else if(s[2][0] == oppon && s[2][2] == oppon && s[2][1]==' ')
		{
			spot.rc(2, 1);
			return spot;
		}
		//
		//columns
		//
		//firstCol
				else if(s[0][0] == oppon && s[1][0] == oppon && s[2][0]==' ')
				{
					spot.rc(2, 0);
					return spot;
				}
				else if(s[0][0] == oppon && s[2][0] == oppon && s[1][0]==' ')
				{
					spot.rc(1, 0);
					return spot;
				}
				else if(s[2][0] == oppon && s[1][0] == oppon && s[0][0]==' ')
				{
					spot.rc(0, 0);
					return spot;
				}
				
				//secondCol
				else if(s[0][1] == oppon && s[1][1] == oppon && s[2][1]==' ')
				{
					spot.rc(2, 1);
					return spot;
				}
				else if(s[0][1] == oppon && s[2][1] == oppon && s[1][1]==' ')
				{
					spot.rc(1, 1);
					return spot;
				}
				else if(s[2][1] == oppon && s[1][1] == oppon && s[0][1]==' ')
				{
					spot.rc(0, 1);
					return spot;
				}
				//thirdCol
				else if(s[0][2] == token && s[1][2] == token && s[2][2]==' ')
				{
					spot.rc(2, 2);
					return spot;
				}
				else if(s[0][2] == oppon && s[2][2] == oppon && s[1][2]==' ')
				{
					spot.rc(1, 2);
					return spot;
				}
				else if(s[2][2] == oppon && s[1][2] == oppon && s[0][2]==' ')
				{
					spot.rc(0, 2);
					return spot;
				}
		//
		//diagonals
		//
		//negative
				else if(s[0][0] == oppon && s[1][1] == oppon && s[2][2]==' ')
				{
					spot.rc(2, 2);
					return spot;
				}
				else if(s[0][0] == oppon && s[2][2] == oppon && s[1][1]==' ')
				{
					spot.rc(1, 1);
					return spot;
				}
				else if(s[1][1] == oppon && s[2][2] == oppon && s[0][0]==' ')
				{
					spot.rc(0, 0);
					return spot;
				}
				//positive
				else if(s[0][2] == oppon && s[1][1] == oppon && s[2][0]==' ')
				{
					spot.rc(2, 0);
					return spot;
				}
				else if(s[0][2] == oppon && s[2][0] == oppon && s[1][1]==' ')
				{
					spot.rc(1, 1);
					return spot;
				}
				else if(s[1][1] == oppon && s[2][0] == oppon && s[0][2]==' ')
				{
					spot.rc(0, 0);
					return spot;
				}
		//Handle other cases
		else
		{
			if(turn == 0)
			{
				Random r = new Random(); 
				int num = r.nextInt(5);
				if(num == 0)
				{
					spot.rc(0,0);
					return spot; 
				}
				else if(num == 1)
				{
					spot.rc(0,2);
					return spot; 
				}
				else if(num == 2)
				{
					spot.rc(2,0);
					return spot; 
				}
				else if(num == 3)
				{
					spot.rc(2,2);
					return spot; 
				}
				else if(num == 4)
				{
					spot.rc(1,1);
					return spot; 
				}
			}
			else if(turn == 1)
			{
				if(s[0][0] == oppon || s[0][2] == oppon || s[2][0] == oppon || s[2][2] == oppon)
				{
					spot.rc(1, 1);
					return spot;
				}
				else
				{
					Random r = new Random(); 
					int corner  = r.nextInt(4);
					if(corner == 0)
					{
						spot.rc(0, 0);
						return spot; 
					}
					if(corner == 1)
					{
						spot.rc(2, 0);
						return spot; 
					}
					if(corner == 2)
					{
						spot.rc(0, 2);
						return spot;
					}
					if(corner ==3)
					{
						spot.rc(2, 2);
						return spot; 
					}
				}
			}
			else
			{
				int ctr = 0; 
				ArrayList<Spot> arr = new ArrayList<Spot>(); 
				for(int r = 0; r<s.length; r++)
				{
					for(int c = 0; c<s[r].length; c++)
					{
						if(s[r][c]==' ')
						{
							ctr++;
							Spot sp = new Spot(); 
							sp.row = r;
							sp.col = c; 
							arr.add(sp); 
						}
					}
				}
				Random ran = new Random();
				int ind = ran.nextInt(arr.size()); 
				spot = arr.get(ind);
				return spot; 
			}
		}
		
		return spot; 
	}
}