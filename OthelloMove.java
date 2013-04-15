// OthelloMove.java
//
// ICS 23 / CSE 23 Fall 2007
// Project #2: Black and White
//
// Minor edits by Norman Jacobson, December 2007
//
// The chooseMove() method in your AI class should return an OthelloMove
// object as its result.


// The row (0..7) and column (0..7) designate a square 
// on the game board where a tile is to be placed -- a "move"
public class OthelloMove
{
  private int row;
	private int col;
	
	
	public OthelloMove(int rowOfMove, int colOfMove)
	{
		row = rowOfMove;
		col = colOfMove;
	}
	
	
	public int getRow()
	{
		return row;
	}
	
	
	public int getColumn()
	{
		return col;
	}
}
