import java.util.*;

public class TradeSalarySquare extends BlueSquare
{
    SalaryCardsDeck salaries = new SalaryCardsDeck();
    PlayerList players = new PlayerList();
    Scanner reader = new Scanner( System.in );
    public void getAction( Player i )
    {
        System.out.println ( "Who would you like to trade salaries with?" );
        
        for ( int j = 0; j < players.getSize(); j++ )
        {
            System.out.println( "Player " + (j + 1) + ": " + players.getPlayer(j).getSalaryCard().getValue() );
        }
        
        System.out.println( "Enter the number of the player you would like to trade with" );
        salaries.tradeSalaries( i, players.getPlayer( reader.nextInt() - 1 ) );
    }
    
    public String toString()
    {
        return "You just traded salaries!";
    }
}
